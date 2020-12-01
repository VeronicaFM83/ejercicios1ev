package unidad4;

import java.util.Scanner;

public class Ejercicio5 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca NIF");
		String cif = input.nextLine();
		String test = "";
		int longitud = cif.length();
		int numeros, resto; 
		char letra = cif.charAt(longitud-1); // Guardamos el último caracter de la cadena cif
		
		if ( (longitud != 9) || Character.isDigit(letra) ) {
			System.out.println("Formato de CIF no válido");
		} else {
			numeros = Integer.parseInt(cif.substring(0, longitud-1)); // Almacenamos y pasamos a int el CIF eliminando la letra final
			resto = numeros % 23;
			switch (resto) {
				case 0:
					test = "T";
					break;
				case 1:
					test = "R";
					break;
				case 2:
					test = "W";
					break;
				case 3:
					test = "A";
					break;
				case 4:
					test = "G";
					break;
				case 5:
					test = "M";
					break;
				case 6:
					test = "Y";
					break;
				case 7:
					test = "F";
					break;
				case 8:
					test = "P";
					break;
				case 9:
					test = "D";
					break;
				case 10:
					test = "X";
					break;
				case 11:
					test = "B";
					break;
				case 12:
					test = "N";
					break;
				case 13:
					test = "J";
					break;
				case 14:
					test = "Z";
					break;
				case 15:
					test = "S";
					break;
				case 16:
					test = "Q";
					break;
				case 17:
					test = "V";
					break;
				case 18:
					test = "H";
					break;
				case 19:
					test = "L";
					break;
				case 20:
					test = "C";
					break;
				case 21:
					test = "K";
					break;
				case 22:
					test = "E";
					break;
			} // fin switch
			if (test.equalsIgnoreCase(Character.toString(letra).toUpperCase())) {
				System.out.println("CIF válido");
			} else {
				System.out.println("CIF NO válido");
			} // fin if-else
		} // fin if-else
	} // fin main
} // fin clase
