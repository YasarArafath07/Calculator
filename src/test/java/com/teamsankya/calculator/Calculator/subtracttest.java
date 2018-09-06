package com.teamsankya.calculator.Calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;

public class subtracttest {
	@Test
	public void sub() {
		int sub  =Subraction.sub(100, 20);
		TestCase.assertEquals(80, sub);
	}
	@After
	public void sub2() {
		int sub = Subraction.sub(20, 40);
		TestCase.assertEquals(-20, sub);
	}
	@Before
	public void sub3() {
		int sub=Subraction.sub(50, 10);
		TestCase.assertEquals(40, sub);
	}
	@Ignore
	public void sub4() {
		int sub = Subraction.sub(100,200);
		TestCase.assertEquals(-100, sub);
	}
	
}
