package com.practice.java8features;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now(); 
		 
		System.out.println(date);
		System.out.println(date.minusDays(2));
		
		LocalDate date1 = LocalDate.of(2016, 12, 17);
		
		System.out.println(date1.isLeapYear());
		
		ZoneOffset zone = ZoneOffset.UTC;  
	    Temporal temp = zone.adjustInto(ZonedDateTime.now());  
	    System.out.println(temp);  
	}

}
