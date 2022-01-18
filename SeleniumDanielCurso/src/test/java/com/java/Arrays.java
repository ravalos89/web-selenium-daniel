package com.java;

public class Arrays {

	public static void main(String[] args) {
		
		// UNIDIMENSIONAL
		
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};		
		System.out.println("El dia de hoy es: "+dias[5]);
		
		int numeroPosiciones = dias.length;
		System.out.println(numeroPosiciones);
		
		for(int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}		
		
		// BIDIMENSIONAL
		String[][] nombreApellido = new String [3][4];
		
		nombreApellido[0][0] = "Ricardo";
		nombreApellido[0][1] = "Avalos";
		nombreApellido[1][0] = "Daniel";
		nombreApellido[1][1] = "Rodriguez";
		
//		System.out.println("El nombre es "+ nombreApellido[0][0] + " y el apellido es "+ nombreApellido[0][1]);
//		System.out.println("El nombre es "+ nombreApellido[1][0] + " y el apellido es "+ nombreApellido[1][1]);
		
		for(int i=0; i<1; i++) {
			for(int j=0; j<1; j++) {
				System.out.println("El nombre es "+ nombreApellido[i][j] + " y el apellido es "+ nombreApellido[i][j+1]);
			}
		}
		
		// MULTIDIMENSIONAL
		String [][][][] informacionPersonal = new String [2][2][2][2];
		
		informacionPersonal[0][0][0][0] = "Ricardo";
		informacionPersonal[0][1][0][0] = "Avalos";
		informacionPersonal[0][0][1][0] = "Monterrey";
		informacionPersonal[0][0][0][1] = "32";

	}

}
