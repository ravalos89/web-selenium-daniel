package com.java;

public class Operators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// ARITMETICOS
		
		int suma = 3 + 4;
		int resta = 5 - 2;
		int multiplicacion = 3 * 4;
		
		// UNARIOS
		int count;
		count = 1;
		count++;
		
		System.out.println(count);
		
		// RELACIONAL
		int x = 1;
		int y = 2;
		
		if(x>y) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		
		// CONDICIONALES
		int z = 3;
		int a = 3;
		
		// AND
		if(x<y && z==a) {
			System.out.println("CONDICIONALES AND - TRUE");
		}else {
			System.out.println("CONDICIONALES AND - FALSE");
		}
		
		// OR
		if(x<y || z>a || z<a || x==y || y==z) {
			System.out.println("CONDICIONALES OR - TRUE");
		}else {
			System.out.println("CONDICIONALES OR - FALSE");
		}

	}

}
