package com.graymatter.dao;

import java.sql.ResultSet;

import java.sql.SQLException;



import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.graymatter.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs,int rowNum) throws SQLException, DataAccessException {
		
			return new Employee(rs.getInt(2),rs.getString(1),rs.getDouble(3));
	}

}
