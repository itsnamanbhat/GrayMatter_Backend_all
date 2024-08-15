package com.graymatter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Departments;

@Repository
public interface DepartmentRepository extends JpaRepository<Departments, Integer>{

}
