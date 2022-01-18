package com.java;

public class Padre {
	
	String nombre;
	double estatura;

	public Padre(String nombre, double estatura) {
		super();
		this.nombre = nombre;
		this.estatura = estatura;
	}

	public void colorOjos() {
		System.out.println(this.nombre + " tiene los ojos cafe claro");
	}
	
}
