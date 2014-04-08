package com.gachon.swdm.ths.web.util;

import org.springframework.ui.Model;


/**
 * 
 * @author KTS
 *
 * This class can be developed by AOP.
 */
public class LoginChecker {
	/**
	 * 
	 * @param model the model to be checked.
	 * @return true, if user did login. Otherwise, false.
	 */
	public static boolean isLogined(Model model)
	{
		if(model.containsAttribute("member"))
			return true;
		
		return false;
		
	}

}
