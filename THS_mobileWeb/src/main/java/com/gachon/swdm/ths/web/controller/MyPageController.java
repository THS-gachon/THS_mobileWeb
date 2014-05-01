package com.gachon.swdm.ths.web.controller;

import java.util.Locale;

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
import com.gachon.swdm.ths.web.service.database.UserService;
import com.gachon.swdm.ths.web.util.LoginChecker;


@Controller
@SessionAttributes("member")
public class MyPageController {

	@Autowired
	@Qualifier("userService")
	UserService userService;
	
	@Autowired
	HomeController homeController;
	
	
	
	@RequestMapping(value="/myPage.action", method=RequestMethod.GET)
	public String viewMyPage(@RequestParam("id_user")String id_user, Locale locale, Model model)
	{
		
		if(LoginChecker.isLogined(model)!= true)
			return homeController.home(locale, model);
	
		model.addAttribute("user", new User());
		return "/myPage/userInfo";
	}
	
	@RequestMapping(value="/editUser.action", method=RequestMethod.POST)
	public String editUser(@ModelAttribute("user") User user, Locale locale, Model model)
	{

	//	System.out.println("dept_name: "+user.getDept_name());
		
		//validation
		//
		
		userService.update(user);
		return "index";//edited sucessful view.
	}
	
}
