package com.gachon.swdm.ths.web.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gachon.swdm.ths.web.bean.EditedUser;
import com.gachon.swdm.ths.web.util.LoginChecker;


@Controller
@SessionAttributes("member")
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	private String[] selector = new String[]{"main/userInfo","main/notice","main/myClass","main/configuration"};
	
	@RequestMapping(value="/main.action", method=RequestMethod.GET)
	public String select(@RequestParam(value = "selection")int opt, Locale locale, Model model)
	{
		System.out.println("??");
	
		if(LoginChecker.isLogined(model)!=true)
			return "login_form";
		
		if(opt < 0 || opt >= selector.length)
			return "error";
		
		if(opt == 0)//user Information
		{
			model.addAttribute("editedUser", new EditedUser());
		}
		System.out.println("hello");
		return selector[opt];
	}
}
