package com.webapplication;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="entity")
public class Employee {
	@Id
	private int eid;
	private String ename;
	private int eage;
	private String salary;
	
	public Employee(int eid, String ename, int eage, String salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", salary=" + salary + "]";
	}
	
	
	
	

}
