package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {

	@Test
	void testExceptios() {
		Assertions.assertThrows(IllegalArgumentException.class,
						()->{Integer.parseInt("One");}
				);
	}
	
	@Test
	public void testMethodEmp() {
		Calculator c = new Calculator();
		
		final Exception e = assertThrows(ArithmeticException.class,
						()->{c.searchEmp(0);}
				);
		
		Assertions.assertEquals("Entered zero", e.getMessage());
	}

}
