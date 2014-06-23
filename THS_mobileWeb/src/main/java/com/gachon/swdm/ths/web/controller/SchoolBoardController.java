package com.gachon.swdm.ths.web.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gachon.swdm.ths.web.bean.User;
import com.gachon.swdm.ths.web.bean.board.SchoolBoard;
import com.gachon.swdm.ths.web.bean.board.SchoolBoardReply;
import com.gachon.swdm.ths.web.bean.board.SchoolBoardReplyWithPage;
import com.gachon.swdm.ths.web.service.database.SchoolBoardReplyService;
import com.gachon.swdm.ths.web.service.database.SchoolBoardService;
import com.gachon.swdm.ths.web.util.PageCalculator;

@Controller
@SessionAttributes("member")
public class SchoolBoardController {

	private static final Logger logger = LoggerFactory
			.getLogger(SchoolBoardController.class);


	@Autowired
	@Qualifier("schoolBoardService")
	private SchoolBoardService schoolBoardService;

	@Autowired
	@Qualifier("schoolBoardReplyService")
	private SchoolBoardReplyService schoolBoardReplyService;

	@RequestMapping(value = "/schoolBoard.action", method = RequestMethod.GET)
	public String getSchoolNoticeList(@RequestParam(value = "type") int type,
			@RequestParam(value = "page") int page, Locale locale, Model model) {

		int totalCount;
		int recordsPerPage = 10;
		HashMap<String, Integer> result;
		HashMap<String, Integer> bundle;
		List<Integer> pageNums;

		/*if (LoginChecker.isLogined(model) != true) {
			return "login_form";
		}

		if (page < 0) {
			return "error";
		}
*/
		
		totalCount = schoolBoardService.getCount(type);

		result = PageCalculator.calculateMetaNumber(page, totalCount);

		bundle = new HashMap<String, Integer>();
		bundle.put("type", type);
		bundle.put("start", page * recordsPerPage);
		bundle.put("end", recordsPerPage);

		List<SchoolBoard> schoolBoard = schoolBoardService
				.getSchoolBoardList(bundle);

		pageNums = new ArrayList<Integer>();
		int end = result.get("endPage");
		for (int i = result.get("startPage"); i <= end; i++)
			pageNums.add(i);

		model.addAttribute("boardList", schoolBoard);
		model.addAttribute("pageNums", pageNums);
		model.addAttribute("page", page);
		model.addAttribute("type", type);
		model.addAttribute("more", result.get("more"));

		return "schoolNotice/schoolBoard";
	}

	@RequestMapping(value = "/schoolBoardWrite.action", method = RequestMethod.GET)
	public String writeSchoolNotice_form(@RequestParam(value = "type") int type,
			@RequestParam(value = "page") int page, Locale locale, Model model) {

		SchoolBoard schoolBoard = new SchoolBoard();
		schoolBoard.setType(type);

		//System.out.println("type: "+type);//
		model.addAttribute("schoolBoard", schoolBoard);
		model.addAttribute("page", page);
		model.addAttribute("type", type);

		return "schoolNotice/schoolBoard_form";
	}

	@RequestMapping(value = "/schoolBoardWrite.action", method = RequestMethod.POST)
	public String writeSchoolNotice(
			@ModelAttribute("schoolBoard") SchoolBoard schoolBoard,
			HttpServletRequest request, Locale locale, Model model) throws Exception {

		//
		User user = null;
		user = (User)model.asMap().get("member");
		if(user.getPosition() != 3)
		{
			return "error";
		}
				
		//This will be improved by AOP.
		//
	
		Calendar calendar = Calendar.getInstance();

		schoolBoard.setDate_written(calendar.getTimeInMillis());
		schoolBoard.setIp(request.getRemoteAddr());

		System.out.println("school board type: "+schoolBoard.getType());//
		schoolBoardService.saveSchoolBoard(schoolBoard);

		return getSchoolNoticeList(schoolBoard.getType(), 0, locale, model);
	}

	@RequestMapping(value = "/schoolBoardRead.action", method = RequestMethod.GET)
	public String readSchoolNotice(@RequestParam(value = "type") int type,
			@RequestParam(value = "date_written") long date_written,
			@RequestParam(value = "writer") String writer,
			@RequestParam(value = "page") int page, Locale locale, Model model) {
		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.put("type", type);
		hashmap.put("date_written", date_written);
		hashmap.put("id_user", writer);

		SchoolBoard record = schoolBoardService.getSchoolBoard(hashmap);
		List<SchoolBoardReply> replyList = null;

		hashmap.clear();

		hashmap.put("board_type", record.getType());
		hashmap.put("board_date", record.getDate_written());
		hashmap.put("board_writer", record.getId_writer());
		replyList = schoolBoardReplyService.getList(hashmap);
		// service is required
		/*
		 * replyList = get....
		 */

		model.addAttribute("type",type);
		model.addAttribute("record", record);
		model.addAttribute("page", page);
		model.addAttribute("schoolBoardReply", new SchoolBoardReplyWithPage());
		model.addAttribute("replyList", replyList);
		return "schoolNotice/schoolBoard_read";
	}

	@RequestMapping(value = "/schoolBoardReply.action", method = RequestMethod.POST)
	public String saveReply(
			@ModelAttribute("schoolBoardReply") SchoolBoardReplyWithPage schoolBoardReply,
			HttpServletRequest request, Locale locale, Model model) {
		Calendar c = Calendar.getInstance();
		schoolBoardReply.setIp(request.getRemoteAddr());
		schoolBoardReply.setDate_written(c.getTimeInMillis());

		schoolBoardReplyService.saveSchoolBoardReply(schoolBoardReply);
		/*
		 * schoolBoardReplyService.save(dd,d)...
		 */
		return readSchoolNotice(schoolBoardReply.getBoard_type(),
				schoolBoardReply.getBoard_date(),
				schoolBoardReply.getBoard_writer(), schoolBoardReply.getPage(),
				locale, model);
	}

}
