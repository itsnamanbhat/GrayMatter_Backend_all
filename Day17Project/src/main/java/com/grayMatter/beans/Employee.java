package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@PropertySource("data.properties")
public class Employee {
@Value("${Employee.empName}")
private String empName;
@Value("123")
private int empId;
@Value("1000")
private double empSal;
}