package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//CLASES
		Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
		
		//VARIABLES
		int opc;
		double num1, num2;
		
		//SOLICITAR DATOS
		System.out.println("Seleccione qué desea hacer: \n 1-Sumar \n 2-Restar \n 3-Multiplicar \n 4-Dividir \n 5-Salir");
		opc = input.nextInt(); //Captamos número por teclado
		if ((opc < 5) && (opc > 0)) {
			System.out.println("Introduzca primer número");
			num1 = input.nextDouble(); //Captamos número por teclado
			System.out.println("Introduzca segundo número");
			num2 = input.nextDouble(); //Captamos número por teclado
			switch (opc) {
				case 1:
					System.out.println("El resultado es: " + (num1 + num2));
					break;
				case 2:
					System.out.println("El resultado es: " + (num1 - num2));
					break;
				case 3:
					System.out.println("El resultado es: " + (num1 * num2));
					break;
				case 4:
					System.out.println("El resultado es: " + (num1 / num2));
					break;
				default:
					System.out.println("Error");
					break;
			}// fin de case
		} else {
			if (opc == 5) {
				System.out.println("Adiós");
			} else {
			System.out.println("Error");
			} // fin de if-else
		}// fin de if-else
	}// fin de main
}// fin de la clase
