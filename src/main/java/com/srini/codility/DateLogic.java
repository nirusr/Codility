package com.srini.codility;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateLogic {
	
	public static void main(String[] args ) throws ParseException {
		int m = 10;
		int y = 2017;
		int d = 11;
		
		
		LocalDate dt = LocalDate.of(y, m, d);
		String  s= dt.getDayOfWeek().name();
		System.out.println(s);
		
		
	}

}
