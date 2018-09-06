package com.teamsankya.calculator.Calculator;

import org.apache.log4j.Logger;

public class Addition {
	private static final Logger LOGGER = Logger.getLogger(Addition.class);

	public static int add(int a, int b) {
		LOGGER.info("adding two integers " + a + "" + b);
		System.out.println("adding two integers");
		System.out.println("adding two integers");
		
		return a + b;
	}

	public static long add(long a, long b) {
		LOGGER.info( "adding two intergers");
		return a + b;

	}
	
	

	public static float add(float a, float b) {
		return a + b;

	}

	public static double add(double a, double b) {
		return a + b;
		
 
	}

}
