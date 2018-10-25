package com.cg.ems.ui;

import java.util.HashSet;
import java.util.TreeSet;

import com.cg.ems.dto.Employee;

public class TestHashSetDemo {
	public static void main(String args[]){
		HashSet<Employee> emps = new HashSet<Employee>();
		emps.add(new Employee(101,"tom", 1000.0F, null));
		emps.add(new Employee(102,"deepika",1200.0F, null));
		emps.add(new Employee(102,"XYZ",1200.0F, null));
		emps.add(new Employee(103,"deep",1250.0F, null));
		System.out.println(emps);
		System.out.println("*****************************************************");
		TreeSet<String> cities = new TreeSet<String>();
		cities.add("pune");
		cities.add("hyd");
		cities.add("delhi");
		cities.add("agra");
		cities.add("cochin");
		cities.add("pune");
		System.out.println(cities);
		
		System.out.println("*****************************************************");
		
	/*	TreeSet<Employee> emps1= new TreeSet<Employee>();
		emps1.add(new Employee(101,"tom", 1000.0F));
		emps1.add(new Employee(102,"deepika",1200.0F));
		emps1.add(new Employee(102,"deepika",1200.0F));
		emps1.add(new Employee(103,"deep",1250.0F));
		System.out.println(emps1);*/
		
	}

}
