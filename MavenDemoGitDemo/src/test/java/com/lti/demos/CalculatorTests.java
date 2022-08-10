package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {

	Calculator c= new Calculator();
	@Disabled
	@Test
	public void testSayHello() {
		Assertions.assertEquals("Hello World", c.sayHello());
		
	}
	
	@Disabled
	@Test
	public void testAddTwoNo() {
		int result= c.addNos(100, 300);
		Assertions.assertEquals(400, result);
	}
	@Disabled
	@Test // message is optional if test case fails msg displayed
	public void testSubNo() {
		
		int result = c.subNos(300, 58);
		Assertions.assertEquals(242, result,"plzz check sub method");
	}
	@Disabled
	@Test
	public void testAssertNulls() {
		String s1= null;
		String s2= "Nikhil";
		Assertions.assertNotNull(s2);
		Assertions.assertNull(s2,"s2 is not Null");
		Assertions.assertNotNull(s1);
		
	}
	//@Disabled
	@Test
	public void testAssertFalse() {
		Assertions.assertFalse("Sumit".length()==10);
		Assertions.assertFalse(10>20," 10 is smaller");
		Assertions.assertNotEquals("Hello", "Hell");
		
	}
	
	@Test
	public void testArrays() {
		
		ArrayList<Integer> myList= new ArrayList();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		myList.add(30);
		myList.add(32);
		myList.add(69);
		Assertions.assertEquals(3, myList.size());
		
		
	}
	
}
