package com.java;

public class Main {

	public static void main(String[] args) {
		
//		// Maltese
//		Dog mydog = new Dog();
//		mydog.name = "Puppy";
//		mydog.age = 2;
//		mydog.color = "white";
//		mydog.size = "Small";
//		mydog.breed = "Maltese";
//		mydog.isTired = true;
//		
//		mydog.run();
//		mydog.sit();
//		
//		// CHOW CHOW
//		Dog mydog2 = new Dog();
//		mydog2.name = "firulais";
//		mydog2.age = 3;
//		mydog2.color = "Brown";
//		mydog2.size = "Medium";
//		mydog2.breed = "chowchow";
//		mydog2.isTired = false;
//		
//		mydog2.run();
//		mydog2.sit();
		
		// GATO 1
		Cat gato1 = new Cat(4, 1, "Blanco", "Mediano", 2.5);
		gato1.nombreGato();
		gato1.pesoGato();
		
		System.out.println("El gato1 tiene color: "+gato1.getColor());
		gato1.setColor("Azul");
		System.out.println("Ahora El gato1 tiene color: "+gato1.getColor());
		
		Cat gato2 = new Cat(3, 2, "Cafe", "Chico", 3.5);
		gato2.nombreGato();
		gato2.pesoGato();
		
		Cat gato3 = new Cat(4, 2, "Negro", "Grande", 4.5, "Gatulias");
		gato3.nombreGato();
		gato3.pesoGato();
		
		Cat gato4 = new Cat(2, "Negro", "Grande", 4.5, "Gatulias");
		gato4.setNumeroPatas(9);
		gato4.nombreGato();
		gato4.pesoGato();
		gato4.numeroPatasGato();
		
		System.out.println("Gato 4 tiene "+gato4.getNumeroPatas()+ " patas");
		
//		// HERENCIA
//		
//		Padre juan = new Padre("Juan Manuel", 1.73);
//		juan.colorOjos();
//		
//		Hijo ricardo = new Hijo("Ricardo", 1.76);
//		ricardo.colorOjos();
//		
//		Nieto ricardito = new Nieto("Ricardito", 1.20);
//		ricardito.colorOjos();
		

	}

}
