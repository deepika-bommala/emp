package com.cg.ems.util;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.cg.ems.dto.Employee;

public class CollectionUtil {
	private static HashSet<Employee> empSet = new HashSet<Employee>();
	static 
	{
		empSet.add(new Employee(112801,"Deepika",10000.0F, LocalDate.of(2018,Month.SEPTEMBER, 19)));
		empSet.add(new Employee(112802,"Anjali",12000.0F,LocalDate.of(2018,Month.NOVEMBER, 20)));
		empSet.add(new Employee(112833,"Poojitha",13000.0F,LocalDate.of(2018,Month.DECEMBER,21)));
		empSet.add(new Employee(112804,"Nikitha",10400.0F,LocalDate.of(2018,Month.DECEMBER, 07)));
		empSet.add(new Employee(112805,"Sreedivya",900000.0F,LocalDate.of(2018,Month.JUNE, 11)));
		empSet.add(new Employee(112806,"Sandhya",100000.0F,LocalDate.of(2018,Month.JULY, 01)));
	}
	public static void addEmp(Employee emp)
	{
		empSet.add(emp);
	}
	public static HashSet<Employee> getallEmp()
	{
		return empSet;
		}

	}
	
