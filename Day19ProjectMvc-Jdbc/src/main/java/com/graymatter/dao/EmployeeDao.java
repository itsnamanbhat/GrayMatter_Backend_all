package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.graymatter.model.Employee;

@Component
public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	//crud operations
	//insert query
	public int addEmployee(Employee emp) {
		String query="insert into employee values ('"+emp.getEmpName()+"',"+emp.getEmpId()+","+emp.getEmpSalary()+");";
		int i=jdbcTemplate.update(query);
		return i;
	}
	//select query
	
	public List<Employee> getAllEmployees(){
		String query= "Select * from employee";
		List<Employee> empList= jdbcTemplate.query(query, new EmployeeRowMapper());
		return empList;
		
	}
	public int updateEmployee(Employee emp) {
		String query= "update employee set salary="+emp.getEmpSalary()+"where id="+emp.getEmpId();
		return jdbcTemplate.update(query);
		
	}
	
	public Employee getEmployeeById(int empId) {
		String query= "select * from employee where id="+empId;
		List<Employee> empList= jdbcTemplate.query(query,new EmployeeRowMapper());
		return empList.get(0);
	}
	
	public int deleteEmployeeById(int empId) {
		String query="DELETE FROM employee WHERE empId ="+empId;
		return jdbcTemplate.update(query);
	}
}
