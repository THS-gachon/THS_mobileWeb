package com.gachon.swdm.ths.web.util;

import java.util.HashMap;

public class PageCalculator {

	/**
	 * It calculates the start page number, end page number and isMore.
	 * 
	 * @param page
	 *            : the current page
	 * @param totalCount
	 *            : the total record of the board. 		
	 * @return The hashMap that contains startPage and endPage number and more.
	 */
	public static HashMap<String, Integer> calculateMetaNumber(int page, int totalCount) {
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		int more, totalPages, startPage, endPage;

		more = 0;
		totalPages = totalCount / 10;
		if (totalCount % 10 > 0)
			totalPages++;
		
		//System.out.println("total Pages: "+totalPages);

		startPage = page / 5;
		startPage *=5;
		//System.out.println("start Page "+startPage);

		if ((totalPages - startPage) >= 5) {
			endPage = startPage + 4;
			if (totalPages - startPage > 5) {
				more = 1;
			}
		} else {
			endPage = startPage + totalPages - startPage - 1;
			if(endPage<0)
			{
				endPage = 0;
			}
		}

		result.put("more", more);
		result.put("startPage", startPage);
		result.put("endPage", endPage);
		return result;
	}

}
