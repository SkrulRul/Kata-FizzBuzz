package com.raul.katas.fizzbuzz.amarillo;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;

import org.junit.Test;

public class FizzBuzzTest {
	
	
	private	int numDivisible5 = 5;
	private int numDivisible3 = 6;
	private int numNoDivisible = 4;
	private List<String> lista = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"); 
		
	
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
	public void testGoFizzBuzz() {
		int indiceListaTest = 14;
		assertEquals(lista.get(indiceListaTest), FizzBuzz.goFizzBuzz(15).get(indiceListaTest));
	}
	
	

}
