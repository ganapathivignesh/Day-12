package com.emp;

public class Student {      //student class//

	String sname;
	String srollno;
	String dob;
	
	
	public Student(String sname, String srollno, String dob) {
		super();
		this.sname = sname;            //constructor for elements//
		this.srollno = srollno;
		this.dob = dob;
		
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sname="+sname+"srollno="+srollno+"dob="+dob;
	}
	
}
