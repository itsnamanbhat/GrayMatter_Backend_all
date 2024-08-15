package com.graymatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.graymatter.model.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping("/doLogin")
	public String doLogin() {
		return "login";
	}
	
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String uname, @RequestParam String password) {
		ModelAndView mv= null;
		if(uname.equals("naman")&&password.equals("1234")) {
			mv= new ModelAndView("addEmp");
		mv.addObject("uname",uname);
		}
		else
			mv= new ModelAndView("login");
		System.out.println(uname);
		
		return mv;
	}
	@RequestMapping("employee/add")
	public ModelAndView addEmp(@RequestParam String empName, @RequestParam String empId, @RequestParam String empSal) {
		Employee e= new Employee(empName,Integer.parseInt(empId),Double.parseDouble(empSal));
		ModelAndView mv= new ModelAndView("emp");
		mv.addObject("emp1",e);
		return mv;
		
	}
	
	@RequestMapping("emp")
	public ModelAndView getEmpInfo() {
		Employee emp= new Employee("naman",233,3732);
		ModelAndView mv= new ModelAndView("emp");
		mv.addObject("emp1",emp);
		return mv;
	}
}
