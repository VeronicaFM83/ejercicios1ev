package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		//CLASES
		Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
		
		//VARIABLES
		int num;
		
		//SOLICITUD DE DATOS
				System.out.println ("Por favor, introduzca un n�mero: ");
				num = Integer.parseInt(input.nextLine()); // Almacenamos el n�mero captado por teclado
		
		//RESPUESTA
				if ((num % 2) == 0) { //Se comprueba si al dividir entre 2 el resto es 0 y por tanto es par
					System.out.println ("El n�mero es PAR");
				} else {
					System.out.println ("El n�mero es IMPAR");
				} //fin de if-else
	} //fin de main

} //fin de clase ParImpar
