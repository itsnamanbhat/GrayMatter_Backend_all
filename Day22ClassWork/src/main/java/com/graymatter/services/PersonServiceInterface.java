package com.graymatter.services;

import java.util.List;
import java.util.Optional;

import com.graymatter.entities.Person;

public interface PersonServiceInterface {
 public List<Person> getAllPersons();
 public Person addPerson(Person p);
 public Person getPersonById(long id);
// public Person updatePerson();
 public void deltePerson(long id);
 public Person updatePerson(Person p);
}
