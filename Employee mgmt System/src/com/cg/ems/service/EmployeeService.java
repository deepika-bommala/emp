package com.cg.ems.service;

import java.time.LocalDate;
import java.util.HashSet;

import com.cg.ems.EmployeeException;
import com.cg.ems.dto.Employee;

public interface EmployeeService {
	public int addEmployee(Employee ee) throws EmployeeException;
	public HashSet<Employee> fetchAllEmp();
	public Employee getEmpById(int empid);
	
	public HashSet<Employee> searchEmpByName(String name);
	
	public int deleteEmp(int empId);
	public Employee updateEmp(int empId,String newName, float newSal);
	public boolean validateDigit(int num) throws EmployeeException;
	public boolean validateName(String name) throws EmployeeException;
	public LocalDate convertFromStrToLocalDate(String dtStr);
	

}

