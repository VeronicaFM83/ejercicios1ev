package unidad4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		String num = null;
		StringBuffer cadena = new StringBuffer();
		do {
			System.out.println("Escriba un número para añadir al vector");
			num = input.nextLine();
			while (isNumeric(num) == false ) {
				System.out.println("Escriba un número para añadir al vector");
				num = input.nextLine();
			}

			
		cadena.append(num);
		} while (Integer.parseInt(num) > 0);
		System.out.println(cadena);
		
		String[] vector = new String[]{cadena.toString()};
		System.out.println(vector.toString());
		
	}

	/*static int centro(int[] vector) {
		return resultado;
	}
*/
	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}
