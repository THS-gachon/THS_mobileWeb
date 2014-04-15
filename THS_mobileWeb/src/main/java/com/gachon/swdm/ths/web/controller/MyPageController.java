package com.gachon.swdm.ths.web.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gachon.swdm.ths.web.bean.EditedUser;
import com.gachon.swdm.ths.web.service.database.UserService;
import com.gachon.swdm.ths.web.util.LoginChecker;


@Controller
@SessionAttributes("member")
public class MyPageController {

	@Autowired
	@Qualifier("userService")
	UserService userService;
	
	@RequestMapping(value="/myPage.action", method=RequestMethod.GET)
	public String myPageAction(Locale locale, Model model)
	{
		
		if(LoginChecker.isLogined(model))
			return "login_form";
		
		model.addAttribute("editedUser", new EditedUser());
		return "myPage";
	}
	
	@RequestMapping(value="/myPage.action", method=RequestMethod.POST)
	public String editUser(@ModelAttribute("editedUser") EditedUser user, Locale locale, Model model)
	{
		/*
		 * 
		 */
		System.out.println("dept_name: "+user.getDept_name());
		userService.update(user);
		return "index";//edited sucessful view.
	}
	
}
