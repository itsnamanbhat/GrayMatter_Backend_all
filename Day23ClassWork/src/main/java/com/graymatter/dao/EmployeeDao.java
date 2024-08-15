package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Departments;
import com.graymatter.entities.Employee;
import com.graymatter.repositories.DepartmentRepository;
import com.graymatter.repositories.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepository repository;
	@Autowired
	DepartmentRepository repository1;
	
	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}
	
	public Employee addEmployee(Employee e) {
		return repository.save(e);
	}

	public List<Employee> getAllEmployeeByCity(String city) {
		// TODO Auto-generated method stub
		return repository.findByCity(city);
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	
	public List<Employee> getEmployeeByDeptId(int id) {
		// TODO Auto-generated method stub
		//Department d=repository1.findById(id).get();
		
		
		return repository.findByDepartmentId(id);

	}
	
	

	public List<Employee> getEmployeeByNameStartWith(String val) {
		// TODO Auto-generated method stub
		return repository.findByNameStartsWith(val);
	}
}
