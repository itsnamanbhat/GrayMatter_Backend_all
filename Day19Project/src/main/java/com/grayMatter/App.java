package com.grayMatter;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grayMatter.dao.EmployeeDao;
import com.grayMatter.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("jdbc-bean.xml");
		EmployeeDao dao=  (EmployeeDao)context.getBean("empdao");
		List<Employee> i=dao.getAllEmployees();
		System.out.println(i);
		//update
		dao.updateEmployee(new Employee("naman",123,1000));
		System.out.println("updated succesfully");
		System.out.println("after update");
		i=dao.getAllEmployees();
		for(Employee emp:i) {
			System.out.println(emp);
		}
		System.out.println("Employee by Id"+dao.getEmployeeById(123));
    }
}
