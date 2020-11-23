package com.date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Timeex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String date;
		Scanner sc=new Scanner(System.in);
		date=sc.next();
		LocalDate ld=LocalDate.parse(date);
		
		System.out.println(ld);
		
		
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("format date="+ld.format(d));
		System.out.println("date after 3 day"+ld.plusDays(3));
		System.out.println("year="+ld.getYear());
		System.out.println("month="+ld.getMonthValue());
		System.out.println("day of year"+ld.getDayOfYear());
		
		LocalDate ld1=LocalDate.now();
		System.out.println("checking as leap year"+ld.isLeapYear());
		System.out.println("start of the day"+ld.atStartOfDay());
	
		
	}

}
