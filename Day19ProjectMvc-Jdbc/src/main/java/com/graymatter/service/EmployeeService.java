package com.graymatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.EmployeeDao;
import com.graymatter.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao empdao;
	
	public List<Employee> getAllEmployee(){
		return empdao.getAllEmployees();
		
	}
	public int addEmployee(Employee employee) {
		return empdao.addEmployee(employee);
	}
	public Employee getEmployeeById(int empId) {
		return empdao.getEmployeeById(empId);
	}
	
	public int deleteEmp(int empId) {
		return empdao.deleteEmployeeById(empId);
	}
		
	public int updateEmp(Employee emp) {
		return empdao.updateEmployee(emp);
	}
	
}
