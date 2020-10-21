package com.learnspring;

public class Employee {
	int eid;
	String ename;
	Double eSalary;
	public Employee() {
		
	}
	public Employee(int eid, String ename, Double eSalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eSalary = eSalary;
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
	public Double geteSalary() {
		return eSalary;
	}
	public void seteSalary(Double eSalary) {
		this.eSalary = eSalary;
	}
	
 @Override
public String toString() {
	return "eid="+eid+" ename= "+ ename+ " esalary = "+eSalary;
}

}
