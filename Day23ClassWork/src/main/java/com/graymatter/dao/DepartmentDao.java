package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Departments;
import com.graymatter.entities.Employee;
import com.graymatter.repositories.DepartmentRepository;
import com.graymatter.repositories.EmployeeRepository;

@Repository
public class DepartmentDao {

	@Autowired
	DepartmentRepository repository;
	
	public List<Departments> getAllDepartments(){
		return repository.findAll();
	}
	
	public Departments addDepartment(Departments e) {
		return repository.save(e);
	}
}

