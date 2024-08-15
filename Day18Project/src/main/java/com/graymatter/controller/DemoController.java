package com.graymatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
		
	}
	@RequestMapping("/name")
	public ModelAndView printName() {
		ModelAndView mv= new ModelAndView("Naman");
		String name="Naman";
		mv.addObject("hello");
		mv.addObject("name",name);
		return mv;
	}
}
