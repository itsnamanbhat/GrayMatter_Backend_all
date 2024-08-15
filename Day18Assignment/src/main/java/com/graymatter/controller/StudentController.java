package com.graymatter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.graymatter.model.Student;

@Controller
public class StudentController {
	List<Student> stdList=new ArrayList<>();
	
	
	@RequestMapping("/doLogin")
	public String doLogin() {
		return "login";
	}
	
	@RequestMapping("/addStd")
	public String add() {
		return "addStudent";
	}
	@RequestMapping("/goBack")
	public String goBack() {
		return "welcome";
	}
	
	@RequestMapping("/fetchStd")
	public String fetch() {
		return "getStudent";
	}
	@RequestMapping("/updateStd")
	public String update() {
		return "updateStudent";
	}
	@RequestMapping("/delStd")
	public String delete() {
		return "deleteStudent";
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String stdName, @RequestParam String password) {
		ModelAndView mv=null;
		if(stdName.equals("naman")&& password.equals("123")) {
			mv=new ModelAndView("welcome");
			mv.addObject("stdName",stdName);
		}
		return mv;
	}
	
	@RequestMapping("add")
	public ModelAndView addStd(@RequestParam String stdName, @RequestParam String stdId) {
		stdList.add(new Student(Integer.parseInt(stdId),stdName));
		ModelAndView mv= new ModelAndView("welcome");
		return mv;
	}
	@RequestMapping("/showStd")
	public ModelAndView showStd() {
		
		ModelAndView mv= new ModelAndView("showAllStudents");
		mv.addObject("students",stdList );
		return mv;
		
	}
	@RequestMapping("delete")
	public ModelAndView removeStd(@RequestParam String stdId) {
		 stdList.removeIf(student -> student.getStdId() == Integer.parseInt(stdId));
		ModelAndView mv= new ModelAndView("welcome");
		System.out.println(stdList);
		return mv;
	}
}
