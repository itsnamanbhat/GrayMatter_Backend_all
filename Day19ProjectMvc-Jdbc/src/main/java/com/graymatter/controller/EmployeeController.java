package com.graymatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.graymatter.model.Employee;
import com.graymatter.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	
	@RequestMapping("/doLogin")
	public String welcome() {
		return "login";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp() {
		return "addEmployee";
	}
	@RequestMapping("/updateEmp")
	public String updateEmp() {
		return "updateEmployee";
	}	
	@RequestMapping("/delEmp")
	public String delEmp() {
		return "delEmployee";
	}
	@RequestMapping("/fetchEmp")
	public String fetchEmp() {
		return "getEmployee";
	}
	
	@RequestMapping("login")
	public ModelAndView loggingIn(@RequestParam String name,@RequestParam String pwd){
		ModelAndView mv=null;
		if(name.equals("naman")&& pwd.equals("123")) {
				mv= new ModelAndView("welcome");
				
				
		}else {
			mv=new ModelAndView("login");
		}
		
		return mv;
	}
	
	@RequestMapping("/employee")
	public ModelAndView getAllEmployee(){
		List<Employee> empList= service.getAllEmployee();
		ModelAndView mv=new ModelAndView("employee");
		mv.addObject("emp",empList);
		mv.addObject("action","all");
		for(Employee e:empList)
		System.out.println(e);
		return mv;
	}
	@RequestMapping("/addEmployee")
	public ModelAndView addmployee(@RequestParam String empName,@RequestParam String empId,@RequestParam String empSal){
		service.addEmployee(new Employee(Integer.parseInt(empId),empName,Double.parseDouble(empSal)));
		ModelAndView mv= new ModelAndView("welcome");
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delEmployee(@RequestParam String empId) {
		ModelAndView mv=new ModelAndView("welcome");
		service.deleteEmp(Integer.parseInt(empId));
		return mv;
	}
	
	@RequestMapping("/getEmployee")
	public ModelAndView getById(@RequestParam String empId) {
		ModelAndView mv= new ModelAndView("employee");
		Employee e =service.getEmployeeById(Integer.parseInt(empId));
		mv.addObject("emp",e);
		return mv;
		
	}
	
}
