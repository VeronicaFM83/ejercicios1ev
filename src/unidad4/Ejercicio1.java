package unidad4;

import java.util.Scanner;

public class Ejercicio1 {
	
	static Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
	
	public static void main(String[] args) {

		System.out.println("Escriba un texto");
		String cadena = input.nextLine(); //Guardamos el texto introducido por teclado
		int longitud = cadena.length(); // Almacenamos la longitud de la cadena ded texto
		cadena = cadena.toUpperCase(); // Pasamos el texto a mayúsculas para que todas las letras sean iguales
		String letra = "";
		int a = 0, e = 0, i = 0, o = 0, u = 0; // Contadores
		for (int j = 0; j < longitud; j++ ) { // i es un contador para recorrer los caracteres de la cadena
			letra = Character.toString(cadena.charAt(j)); // Almacenamos el primer caracter del texto y lo convertimos a String
			switch (letra) {
				case "A":
					a++;
					break;
				case "E":
					e++;
					break;
				case "I":
					i++;
					break;
				case "O":
					o++;
					break;
				case "U":
					u++;
					break;
				default:
					break;
			} // fin de switch
		} // fin de for
			System.out.println(" a: " + a + " veces \n e: " + e +  " veces \n i: " + i +  " veces \n o: " + o +  " veces \n u: " + u +  " veces \n");
			
	}// fin de main
} // fin de clase
