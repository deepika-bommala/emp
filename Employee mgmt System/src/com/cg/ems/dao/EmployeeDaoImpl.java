
package com.cg.ems.dao;

import java.util.HashSet;
import java.util.Iterator;

import com.cg.ems.EmployeeException;
import com.cg.ems.dto.Employee;
import com.cg.ems.util.CollectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public int addEmployee(Employee ee) throws EmployeeException {
		CollectionUtil.addEmp(ee);
		return ee.getEmpId();
	}

	@Override
	public HashSet<Employee> fetchAllEmp() {

		return CollectionUtil.getallEmp();
	}

	@Override
	public Employee getEmpById(int empid) {
		HashSet<Employee> empSet = CollectionUtil.getallEmp();
		Iterator<Employee> it = empSet.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (empid == e.getEmpId()) {
				HashSet<Employee> empSet1 = new HashSet<Employee>();
				empSet1.add(e);

				return e;
			}
		}

		return null;

	}

	@Override
	public HashSet<com.cg.ems.dto.Employee> searchEmpByName(String name) {
		HashSet<Employee> empSet = CollectionUtil.getallEmp();
		Iterator<Employee> it = empSet.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (name.equals(e.getEmpName())) {
				HashSet<Employee> empSet1 = new HashSet<Employee>();
				empSet1.add(e);
				return empSet1;

			}

		}
		return null;
	}

	@Override
	public int deleteEmp(int empId) {


		HashSet<Employee> empSet = CollectionUtil.getallEmp();
		Iterator<Employee> it = empSet.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (empId == e.getEmpId()) {
				it.remove();
			}
		}
		return empId;

	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		HashSet<Employee> empSet = CollectionUtil.getallEmp();
		Iterator<Employee> it = empSet.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (empId == e.getEmpId()) {
				it.remove();
				Employee e1 = new Employee(empId, newName, newSal, null);
				empSet.add(e1);
				return e1;
			}
		}
		return null;
	}
}