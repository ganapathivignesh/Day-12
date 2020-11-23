package com.emp;
import java.util.Base64;
import java.util.Scanner;
public class Mainstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students");
		int number=sc.nextInt();
		

		for(int i=0;i<number;i++)                  
			//accepting values from user//
		{
			System.out.println("enter student name");
			String name=sc.next();
			System.out.println("enter rolno");
			String no=sc.next();
			System.out.println("enter dob");
			String dob=sc.next();
		    Student s=new Student(name,no,dob);
		    Base64.Encoder encode=Base64.getEncoder();
		    s.sname=encode.encodeToString(s.sname.getBytes());
		    s.srollno=encode.encodeToString(s.srollno.getBytes());
		    s.dob=encode.encodeToString(s.dob.getBytes());
		    System.out.println(s);
		    
	}

	}
}
