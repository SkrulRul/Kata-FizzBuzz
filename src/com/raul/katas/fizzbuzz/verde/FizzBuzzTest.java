package com.raul.katas.fizzbuzz.verde;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;

import org.junit.After;
import org.junit.Test;

public class FizzBuzzTest {
	
	
	private	int numDivisible5 = 5;
	private int numDivisible3 = 6;
	private int numNoDivisible = 4;
	private	int numContiene5 = 51;
	private int numContiene3 = 31;
	private int numNoContiene = 77;
	private List<String> lista = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","Fizz","14","FizzBuzz"); 
		
	
	@Test
	public void testDivisible3() {
		assertEquals(true, FizzBuzz.divisible3(numDivisible3));
		assertEquals(false, FizzBuzz.divisible3(numDivisible5));
	}
	
	@Test
	public void testDivisible5() {
		assertEquals(true, FizzBuzz.divisible5(numDivisible5));
		assertEquals(false, FizzBuzz.divisible5(numDivisible3));
	}
	
	@Test
	public void testNoDivisible() {
		assertEquals(true, FizzBuzz.noDivisible(numNoDivisible));
		assertEquals(false, FizzBuzz.noDivisible(numDivisible3));
	}
	
	@Test
	public void testContiene3() {
		assertEquals(true, FizzBuzz.contiene3(numContiene3));
		assertEquals(false, FizzBuzz.contiene3(numContiene5));
	}
	
	@Test
	public void testContiene5() {
		assertEquals(true, FizzBuzz.contiene5(numContiene5));
		assertEquals(false, FizzBuzz.contiene5(numContiene3));
	}
	
	@Test
	public void testNoContiene() {
		assertEquals(true, FizzBuzz.noContiene(numNoContiene));
		assertEquals(false, FizzBuzz.noContiene(numContiene5));
	}
	
	@Test
	public void testGoFizzBuzz() {
		assertArrayEquals((lista.toArray()), FizzBuzz.goFizzBuzz(15).toArray());
	}
	
	@After
	public void limpiar() {
		FizzBuzz.clearMensaje();
	}
		
	
	

}
