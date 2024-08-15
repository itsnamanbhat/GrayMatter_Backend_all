package com.graymatter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	Hello h= new Hello();
	@Test
	public void testSayHello() {
		String expected	= "Hello....";
		h= new Hello();
		String actual=h.sayHello();
		assertEquals(expected,actual);
	}
	@Test
	public void testAdd() {
		assertEquals(5,h.add(2, 2));
	}
}
