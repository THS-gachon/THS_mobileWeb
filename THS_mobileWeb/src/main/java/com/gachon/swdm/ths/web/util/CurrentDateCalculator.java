package com.gachon.swdm.ths.web.util;

import java.util.Calendar;

public class CurrentDateCalculator {
	public static int getSemester(){
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
	public static int getYear(){
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.YEAR);
	}
}
