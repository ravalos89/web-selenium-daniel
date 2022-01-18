package com.java;

public class Methods {

	public static void main(String[] args) {
		
		
		printSuma(1, 1);
//		int resultado = suma(1,1);
//		System.out.println(resultado);
		helloWorld();

	}
	
	// METHODS
	public static int suma(int x, int y) {
		int sumaNumeros= x+y;
		return sumaNumeros;
	}
	
	public static void printSuma(int x, int y) {
		System.out.println("La suma es "+ suma(x, y));
		
	}
	
	public static void helloWorld() {
		System.out.println("Hello World");
	}

}
