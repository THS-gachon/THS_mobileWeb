package com.gachon.swdm.ths.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gachon.swdm.ths.web.service.database.CourseService;
import com.gachon.swdm.ths.web.service.database.DepartmentService;

@Controller
@SessionAttributes("member")
public class CourseController {

	@Autowired
	@Qualifier("courseService")
	private CourseService courseService;
	
	@Autowired
	@Qualifier("departmentService")
	private DepartmentService departmentService;
	
}


