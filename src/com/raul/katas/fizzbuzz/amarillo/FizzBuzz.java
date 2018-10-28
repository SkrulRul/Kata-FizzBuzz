package com.raul.katas.fizzbuzz.amarillo;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private static List<String> listaFinal = new ArrayList<>();
	private static String mensaje="";
	
	public static boolean divisible3 (int numero){
		return numero%3 == 0;		
	}
		
	public static boolean divisible5 (int numero){
		return numero%5 == 0;				
	}
	
	public static boolean noDivisible (int numero){
		return !divisible5(numero) && !divisible3(numero);				
	}
	
	public static void clearMensaje (){
		mensaje="";				
	}
	
	public static List<String> goFizzBuzz (int numeroMax){
		for (int i=1; i<=numeroMax; i++){	
			if(divisible3(i))  mensaje+="Fizz";
			if(divisible5(i))  mensaje+="Buzz";
			if(noDivisible(i)) mensaje+= i+"";
			listaFinal.add(mensaje);
			clearMensaje();
		}
		return listaFinal;
	}
}
	
	
			

