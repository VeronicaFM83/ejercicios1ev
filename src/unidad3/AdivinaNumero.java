package unidad3;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		//CLASES
		Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
		
		//VARIABLES
		int max = (int) Math.floor(Math.random()*(1000-100000+1)+100000);// Queremos que N (el valor m�ximo) sea un n�mero entero entre 1.000 y 100.000
		int valor = (int) Math.floor(Math.random()*(1-max+1)+max);// Este es el n�mero a adivinar
		int num;
		
		System.out.println("He pensado un n�mero entre 1 y " + max +", adivina cu�l es: ");
		num = input.nextInt();
		
		while (num != valor) {
			if (num > valor) {
				System.out.println("El n�mero introducido es mayor, vuelva a intentarlo");
			} else {
				System.out.println("El n�mero introducido es menor, vuelva a intentarlo");
			} //fin de if-else
			num = input.nextInt();
		}// fin de while
		System.out.println("�CORRECTO!");
		
	}//fin de main
}// fin de la clase
