package unidad4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Escriba el nombre de 10 personas.");
		String[] vector = new String[10];
		for (int i=0; i<vector.length; i++) {
			System.out.println("Escriba el nombre nº " + (i+1));
			vector[i] = input.nextLine();
		}
		String cadena = cadenaMayor(vector);
		
		System.out.println("El nombre más largo es: " + cadena);
	}
	
	static String cadenaMayor(String[] vector) {
		String cadena = vector[0];
		for (int i=1; i<vector.length; i++) {
			String nombre = vector[i];
			if (nombre.length() > cadena.length()) {
				cadena = vector[i];
			}
		}
		return cadena;
	}

}
