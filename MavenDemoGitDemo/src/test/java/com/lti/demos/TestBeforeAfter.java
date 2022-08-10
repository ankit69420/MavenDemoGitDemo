package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	int sum=0;
	Calculator c= new Calculator();
	
	
	@BeforeAll   // only once before all the test cases
	public static void testStartDbConn() {
		
		System.out.println("for database connection- only once"  );
	}
	
	
	
	@BeforeEach // before each test cases
	public void testStartup() {
		
		sum=0;
		System.out.println("sum is zero" + sum );
	}
	
	@Disabled
	@Test
	public void testAddTwoNo() {
		System.out.println("test case1" );
		int result= c.addNos(100, 300);
		Assertions.assertEquals(400, result);
	}
	
	@Disabled
	@Test // message is optional if test case fails msg displayed
	public void testSubNo() {
		System.out.println("test case2" );
		int result = c.subNos(300, 58);
		Assertions.assertEquals(242, result,"plzz check sub method");
	}
	
	@AfterEach
	public void testShutdown() {
		System.out.println("some object null"  );
		
	}
	@AfterAll
	public static void testShutDownConn() {
		
		System.out.println("shutting down database connection"  );
	}
	
}
