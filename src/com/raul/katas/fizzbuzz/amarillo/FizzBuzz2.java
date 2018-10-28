package com.raul.katas.fizzbuzz.amarillo;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz2 {

	private static List<String> listaFinal = new ArrayList<>();
	private static String mensaje="";
	private static boolean flagDivisible=false;
	
	
	public static boolean addDivisible3 (int numero){
		if(numero%3 == 0){
			mensaje+="Fizz";
			return flagDivisible = true;
		}
		return flagDivisible || false;
	}
		
	public static boolean addDivisible5 (int numero){
		if(numero%5 == 0){
			mensaje+="Buzz";
			return flagDivisible=true;
		}
		return flagDivisible || false;
	}
	
	public static boolean addNoDivisible (int numero){
		if(!flagDivisible){
			mensaje+=numero;
			return true;
		}
		return false;
	}
		
	public static void clear(){
		mensaje="";	
		flagDivisible=false;
	}
	
	public static List<String> goFizzBuzz (int numeroMax){
		for (int i=1; i<=numeroMax; i++){	
			addDivisible3(i);
			addDivisible5(i);
			addNoDivisible(i); 
			listaFinal.add(mensaje);
			clear();
		}
		return listaFinal;
	}
	
	public static boolean getFlag(){
		return flagDivisible;
	}
	
	public static void setFlag(boolean flag){
		flagDivisible=flag;
	}
	
	public static String getMensaje(){
		return mensaje;
	}
	
	
}
	
	
			

