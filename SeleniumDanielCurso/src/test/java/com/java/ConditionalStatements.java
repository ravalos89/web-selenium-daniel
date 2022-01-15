package com.java;

public class ConditionalStatements {

	public static void main(String[] args) {

		// Variables
		int velocidad;
		int limiteVelocidad;
		boolean esCarretera;
		boolean esZonaEscolar;

		// Valores reales
		velocidad = 80; // KM*H
		limiteVelocidad = 60; // KM*H
		esCarretera = true;
		esZonaEscolar = false;

//		if (esCarretera == true) {
//			System.out.println("CARRETERA");
//			limiteVelocidad = 110;
//
//			// DISPOSITIVO
//			if (velocidad > limiteVelocidad) {
//				System.out.println("MULTA! LIMITE VELOCIDAD EXCEDIDO");
//			} else {
//				System.out.println("DESCUENTO TENENCIA!");
//			}
//		} else if (velocidad > limiteVelocidad) {
//			System.out.println("CALLE");
//			System.out.println("MULTA! LIMITE VELOCIDAD EXCEDIDO");
//		} else {
//			System.out.println("DESCUENTO TENENCIA!");
//		}
		
		if(esCarretera==true && esZonaEscolar==true) {
			System.out.println("ERROR");
		}else if(esCarretera==true && esZonaEscolar==false) {
			System.out.println("CARRETERA");
			limiteVelocidad = 110;
			// DISPOSITIVO
			if (velocidad > limiteVelocidad) {
				System.out.println("MULTA! LIMITE VELOCIDAD EXCEDIDO");
			} else {
				System.out.println("DESCUENTO TENENCIA!");
			}
			
		}else if(esCarretera==false && esZonaEscolar==true) {
			System.out.println("ZONA ESCOLAR");
			limiteVelocidad = 30;
			// DISPOSITIVO
			if (velocidad > limiteVelocidad) {
				System.out.println("MULTA! LIMITE VELOCIDAD EXCEDIDO");
			} else {
				System.out.println("DESCUENTO TENENCIA!");
			}
		}else {
			if(velocidad > limiteVelocidad) {
				System.out.println("CALLE");
				System.out.println("MULTA! LIMITE VELOCIDAD EXCEDIDO");
			} else {
				System.out.println("DESCUENTO TENENCIA!");
			}
		}

		// SWITCH
		int temperatura = -1;

		switch (temperatura) {

		// Block code
		case 5:
		case -1:
			System.out.println("Clima muy frio");
			break;

		case 10:
			System.out.println("Clima frio");
			break;

		case 20:
		case 17:
			System.out.println("Clima templado");
			break;

		case 40:
			System.out.println("Clima caliente");
			break;

		default:
			System.out.println("Clima indistinto");
			break;
		}

	}

}
