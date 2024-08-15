package com.graymatter.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name="project23employee")
public class Employee {
	@Id
	private int id;
	private String name;
	private double salary;
	private String city;
	@ManyToOne
	@JoinColumn(name="deptId",referencedColumnName ="id")
	private String department;
}
