package unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca el n� de secuencias:");
		int sec = in.nextInt();
		/*while (isNaN(sec)) {
			System.out.println("Valor incorrecto. Debe introducir un n�mero");
			sec = in.nextInt();
		}*/
		
		int[][] vector = new int[sec][]; // El tama�o del array vector es el establecido por el usuario
		
		for (int i=0; i < sec; i++) {
			System.out.println("Introduzca cantidad de n�meros de la secuencia:");
			vector[i] = new int[in.nextInt()];
			for (int j=0; j<vector[i].length; j++) {
				System.out.println("Introduzca los n�meros de la secuencia separados por espacios:");
				vector[i][j] = in.nextInt();
			}
		}
		
		for (int [] v: vector)
			System.out.println(Arrays.toString(v));
		}

	/*private static boolean isNaN(int dim) {
		// TODO Auto-generated method stub
		return false;
	}*/
	
}
