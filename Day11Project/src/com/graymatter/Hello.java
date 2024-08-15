package com.graymatter;

public class Hello {
	public String sayHello() {
		return "Hello....";
	}
	public int add(int a ,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Hello h= new Hello();
		System.out.println(h.sayHello());

	}

}
