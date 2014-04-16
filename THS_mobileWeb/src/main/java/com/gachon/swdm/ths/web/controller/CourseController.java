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

import com.gachon.swdm.ths.web.bean.Course;
import com.gachon.swdm.ths.web.bean.Takes;
import com.gachon.swdm.ths.web.bean.board.ClassBoard;
import com.gachon.swdm.ths.web.bean.board.ClassBoardReply;
import com.gachon.swdm.ths.web.bean.board.ClassBoardReplyWithPage;
import com.gachon.swdm.ths.web.service.database.ClassBoardReplyService;
import com.gachon.swdm.ths.web.service.database.ClassBoardService;
import com.gachon.swdm.ths.web.service.database.CourseService;
import com.gachon.swdm.ths.web.service.database.DepartmentService;
import com.gachon.swdm.ths.web.service.database.TeachesService;
import com.gachon.swdm.ths.web.util.PageCalculator;

@Controller
@SessionAttributes("member")
public class CourseController {

	private static final Logger logger = LoggerFactory
			.getLogger(MainController.class);
	@Autowired
	@Qualifier("courseService")
	private CourseService courseService;
	
	@Autowired
	@Qualifier("departmentService")
	private DepartmentService departmentService;
	
	@Autowired
	@Qualifier("teachesService")
	private TeachesService teachesService;
	
	@Autowired
	@Qualifier("classBoardService")
	private ClassBoardService classBoardService;
	
	@Autowired
	@Qualifier("classBoardReplyService")
	private ClassBoardReplyService classBoardReplyService;
	
	
	@RequestMapping(value = "/classBoardRead.action", method = RequestMethod.GET)
	public String readClassBoard(@RequestParam(value="year")int year, @RequestParam(value="semester")int semester , @RequestParam(value="id_course")int id_course,
	@RequestParam(value="type")int type,@RequestParam(value="date_written")long date_written, @RequestParam(value="writer")String id_writer, @RequestParam(value = "page") int page, @RequestParam(value="id_user")String id_user, Locale locale, Model model) {


		ClassBoard queryObject = new ClassBoard(); 
		queryObject.setYear(year);
		queryObject.setSemester(semester);
		queryObject.setId_course(id_course);
		queryObject.setType(type);
		queryObject.setDate_written(date_written);
		queryObject.setId_writer(id_writer);
		
		
		System.out.println("class_board "+year);
		
		
		ClassBoard record = classBoardService.getClassBoardAndUpdateReadNum(queryObject);
		
		System.out.println("after: "+record.getYear());
		System.out.println("contents: "+record.getContents());
		List<ClassBoardReply> replyList = null;


		ClassBoardReply replyForQuery = new ClassBoardReply();
		replyForQuery.setYear(year);
		replyForQuery.setSemester(semester);
		replyForQuery.setId_course(id_course);
		replyForQuery.setBoard_type(type);
		replyForQuery.setBoard_date(date_written);
		replyForQuery.setBoard_writer(id_writer);
		replyList = classBoardReplyService.getList(replyForQuery);
		
		
		// service is required
		/*
		 * replyList = get....
		 */

		model.addAttribute("type",type);
		model.addAttribute("record", record);
		model.addAttribute("page", page);
		model.addAttribute("classBoardReply", new ClassBoardReplyWithPage());
		model.addAttribute("replyList", replyList);
		
		return "course/courseDetail/class_board_read";
	}
	
	@RequestMapping(value = "/classBoardReply.action", method = RequestMethod.POST)
	public String saveReply(
			@ModelAttribute("classBoardReply") ClassBoardReplyWithPage classBoardReply,
			HttpServletRequest request, Locale locale, Model model) {
		Calendar c = Calendar.getInstance();
		classBoardReply.setIp(request.getRemoteAddr());
		classBoardReply.setDate_written(c.getTimeInMillis());

		classBoardReplyService.saveClassBoardReply(classBoardReply);
		/*
		 * schoolBoardReplyService.save(dd,d)...
		 */
		return readClassBoard(classBoardReply.getYear(),classBoardReply.getSemester(),classBoardReply.getId_course(),classBoardReply.getBoard_type(),classBoardReply.getBoard_date(),classBoardReply.getBoard_writer(),classBoardReply.getPage(),classBoardReply.getId_writer(), locale, model);
	}
	
	@RequestMapping(value="/classBoardWrite.action", method=RequestMethod.GET)
	public String writeClassBoard_form(@RequestParam(value="year") int year, @RequestParam(value="semester")int semester, @RequestParam(value="id_course")int id_course, @RequestParam(value = "type") int type,
			@RequestParam(value = "page") int page, Locale locale, Model model)
	{
		ClassBoard classBoard = new ClassBoard();
		classBoard.setType(type);
		classBoard.setYear(year);
		classBoard.setSemester(semester);
		classBoard.setId_course(id_course);
		model.addAttribute("classBoard", classBoard);
		model.addAttribute("page",page);

		return "course/courseDetail/class_board_form";
	}
	
	@RequestMapping(value="/classBoardWrite.action", method=RequestMethod.POST)
	public String writeClassBoard(
			@ModelAttribute("classBoard") ClassBoard classBoard,
			HttpServletRequest request, Locale locale, Model model) throws Exception
	{
		Calendar calendar = Calendar.getInstance();
		
		
		classBoard.setDate_written(calendar.getTimeInMillis());
		classBoard.setIp(request.getRemoteAddr());
		
		
		model.addAttribute("classBoard", classBoard);
		
		classBoardService.saveClassBoard(classBoard);
		
		return getClassBoardList(classBoard.getYear(),classBoard.getSemester(),classBoard.getId_course(), classBoard.getId_writer(),classBoard.getType(),0,locale,model);
	}
	
	

	
	@RequestMapping(value="/classBoard.action", method= RequestMethod.GET)
	public String getClassBoardList(@RequestParam(value="year")int year, @RequestParam(value="semester")int semester , @RequestParam(value="id_course")int id_course, @RequestParam(value="id_user")String id_student,
			@RequestParam(value="type")int type,@RequestParam(value="page")int page, Locale locale, Model model)
	{
	
		List<ClassBoard> classBoardList;
		ClassBoard classBoard;
		Course course;
		int recordsPerPage=10;
		int totalCount;
		ArrayList<Integer> pageNums;
		HashMap<String, Integer>result;
		
		
		classBoard = new ClassBoard();
		pageNums = new ArrayList<Integer>();
		
		classBoard.setYear(year);
		classBoard.setSemester(semester);
		classBoard.setId_course(id_course);
		classBoard.setType(type);
		classBoard.setStart(page*recordsPerPage);
		classBoard.setEnd(recordsPerPage);
		
		classBoardList=classBoardService.getClassBoardList(classBoard);
		totalCount = classBoardService.getCount(classBoard);
		result = PageCalculator.calculateMetaNumber(page, totalCount);
	
		course = new Course();
		course.setYear(year);
		course.setSemester(semester);
		course.setId_course(id_course);
		course = courseService.getCourse(course);
		System.out.println("hashed start page"+result.get("startPage"));
		System.out.println("hashed end page"+result.get("endPage"));
		for(int i=result.get("startPage");i<=result.get("endPage");i++)
		{
			pageNums.add(i);
		}
		model.addAttribute("course",course);
		model.addAttribute("pageNums", pageNums);
		model.addAttribute("boardList",classBoardList);
		model.addAttribute("type", type);
		model.addAttribute("id_course",id_course);
		model.addAttribute("year",year);
		model.addAttribute("semester",semester);
		model.addAttribute("page",page);
		model.addAttribute("totalCount",totalCount);
		model.addAttribute("more",result.get("more"));
		model.addAttribute("id_student",id_student);
		
		return "course/courseDetail/class_board";
	}
	
	
	
	
	@RequestMapping(value="/classList.action", method = RequestMethod.GET)
	public String getClassList(@RequestParam(value="id_user")String id_user, Locale locale, Model model){
		
		//if(validate(id_user,model)==false)
			//throw new RuntimeException();//must be modified.
		
		Takes takes = new Takes();
		takes.setId_student(id_user);
		takes.setSemester(getSemester());
		takes.setYear(getYear());
		List<Course>courses = courseService.getCourseWithProfessor(takes);
		
		
		
		model.addAttribute("myCourseList", courses);
		return "course/courseDetail/classList";
	}
	
	@RequestMapping(value="/classEnterance.action")
	public String enterClass(@RequestParam(value="year")int year, @RequestParam(value="semester")int semester , @RequestParam(value="id_course")int id_course, @RequestParam(value="id_student")String id_student,
			@RequestParam(value="type")int type, Locale locale, Model model)
	{
		
		return this.getClassBoardList(year, semester, id_course, id_student, type,0, locale, model);
	}
	
	private boolean validate(Model model)
	{
		if( model.asMap().get("member")==null)
			return false;
		return true;
	}
	
	private boolean validate(String id_user,Model model)
	{
		if(validate(model)==false)
			return false;
		
		if (model.asMap().get("member").equals(id_user)==false)
			return false;
		/*
		 * check 필요...
		 */
		return true;
	}
	
	public int getYear() {
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.YEAR);
	}

	public int getSemester() {
		Calendar c = Calendar.getInstance();
		int semester;
		int month = c.get(Calendar.MONTH);

		if (2 <= month && month < 7)
			semester = 1;
		else if (8 <= month && month <= 11)
			semester = 2;
		else
			semester = 0;

		return semester;

	}
	
}


