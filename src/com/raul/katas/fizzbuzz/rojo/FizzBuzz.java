package com.raul.katas.fizzbuzz.rojo;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	/********** SIN HACER ***********/
	
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
	
	public static boolean contiene3(int numero) {
		boolean flagEncontrado=false;
		String numeroStr = numero+"";
				
		for(int i=0; i<numeroStr.length() && !flagEncontrado; i++)
			if (numeroStr.charAt(i)=='3'){
				flagEncontrado=true;
				return true;	
			}
		return false;
	}

	public static boolean contiene5(int numero) {
		boolean flagEncontrado=false;
		String numeroStr = numero+"";
				
		for(int i=0; i<numeroStr.length() && !flagEncontrado; i++)
			if (numeroStr.charAt(i)=='5'){
				flagEncontrado=true;
				return true;	
			}
		return false;
	}

	public static boolean noContiene(int numero) {
		boolean flagEncontrado=true;
		String numeroStr = numero+"";
		
		for(int i=0; i<numeroStr.length() && flagEncontrado; i++)
			if (numeroStr.charAt(i)=='5' || numeroStr.charAt(i)=='3'){
				flagEncontrado=true;
				return false;	
			}
		return true;
	}
	
	public static void clearMensaje (){
		mensaje="";				
	}
	
	public static List<String> goFizzBuzz (int numeroMax){
		for (int i=1; i<=numeroMax; i++){	
			if(divisible3(i) || contiene3(i))  mensaje+="Fizz";
			if(divisible5(i) || contiene5(i))  mensaje+="Buzz";
			if(noDivisible(i) && noContiene(i)) mensaje+= i+"";
			listaFinal.add(mensaje);
			clearMensaje();
		}
		return listaFinal;
	}
	
}
	
	
			

