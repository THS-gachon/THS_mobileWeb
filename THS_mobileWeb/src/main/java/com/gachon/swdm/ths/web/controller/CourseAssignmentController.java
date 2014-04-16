package com.gachon.swdm.ths.web.controller;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gachon.swdm.ths.web.bean.Course;
import com.gachon.swdm.ths.web.bean.Department;
import com.gachon.swdm.ths.web.bean.Takes;
import com.gachon.swdm.ths.web.service.database.CourseService;
import com.gachon.swdm.ths.web.service.database.DepartmentService;

@Controller
@SessionAttributes("member")
public class CourseAssignmentController {
	@Autowired
	@Qualifier("courseService")
	private CourseService courseService;

	@Autowired
	@Qualifier("departmentService")
	private DepartmentService departmentService;

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

	@RequestMapping(value = "/courseView.action", method = RequestMethod.GET)
	public String viewCourses(@RequestParam(value="department")String department,@RequestParam(value="id_student")String id_student, Locale locale, Model model) {
		
		List<Department> departmentList;
		List<Course> courseList;
		List<Course> myCourseList;
		Course course = new Course();
		course.setYear(getYear());
		course.setSemester(getSemester());
		if(department.equals("all"))
		{
			courseList = courseService.getCourseBytime(course);
		}
		else
		{
			System.out.println("department: "+department);
			course.setDept_name(department);
			courseList = courseService.getCourseByDepartment(course);
		}
		
		departmentList =departmentService.getAll();
		Takes takes = new Takes();
		
		takes.setYear(getYear());
		takes.setSemester(getSemester());
		takes.setId_student(id_student);
		myCourseList=courseService.getCourseByUser(takes);
		
		model.addAttribute("departmentList", departmentList);
		model.addAttribute("myCourseList",myCourseList);
		model.addAttribute("courseList",courseList);
		model.addAttribute("year", getYear());
		model.addAttribute("semester",getSemester());
	
		return "course/assignment/course_enroll";
	}

	@RequestMapping(value = "/courseEnroll.action", method = RequestMethod.GET)
	public String enrollCourse(@RequestParam(value = "year") int year,
			@RequestParam(value = "semester") int semester,
			@RequestParam(value = "id_course") int id_course,
			@RequestParam(value = "id_student") String id_student,
			@RequestParam(value = "department")String department,
			Locale locale, Model model) {

		Course course = new Course();
		course.setYear(year);
		course.setSemester(semester);
		course.setId_course(id_course);
		
		Takes takes = new Takes();
		takes.setYear(year);
		takes.setSemester(semester);
		takes.setId_course(id_course);
		takes.setId_student(id_student);
		
		courseService.takeCourse(course, takes);
		
		
		// service course

		//

		// 여기에 takes gogo....
		return viewCourses(department,id_student,locale,model);
	}
	
	@RequestMapping(value="/courseCancel.action", method = RequestMethod.GET)
	public String cancelCourse(@RequestParam(value = "year") int year,
			@RequestParam(value = "semester") int semester,
			@RequestParam(value = "id_course") int id_course,
			@RequestParam(value = "id_student") String id_student,
			@RequestParam(value = "department")String department,
			Locale locale, Model model) {

		Course course = new Course();

		System.out.println("yaer: "+year);
		System.out.println("semester: "+semester);
		System.out.println("id_course: "+id_course);
		System.out.println("id_student "+id_student);
		course.setYear(year);
		course.setSemester(semester);
		course.setId_course(id_course);
		
		Takes takes = new Takes();
		takes.setYear(year);
		takes.setSemester(semester);
		takes.setId_course(id_course);
		takes.setId_student(id_student);
		
		courseService.dropCourse(course, takes);
		
		
		// service course

		//

		// 여기에 takes gogo....
		return viewCourses(department,id_student,locale,model);
	}

}
