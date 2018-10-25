package com.cg.ems.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.cg.ems.EmployeeException;
import com.cg.ems.dto.Employee;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class TestmployeeClient {
	static Scanner sc = null;
	static EmployeeService empSer = null;

	public static void main(String[] args) {
	
sc = new Scanner(System.in);
empSer = new EmployeeServiceImpl();
int choice =0;
while(true){
	System.out.println("what do u want to do ");
	System.out.println("1:Add Emp\t 2: Fetch All Emp\n");
	System.out.println("3:Delete Emp\t 4:  Search EmpbyId\n");
	System.out.println("5:SearchEmp by name \t 6:update  Emp\n");
	System.out.println("8.exit");
	System.out.println("Enter choice");
	choice = sc.nextInt();
	switch(choice)
	{
	case 1:addEmp();break;
	case 2:showEmpInfo();break;
	case 3:delEmp();break;
	case 4:SearchEmpById();break;
	case 5:SearchEmpByName();break;
	case 6:updateEmp();break;
	default:System.exit(0);
	
	}
	
}
	}
	private static void updateEmp() {
	System.out.println("enter the empid to be updated");
	Integer empid = sc.nextInt();

	System.out.println("enter the newName");
	String newName = sc.next();
	System.out.println("enter the newSal");
	float newSal =sc.nextFloat();
	empSer.updateEmp(empid, newName, newSal);
		
	}
	private static void delEmp() {
	
		System.out.println("empid");
		Integer empid=sc.nextInt();
		empSer.deleteEmp(empid);
	}
	private static void SearchEmpByName(){
		System.out.println("enter name");
		String name=sc.next();
		HashSet<Employee> ref=empSer.searchEmpByName(name);
		if(ref == null)
		{
		System.out.println("emp not found");
		}
		else 
		{
			System.out.println("emp in the list:"+ref);
		}
	}

	private static void SearchEmpById() {
		System.out.println("enter empid");
		int empId = sc.nextInt();
		Employee empSet1=empSer.getEmpById(empId);
		if(empSer.getEmpById(empId)== null)
		{
			System.out.println("Given employee Id is not found in the set");
			}
		else
		System.out.println("Employee details of the given empid :"+empSet1);
		
	}

	private static void showEmpInfo() 
	{
	HashSet<Employee> empSet = empSer.fetchAllEmp();
	Iterator<Employee> it = empSet.iterator();
	System.out.println("---------------------------");
	System.out.println(" EmpId\t\t Empname  \t\t Empsal\t\t\tEmpDoj");
	while(it.hasNext())
	{
		Employee ee = it.next();
		System.out.println(ee.getEmpId()+"\t\t"+ ee.getEmpName()+"\t\t"+ ee.getEmpSal()+"\t\t"+ee.getEmpDoj());
	}
	}

	private static void addEmp()
	{
		System.out.println("enter empid");
		int eid = sc.nextInt();
		try {
			if(empSer.validateDigit(eid))
			{
				System.out.println("enter name");
				String nm= sc.next();
				if(empSer.validateName(nm)){
					System.out.println("enter sal");
					float sal =sc.nextFloat();
					System.out.println("Enter DOJ(DD-MM-YY");
					String empDojStr = sc.next();
					Employee ee = new Employee(eid, nm, sal, empSer.convertFromStrToLocalDate(empDojStr));
					int empId = empSer.addEmployee(ee);
					System.out.println(empId+"addedsuccessfully");
				}
				
			}
		}
		catch (EmployeeException e)
		{
			e.printStackTrace();
		}
		
	}

}
