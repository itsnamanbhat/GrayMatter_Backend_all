package com.graymatter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.dto.StudentDto;
import com.graymatter.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/dto")
	public List<StudentDto> getAllStudents(){
		return service.getAllStudents();
	}
	
	@PostMapping("/add")
	public StudentDto addStudent(@RequestBody StudentDto studentDto) {
		return service.addStudent(studentDto);
	}
}
