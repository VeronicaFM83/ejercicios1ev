package unidad4;

import java.util.Scanner;

public class Ejercicio3 {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Escriba un texto");
		String texto1 = input.nextLine(); // Almacenamos texto por teclado
		System.out.println("Escriba otro texto");
		String texto2 = input.nextLine(); // Almacenamos texto por teclado
		
		String texto1Mayus = texto1.toUpperCase();
		String texto2Mayus = texto2.toUpperCase();
		
		if (texto2Mayus.equals(texto1Mayus))
			System.out.println(texto1 + " y " + texto2 + " son IGUALES");
			else {
				int index = texto1Mayus.indexOf(texto2Mayus);
				int contador = 0;
				if (index >=0) {
					//System.out.println(index);
					int i = 0;
					String str = texto1Mayus;
					while ((i < texto1Mayus.length()) && (index != -1)) {
						str = str.substring(index+texto2Mayus.length());
						//System.out.println(str);
						index = str.indexOf(texto2Mayus);
						//System.out.println(index);
						i=index;
						contador++;
					}
					 System.out.println("\"" + texto2 + "\" se encuentra dentro de \"" + texto1 + "\" " + contador + " veces");
					
			 } else
				 System.out.println(texto1 + " y " + texto2 + " son DIFERENTES");
		}	

	}

}
