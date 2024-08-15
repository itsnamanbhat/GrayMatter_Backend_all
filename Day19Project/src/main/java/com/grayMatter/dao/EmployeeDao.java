package com.grayMatter.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.grayMatter.model.Employee;

public class EmployeeDao {
	
	private JdbcTemplate jdbctemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate=jdbctemplate;
	}
	//crud operations
	//insert query
	public int addEmployee(Employee emp) {
		String query="insert into employee values ('"+emp.getEmpName()+"',"+emp.getEmpId()+","+emp.getEmpSal()+");";
		int i=jdbctemplate.update(query);
		return i;
	}
	//select query
	
	public List<Employee> getAllEmployees(){
		String query= "Select * from employee";
		List<Employee> empList= jdbctemplate.query(query, new EmployeeRowMapper());
		return empList;
		
	}
	public int updateEmployee(Employee emp) {
		String query= "update employee set salary="+emp.getEmpSal()+"where id="+emp.getEmpId();
		return jdbctemplate.update(query);
		
	}
	
	public Employee getEmployeeById(int empId) {
		String query= "select * from employee where id="+empId;
		List<Employee> empList= jdbctemplate.query(query,new EmployeeRowMapper());
		return empList.get(0);
	}
}
