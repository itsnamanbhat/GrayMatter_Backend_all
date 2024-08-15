package com.grayMatter;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoTest {
	@Test
	public void testPrintName() {
		assertEquals("user", App.printName("user"));
	}
	
	@BeforeEach
	public void printBeforeEach() {
		System.out.println("before each test");
	}
	
	@AfterAll
	public void printAfterEach() {
		System.out.println("After each test");
	}
}
