package com.graymatter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.entities.Person;
import com.graymatter.services.PersonServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class PersonController {
	
	@Autowired
	PersonServiceImpl service;
	@GetMapping("/person")
	public List<Person> getAllPersons(){
		return service.getAllPersons();
	}
	
	@PostMapping("/add")
	public Person addOnePerson(@RequestBody Person p) {
		return service.addPerson(p);
	}
	
	@GetMapping("/get/{Id}")
	public Person getPersonByID(@PathVariable("Id") long id) {
		return service.getPersonById(id);
	}
	@GetMapping("/delete/{Id}")
	public void deletePerson(@PathVariable("Id") long id) {
		service.deltePerson(id);
	}
	
	@PutMapping("/update")
	public Person updatePerson(@RequestBody Person p) {
		return service.updatePerson(p);
	}
}
