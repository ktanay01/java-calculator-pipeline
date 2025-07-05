package com.tanay.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator c = new Calculator();
		assertEquals(11,c.add(5, 5));
		
	}

}
