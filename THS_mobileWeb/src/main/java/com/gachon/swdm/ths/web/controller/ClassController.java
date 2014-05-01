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
import com.gachon.swdm.ths.web.util.CurrentDateCalculator;
import com.gachon.swdm.ths.web.util.PageCalculator;



@Controller
@SessionAttributes("member")
public class ClassController {


	private static final Logger logger = LoggerFactory
			.getLogger(ClassController.class);
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
	
	@RequestMapping(value="/classList.action", method = RequestMethod.GET)
	public String getClassList(@RequestParam(value="id_user")String id_user, Locale locale, Model model){
		//check if id_user == session.member.loginId for valid access.
	
		Takes takes = new Takes();
		takes.setId_student(id_user);
		takes.setSemester(CurrentDateCalculator.getSemester());
		takes.setYear(CurrentDateCalculator.getYear());
		
		List<Course>classes = courseService.getCourseWithProfessor(takes);
		
		
		model.addAttribute("myClassList", classes);
		return "myClass/classList";
	}
	
	
	@RequestMapping(value = "/classBoardRead.action", method = RequestMethod.GET)
	public String readClassBoard(@RequestParam(value="year")int year, @RequestParam(value="semester")int semester , @RequestParam(value="id_course")int id_course,
	@RequestParam(value="type")int type,@RequestParam(value="date_written")long date_written, @RequestParam(value="writer")String id_writer, @RequestParam(value = "page") int page, @RequestParam(value="id_user")String id_user, Locale locale, Model model) {


		Course course;
		ClassBoard queryObject = new ClassBoard(); 
		queryObject.setYear(year);
		queryObject.setSemester(semester);
		queryObject.setId_course(id_course);
		queryObject.setType(type);
		queryObject.setDate_written(date_written);
		queryObject.setId_writer(id_writer);
		/**
		 * ajax로 하던지..
		 */
		
		
		course = getCourseMeta(year,semester,id_course);
		
		
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
		model.addAttribute("year",year);
		model.addAttribute("semester",semester);
		model.addAttribute("course",course);
		
		return "myClass/class_board_read";
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
		Course course;
		ClassBoard classBoard = new ClassBoard();
		classBoard.setType(type);
		classBoard.setYear(year);
		classBoard.setSemester(semester);
		classBoard.setId_course(id_course);
		
		course = getCourseMeta(year,semester,id_course);
		
		
		model.addAttribute("classBoard", classBoard);
		model.addAttribute("page",page);
		model.addAttribute("year",year);
		model.addAttribute("semester",semester);
		model.addAttribute("course",course);
		

		return "myClass/class_board_form";
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
		
		/**
		 * 먼저 만들고 ajax버전으로 교체하자.
		 */
		
		classBoard = new ClassBoard();
		classBoard.setYear(year);
		classBoard.setSemester(semester);
		classBoard.setId_course(id_course);
		classBoard.setType(type);
		classBoard.setStart(page*recordsPerPage);
		classBoard.setEnd(recordsPerPage);
		
		classBoardList=classBoardService.getClassBoardList(classBoard);
		totalCount = classBoardService.getCount(classBoard);


		course = getCourseMeta(year, semester, id_course);
		course = courseService.getCourse(course);
	
		
	
		result = PageCalculator.calculateMetaNumber(page, totalCount);

		pageNums = new ArrayList<Integer>();
		for(int i=result.get("startPage");i<=result.get("endPage");i++)
		{
			pageNums.add(i);
		}
		
		
		model.addAttribute("course",course);
		model.addAttribute("pageNums", pageNums);
		model.addAttribute("boardList",classBoardList);
		model.addAttribute("type", type);
		model.addAttribute("course", course);
		model.addAttribute("page",page);
		model.addAttribute("totalCount",totalCount);
		model.addAttribute("more",result.get("more"));
		model.addAttribute("id_student",id_student);
		
		return "myClass/class_board";
	}
	
	
	
	

	
	@RequestMapping(value="/classEnterance.action", method = RequestMethod.GET)
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
	
	public Course getCourseMeta(int year, int semester, int id_course)
	{
		Course course = new Course();
		course.setId_course(id_course);
		course.setYear(year);
		course.setSemester(semester);
		return course;
	}


	
}


