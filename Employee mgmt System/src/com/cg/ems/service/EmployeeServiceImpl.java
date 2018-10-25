package com.cg.ems.service;
import com.cg.ems.dao.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.regex.Pattern;

import com.cg.ems.EmployeeException;
import com.cg.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao empDao=null;
public EmployeeServiceImpl()
{
		empDao = new EmployeeDaoImpl();
}

@Override
public int addEmployee(Employee ee) throws EmployeeException {
	return empDao.addEmployee(ee);
	
}

@Override
public HashSet<Employee> fetchAllEmp() {
	
	return empDao.fetchAllEmp();
}

@Override
public Employee getEmpById(int empid) {
	// TODO Auto-generated method stub
	return empDao.getEmpById(empid);
}

@Override
public HashSet<Employee> searchEmpByName(String name) {
	// TODO Auto-generated method stub
	return empDao.searchEmpByName(name);
}

@Override
public int deleteEmp(int empId) {
	// TODO Auto-generated method stub
	return empDao.deleteEmp(empId);
}

@Override
public Employee updateEmp(int empId, String newName, float newSal) {
	// TODO Auto-generated method stub
	return empDao.updateEmp(empId, newName, newSal);
}

@Override
public boolean validateDigit(int num) throws EmployeeException {
	Integer input = new Integer(num);
	String inputStr = input.toString();
	String digitPatter="[0-9]+";
	if(Pattern.matches(digitPatter, inputStr)){
		return true;
	}
	else
	{
		throw new EmployeeException("InvalidInput"+"OnlyDigits are allowed ex.45577");
	}
}

@Override
public boolean validateName(String name) throws EmployeeException {
	// TODO Auto-generated method stub
	String namePatter="[A-Z][a-z]+";
	if(Pattern.matches(namePatter,name))
	{
		return true;
	}
	else
	{
		throw new EmployeeException("InvalidInput"+"Name should start with capital ex.Abc");
	}
}

@Override
public LocalDate convertFromStrToLocalDate(String dtStr) {
	// TODO Auto-generated method stub
	DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate date = LocalDate.parse(dtStr, myFormat);
	
	return date;
}



	

}
