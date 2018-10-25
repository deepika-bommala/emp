package com.cg.ems.dto;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private  int empId;
	private  String empName;
	private float  empSal;
	private LocalDate empDoj;
	public Employee(int empId, String empName, float empSal, LocalDate empDoj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDoj = empDoj;
	}

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
 @Override
	public int hashCode(){
		return empId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + "]";
	}
	@Override
	public boolean equals( Object obj)
	{
		Employee emp = (Employee)obj;
	if((emp.empId == this.empId)||(emp.empName == this.empName))
	{
		return true;
	}
	else 
		return false;
	}

	@Override
	public int compareTo(Employee emp)
	{
		if(emp.empId<this.empId){
		return -1;
	}
		else if(emp.empId == this.empId){
			return 0;
		}
		else {
			return +1;
		}
		}

	public LocalDate getEmpDoj() {
		return empDoj;
	}

	public void setEmpDoj(LocalDate empDoj) {
		this.empDoj = empDoj;
	}
}
