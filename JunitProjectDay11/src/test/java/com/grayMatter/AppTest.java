package com.grayMatter;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
	@Test
	public void testPrintName() {
		assertEquals("Naman",App.printName("Naman"));
	}
	
	@Test
	public void testCreateStudent() {
		Student expStudent= new Student("harish",23,44);
		
	}
	

	
}
