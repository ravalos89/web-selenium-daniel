package com.java;

public class LoopsStatements {
	
	public static void main(String[] args) {
		
		//while - contador del 1 al 10
		
		int initialNumber = 1;
		
		while(initialNumber<=10) {
			System.out.println("El numero es "+ initialNumber);
			++initialNumber;
		}
		
		// DO while - ¿Cuantas veces se tiene que sumar un mismo numero para llegar a cierto numero?
		int ciertoNumero=10;
		int numero = 1;
		
		int numeroSumar = 0;
		int count = 0;
		
		do {
			numeroSumar = numeroSumar + numero;
			++count;
		} while(numeroSumar<ciertoNumero);
		
		System.out.println("El numero "+numero+ " se tuvo que sumar "+count+ " veces para llegar a "+ciertoNumero);
		
		// FOR
		int numeroFor =10;
		
		for(int i = 1; i<=numeroFor; i++) {
			System.out.println("First loop - El numero FOR es "+ i);
			for(int j = 1; j<=numeroFor; j++) {
				System.out.println("Second loop - El numero FOR es "+ i);
			}
			
		}
		
	}
	
	
	
	

}
