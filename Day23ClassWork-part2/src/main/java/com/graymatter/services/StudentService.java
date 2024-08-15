package com.graymatter.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.graymatter.dto.StudentDto;
import com.graymatter.dto.StudentMapper;
import com.graymatter.entities.Student;
import com.graymatter.repositories.StudentRepository;

@Service
@Profile(value="production")
public class StudentService {
	@Autowired
	StudentRepository repository;
	@Autowired
	StudentMapper mapper;
	public List<StudentDto> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> slist= repository.findAll();
		return slist.stream().map((s)->mapper.mapToStudentDto(s)).collect(Collectors.toList());
	}

	public StudentDto addStudent(StudentDto studentDto) {
		return mapper.mapToStudentDto(repository.save(mapper.mapToStudent(studentDto)));
	}
}
