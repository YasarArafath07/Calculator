package com.teamsankya.calculator.Calculator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class AdditionTest {

	
		@Test
	public void add() {
		int sum = Addition.add(10,20);
		TestCase.assertEquals(30,sum);
	}
	/*	
		@Before
	public void executeBefore() {
		System.out.println("before test case");
	}*/

	}


