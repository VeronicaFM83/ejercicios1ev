package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {

		//CLASES
		Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
		
		//VARIABLES
		int tabla = 0, respuesta, error = 0;
		
		//SOLICITA DATOS
		while ((tabla > 9) || (tabla < 1)) {
			System.out.println("¿Qué tabla de multiplicar desea repasar (1-9)?");
			tabla = input.nextInt();
		}// fin de while
		
		//BUCLE
		for (int i = 1; i <= 10; i++) { // i es un contador
			System.out.println("¿" + tabla + " por " + i + "?");
			respuesta = input.nextInt();
			if (respuesta != (tabla * i)) {
				System.out.println("Incorrecto. La respuesta es " + (tabla * i) + "\n");
				error ++;
			} else {
				System.out.println("Correcto.");
			}// fin de if-else
		}// fin de for
		if (error < 3) {
			System.out.println("Ha aprobado con " + error + " fallos.");
		} else {
			System.out.println("Ha suspendido con " + error + " fallos.");
		}// fin de if-else
	}// fin de main
}// fin de clase
