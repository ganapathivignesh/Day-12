package com.emp;

public class Employee {
     
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	int empid;   //attributes for employee//
	String empname;
	double empsalary;
	int empage;
	int empworkyrs;
	
	
	public Employee() {
		;
		// TODO Auto-generated constructor stub
	}


	public Employee(int empid, String empname, double empsalary, int empage,
			int empworkyrs) {                                  // constructor for employee//
	
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empage = empage;
		this.empworkyrs = empworkyrs;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {              //to avoid duplicates//
		// TODO Auto-generated method stub
		return this.empid;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {   //to avoid duplicates in set//
		// TODO Auto-generated method stub
		Employee e=(Employee)obj;
		return this.empid==e.empid;
	}
	
	
	@Override
	public String toString() {     //to print values as string//
		// TODO Auto-generated method stub
		return "empid= "+empid+"empname="+empname+"empsalary ="+empsalary+"empage-"+empage+"empworkyrs="+empworkyrs;
	}
	
	
}
