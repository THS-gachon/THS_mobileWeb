package com.gachon.swdm.ths.web.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gachon.swdm.ths.web.bean.EditedUser;
import com.gachon.swdm.ths.web.util.LoginChecker;


@Controller
@SessionAttributes("member")
public class MyPageController {

	
	@RequestMapping(value="/myPage.action", method=RequestMethod.GET)
	public String myPageAction(Locale locale, Model model)
	{
		
		if(LoginChecker.isLogined(model))
			return "login_form";
		
		model.addAttribute("editedUser", new EditedUser());
		return "myPage";
	}
	
	@RequestMapping(value="/myPage.action", method=RequestMethod.POST)
	public String editUser(Locale locale, Model model)
	{
		
		
		return "";//edited sucessful view.
	}
	
}
