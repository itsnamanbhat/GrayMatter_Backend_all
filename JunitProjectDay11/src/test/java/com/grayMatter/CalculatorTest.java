package com.grayMatter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testCalculator(){
		int a= 4;
		int b= 2;
		Calculator c= new Calculator();
		assertEquals(6,c.addNum(a, b));
		assertEquals(2,c.divNum(a, b));
		assertEquals(2,c.subNum(a, b));
		assertEquals(8,c.mulNum(a, b));
		assertTrue(c.isEven(32));
		
	}
	
	@Test
	public void tesArrayEquals() {
		int expArray[]= {34,56,78,12,39};
		int actualArray[]= {34,56,78,12,39};
		assertArrayEquals(expArray,Calculator.arrayEquals(actualArray));
	}
	
	@Test
	public void testCheckString () {
		assertNull(Calculator.checkString());
	}
	
	@Before
	public void printLogBeforeEach() {
		System.out.println("Before Every test");
	}
	@After
	public void printLogAfterEach() {
		System.out.println("After every method");
	}
	
	@BeforeClass
	public static void printBeforeClass() {
		System.out.println("this is for before class");
	}
	
	@AfterClass
	public static void printAfterClass() {
		System.out.println("this is for after class");
	}
//	@Test
//	public void testConnection() throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/graymatterdb","root","password");
//		assertEquals(con,DbConnection.getConnection());
//	}
	
}
