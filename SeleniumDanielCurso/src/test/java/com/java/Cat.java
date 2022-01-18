package com.java;

public class Cat {
	
	//Instancias
	private int numeroPatas;
	private int numeroColas;
	private String color;
	private String tamano;
	private double peso;
	private String nombre;
	
	
	public Cat(int numeroPatas, int numeroColas, String color, String tamano, double peso) {
		this.numeroPatas = numeroPatas;
		this.numeroColas = numeroColas;
		this.color = color;
		this.tamano = tamano;
		this.peso = peso;		
	}
	
	public Cat(int numeroPatas, int numeroColas, String color, String tamano, double peso, String nombre) {
		this.numeroPatas = numeroPatas;
		this.numeroColas = numeroColas;
		this.color = color;
		this.tamano = tamano;
		this.peso = peso;	
		this.nombre = nombre;
	}
	
	public Cat(int numeroColas, String color, String tamano, double peso, String nombre) {
		this.numeroPatas = 4;
		this.numeroColas = numeroColas;
		this.color = color;
		this.tamano = tamano;
		this.peso = peso;	
		this.nombre = nombre;
	}
	
	public void pesoGato() {
		System.out.println("El peso de mi gato es: "+ this.peso);
	}
	
	public void nombreGato() {
		System.out.println("El nombre de mi gato es: "+ this.nombre);
	}
	
	public void numeroPatasGato() {
		System.out.println("El numero de patas de mi gato es: "+ this.numeroPatas);
	}
	
	// GETTERS Y SETTERS
	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		if(numeroPatas>10) {
			numeroPatas = -1;
			System.out.println("**********Numero de patas Invalido");
		}
		this.numeroPatas = numeroPatas;
	}

	public int getNumeroColas() {
		return numeroColas;
	}

	public void setNumeroColas(int numeroColas) {
		this.numeroColas = numeroColas;
	}

	public String getColor() {
		if(this.color.equalsIgnoreCase("Azul")) {
//			this.color= this.color + " COLOR NO ADMITIDO, POR FAVOR AGREGAR UN COLOR VALIDO";
			this.color = "Blanco";
			System.out.println("Se seteo el gato con el color por dafult: "+ this.color);
		}
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
