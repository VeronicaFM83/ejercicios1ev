package unidad3;

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) throws IOException {

		//CLASES
		Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
		
		//VARIABLES
		double[] numero = new double[3];
		
		//SOLICITAMOS DATOS
		for (int i = 0; i < 3; i++) { // i es un contador
			System.out.println("Introduzca número " + (i + 1) + ": ");
			numero[i] = input.nextDouble(); // Almacenamos número real (se usa "," para los decimales)
		} // fin de for
		
		//RESPUESTA
		if ((numero[0] == numero[1])) {
			if ((numero[1] == numero[2])) {
			System.out.println("Es equilatero");
			} else {
			System.out.println("Es isosceles");
			}// fin if-else
		} else {
			System.out.println("Es escaleno");
		} //fin if-else
		
	}// fin de main
}// fin de clase
