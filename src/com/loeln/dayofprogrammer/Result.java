package com.loeln.dayofprogrammer;

import java.util.Date;

public class Result {

	public static void main(String[] args) {

		/**
		 * Julian calendar 365 days a year besides 4th year than 366 1700 to 1917 julian
		 * 1918 add 14 days to total days 1919 normal Gregorian calendar feb still leap
		 * month for both divisible by 400 and (4 and not by 100)
		 *
		 * jan 31 feb 28, leap 29 mar 31 apr 30 may 31 jun 30 jul 31 aug 31 sep 30 oct
		 * 31 nov 30 dec 31
		 */
		int jan = 31;
		int feb1 = 28;
		int leap = 29;
		int mar = 31;
		int apr = 30;
		int may = 31;
		int jun = 30;
		int jul = 31;
		int aug = 31;
		int sep = 30;
		int oct = 31;
		int nov = 30;
		int dec = 31;

		int x = jan + leap + mar + apr + may + jun + jul + aug;
		x = 256 - x;
		int y = 1918 % 4;
		System.out.println(Solution.dayOfProgrammer(1984));
		System.out.println(x + " " + y);
	}

}

class Solution {

	public static String dayOfProgrammer(int year) {
		String normal = "13.09.";
		String leap = "12.09.";
		String weird = "27.09.";

		if (year == 1918) {
			return weird + year;
		}
		if (year < 1918 || year > 1918) {
			if (year % 4 == 0 && year % 100 != 0) {
				return leap + year;
			}
		}
		return normal + year;

	}
}
