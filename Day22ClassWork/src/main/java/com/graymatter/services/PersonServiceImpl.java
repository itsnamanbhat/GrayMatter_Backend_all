package com.graymatter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.PersonDao;
import com.graymatter.entities.Person;

@Service
public class PersonServiceImpl implements PersonServiceInterface{

		
	@Autowired
	PersonDao dao;
	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return dao.getAllPersons();
		}
	@Override
	public void deltePerson(long id) {
		// TODO Auto-generated method stub
		 dao.deletePerson(id);
	}
	@Override
	public  Person getPersonById(long id) {
		// TODO Auto-generated method stub
		return dao.getPersonById(id);
	}
	@Override
	public Person addPerson(Person p) {
		// TODO Auto-generated method stub
		return dao.addPerson(p);
	}
	@Override
	public Person updatePerson(Person p) {
		// TODO Auto-generated method stub
		return dao.updatePerson(p);
	}
	

}
