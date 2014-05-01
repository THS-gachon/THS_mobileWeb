package com.gachon.swdm.ths.web.controller;

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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.WebRequest;

import com.gachon.swdm.ths.web.bean.User;
import com.gachon.swdm.ths.web.service.database.UserService;

@Controller
@SessionAttributes("member")
// "member" is the key of model object. The value object of the key,"member", is
// stored in session.
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	@Qualifier("userService")
	UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getRemotePort());
		
		System.out.println(request.getLocalAddr());
		System.out.println(request.getLocalPort());
		return this.loginForm(locale, model);
	}

	@RequestMapping(value = "/signUp.action", method = RequestMethod.GET)
	public String signUpForm(Locale locale, Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "signup_form";
	}

	@RequestMapping(value = "/signUp.action", method = RequestMethod.POST)
	public String signUpAction(@ModelAttribute("user") User user,
			Locale locale, Model model) {

		userService.save(user);
		return "login_form";
	}

	@RequestMapping(value = "/login.action", method = RequestMethod.GET)
	public String loginForm(Locale locale, Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "login_form";
	}

	@RequestMapping(value = "/login.action", method = RequestMethod.POST)
	public String loginAction(@ModelAttribute("user") User user, Locale locale,
			Model model) {

		user = authenticate(user);
		if (user == null) {
			// System.out.println("실패");
			return "login_form";
		}

		else {
			model.addAttribute("member", user);
			logger.debug("성공");

			// System.out.println("성공");
			return "index";
		}
	}

	@RequestMapping(value = "/logOut.action", method = RequestMethod.GET)
	public String logOutAction(Locale locale, Model model, WebRequest request,
			SessionStatus sessionStatus) {
		
	
		sessionStatus.setComplete();
	
		model.addAttribute("member", null);
		
		return loginForm(locale, model);

	}

	/**
	 * Temporary method. Database access is required within this method,
	 * otherwise other static method of DAO class is required.
	 * 
	 * @param user
	 * @return The user object
	 */
	private User authenticate(User user) {

		User user_logined = userService.getById(user.getLoginId());
		if (user_logined == null)
			return null;

		if (user_logined.getPw().equals(user.getPw())) {
			user_logined.setPw(null);
			return user_logined;
		}

		return null;
	}

	/**
	 * session remove example
	 * 
	 * @RequestMapping(value = "/finish", method = RequestMethod.GET) public
	 *                       String page4(@ModelAttribute User user, WebRequest
	 *                       request, SessionAttributeStore store, SessionStatus
	 *                       status) {
	 * 
	 *                       status.setComplete();
	 *                       store.cleanupAttribute(request, "user"); return
	 *                       "redirect:/home"; }
	 */

	/**
	 * @RequestMapping(value = "/finish", method = RequestMethod.GET) 
	 * public
	 *                       String page4(@ModelAttribute User user, WebRequest
	 *                       request, SessionStatus status) {
	 * 
	 *                       status.setComplete();
	 *                       request.removeAttribute("user",
	 *                       WebRequest.SCOPE_SESSION); return "redirect:/home";
	 *                       }
	 */
}
