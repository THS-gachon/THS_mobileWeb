package com.gachon.swdm.ths.web.controller;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


import com.gachon.swdm.ths.web.bean.User;


@Controller
@SessionAttributes("member")//"member" is the key of model object. The value object of the key,"member", is stored in session.
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	/**
	 * This hashMap is injected by servlet-context.xml
	 * This object will be removed.
	 */
	@Autowired 
	@Qualifier("tmpUsers")
	public static ConcurrentHashMap<String,String> tmpUsers;
	
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Locale locale, Model model)
	{
		return this.loginForm(locale, model);
	}
	
	


	@RequestMapping(value="/login.action", method = RequestMethod.GET)
	public String loginForm(Locale locale, Model model)
	{
		User user = new User();
		model.addAttribute("user", user);
		return "login_form";
	}
	
	
	@RequestMapping(value="/login.action", method = RequestMethod.POST)
	public String loginAction(@ModelAttribute("user") User user,BindingResult result, Locale locale, Model model)
	{
		
		user = authenticate(user);
		if(user == null)
		{
			System.out.println("실패");
			return "login_form";
		}
		
		else{
			model.addAttribute("member", user);
			logger.debug("성공");
			System.out.println("성공");
			return "index";	
		}
		
	}
	
	
	/**
	 * Temporary method.
	 * Database access is required within this method, otherwise other static method of DAO class is required.
	 * @param user
	 * @return The user object 
	 */
	private User authenticate(User user)
	{
		String pw = tmpUsers.get(user.getLoginId());
		if(pw == null)
			return null;
		
		if(pw.equals(user.getPw()))
		{
			return user;
		}
		return null;
	}
}

