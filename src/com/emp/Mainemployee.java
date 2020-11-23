package com.emp;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Mainemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of employee");
		int number=sc.nextInt();
		HashSet<Employee> hs=new HashSet<>();  //daclaring object//
		
		for(int i=0;i<number;i++)                  
			//accepting values from user//
		{
			System.out.println("enter employee id");
			int eid=sc.nextInt();
			System.out.println("enter employee name");
			String  ename=sc.next();
			System.out.println("enter employee salary");
			double esalary=sc.nextDouble();
			System.out.println("enter employee age");
			int eage=sc.nextInt();
			System.out.println("enter employee working years");  
			int ework=sc.nextInt();
			
			Employee e=new Employee(eid,ename,esalary,eage,ework);
			hs.add(e);
			
		}
		System.out.println(hs);
		HashSet hs1=(HashSet)hs.stream().sorted((e1,e2)->(Integer)e1.ework>(Integer)e2.ework?-1:1).collect(Collectors.toSet());
		System.out.println("sorting according to no of yrs worked"+hs1);
		HashSet hs2=(HashSet)hs.stream().filter()).map((e)->e.salary+50000).collect(Collectors.toSet());
		System.out.println(hs2);
		Optional <Employee> max=hs.stream().max((e3,e4)->(Double)e3.esalary<(Double)e4.esalary?1:-1);
		System.out.println(max);
		
		Optional <Employee> min=hs.stream().min((e5,e6)->(Double)e5.esalary<(Double)e6.esalary?1:-1);
		System.out.println(min);
		
		Hashset hs3=(HashSet)hs.stream()
				               .filter((e)->(Integer)e.ework>2)
				               .sorted((e1,e2)->(Integer)e1.ework<(Integer)e2.ework?-1:1)
				               .collect(Collectors.toSet());
		
		System.out.println(hs3);
	}
   
}
