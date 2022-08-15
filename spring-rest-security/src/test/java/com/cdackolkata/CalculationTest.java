/**
 * 
 */
package com.cdackolkata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.aspectj.lang.annotation.After;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

/**
 * @author a807228
 *
 */
public class CalculationTest {
  private int a;
   private  int b;
	
	@Before
	   public void init() {
		System.out.println("Before annotation executed");
		this.a=30;
		this.b=40;
	  }
	
	@Test
	public void additionTest(){
		Calculation clc=new Calculation();		
		assertEquals(70, clc.addition(a, b));
	}
	
	@Test
	public void subtractionTest(){
		Calculation clc=new Calculation();		
		assertEquals(10, clc.subtraction(40, 30));
	}
	
	
	@Test
	public void additionNegativeTest(){
		Calculation clc=new Calculation();		
		assertNotEquals(80, clc.addition(30, 40));
	}
	
	@After(value = "")
	public void alltestCasesCompletedOrnot() {
		System.out.println("All test cases compelted");
	}
	
	
}
