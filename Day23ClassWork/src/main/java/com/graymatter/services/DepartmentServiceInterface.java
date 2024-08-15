package com.graymatter.services;

import java.util.List;

import com.graymatter.entities.Departments;
import com.graymatter.entities.Employee;

public interface DepartmentServiceInterface {

	public List<Departments> getAllDepartments();
	public Departments addDepartment(Departments e);
}