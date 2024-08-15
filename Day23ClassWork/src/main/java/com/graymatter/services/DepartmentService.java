package com.graymatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.DepartmentDao;
import com.graymatter.entities.Departments;



@Service
public class DepartmentService implements DepartmentServiceInterface{

	@Autowired
	DepartmentDao dao;
	
	@Override
	public List<Departments> getAllDepartments() {
		// TODO Auto-generated method stub
		return dao.getAllDepartments();
	}

	@Override
	public Departments addDepartment(Departments e) {
		// TODO Auto-generated method stub
		return dao.addDepartment(e);
	}

}
