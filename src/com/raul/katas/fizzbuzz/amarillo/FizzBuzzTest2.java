package com.raul.katas.fizzbuzz.amarillo;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;

import org.junit.After;
import org.junit.Test;

public class FizzBuzzTest2 {
	
	
	private	int numDivisible5 = 5;
	private int numDivisible3 = 3;
	private int numNoDivisible = 4;
	private List<String> lista = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"); 
		
	@After
	public void limpiar(){
		FizzBuzz2.clear();
	}
	
	@Test
	public void testDivisible3() {
		assertEquals(true, FizzBuzz2.addDivisible3(numDivisible3));
		FizzBuzz2.clear();
		assertEquals(false, FizzBuzz2.addDivisible3(numDivisible5));
	}
	
	@Test
	public void testDivisible5() {
		assertEquals(false, FizzBuzz2.addDivisible5(numDivisible3));
		FizzBuzz2.clear();
		assertEquals(true, FizzBuzz2.addDivisible5(numDivisible5));
	}
	
	@Test
	public void testNoDivisible() {
		FizzBuzz2.setFlag(true);
		assertEquals(false, FizzBuzz2.addNoDivisible(numDivisible3));
		FizzBuzz2.setFlag(false);
		assertEquals(true, FizzBuzz2.addNoDivisible(numNoDivisible));
	}
	
	@Test
	public void testGoFizzBuzz() {
		int indiceListaTest = 14;
		assertEquals(lista.get(indiceListaTest), FizzBuzz2.goFizzBuzz(15).get(indiceListaTest));
	}
	
	

}
