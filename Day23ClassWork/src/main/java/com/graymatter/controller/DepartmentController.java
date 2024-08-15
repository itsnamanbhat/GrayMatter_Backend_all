package com.graymatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.entities.Departments;
import com.graymatter.entities.Employee;
import com.graymatter.services.DepartmentService;
import com.graymatter.services.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@GetMapping("/department")
	public List<Departments> getAllDepartment(){
		return service.getAllDepartments();
	}
	@PostMapping("/department")
	public Departments addDepartment(@RequestBody Departments d){
		return service.addDepartment(d);
	}
	
}
