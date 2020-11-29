package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		
		//CLASES
		Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
		
		//SOLICITAMOS DATOS
		System.out.println("Por favor, introduzca año (aaaa):");
		int anyo = input.nextInt(); // Almacenamos el número captado por teclado
		
		//TEST
		if ((anyo % 4 == 0)) {
			if ((anyo % 100) != 0) {
				if ((anyo % 400) == 0) {
					System.out.println("Es bisiesto (divisible entre 4 y 400 pero no entre 100)");
				} else {
					System.out.println("NO es bisiesto (no es divisible entre 400)");
				}// fin de if-else		
			} else {
				System.out.println("NO es bisiesto (es divisible entre 100)");
			}// fin de if-else		
		} else {
			System.out.println("NO es bisiesto (no es divisible entre 4");
		}// fin de if-else		
		
	}// fim de main
}// fin de clase
