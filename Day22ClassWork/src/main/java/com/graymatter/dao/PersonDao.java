package com.graymatter.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Person;
import com.graymatter.repositories.PersonRepository;

@Repository
public class PersonDao {
	
	@Autowired
	PersonRepository repository;
	
	public List<Person> getAllPersons(){
		return repository.findAll();
		
	}
	public Person addPerson(Person p) {
		return repository.save(p);
	}
	public void deletePerson(long id) {
		repository.deleteById(id);
	}
	
//	public Person updatePerson(Person p) {
//		repository.
//	}
	
	public  Person getPersonById(long id) {
		return repository.findById(id).get();
	}
	
	public Person updatePerson(Person person) {
		Person p= repository.findById(person.getAAdharNum()).get();
		p.setAge(person.getAge());
		p.setName(person.getName());
		return repository.save(p);
	}
	
}
