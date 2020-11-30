package unidad3;

import java.util.Scanner;

public class TrianguloFloyd {

	public static void main(String[] args) {
		//CLASES
		Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
		
		//VARIABLES
		int filas, num = 1;

		//SOLICITAMOS DATOS
		System.out.println("Introduzca número de filas");
		filas = input.nextInt();
		
		//RESPUESTA
		for (int i = 1; i <= filas; i++) { // contador que controla las filas
			for (int j = 1; j <= i; j++) { // contador que escribe los números
				System.out.print("\t" + num); // \t -----> Tabulador
                num++;
			}// fin de for
			System.out.println("\n");
		}// fin de for
	}// fin de main
}// fin de la clase
