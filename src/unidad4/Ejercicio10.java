package unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
	
		public static void main(String[] args) {
			Random r = new Random();
			Scanner in = new Scanner(System.in);
			System.out.println("Introduzca el tamaño del vector (entre 10 y 20):");
			int dim = in.nextInt();
			while ((dim < 10) || (dim > 20)) {
				System.out.println("Valor incorrecto. Debe estar comprendido entre 10 y 20:");
				dim = in.nextInt();
			}
			
			int[] vector = new int[dim]; // El tamaño del array vector es el establecido por el usuarios
			
			for (int i=0; i<vector.length; i++) { // Recorre el array
					int num =r.nextInt(); // Num random
					vector[i] = num;
			}

			System.out.println("Contenido del vector: " + Arrays.toString(vector));
						
			int minDif = diferenciaAdyacentes(vector);
		
			System.out.println("Mínima diferencia entre dos valores adyacentes: " + minDif);
	}	

		static int diferenciaAdyacentes(int[] vector) {
			//PRUEBA CON BUCLE DO WHILE
			int i = 1;
			int minDif = vector[i] - vector[i-1];
			do {
				i++;
				int test = vector[i] - vector[i-1];
				if (test < minDif) {
					minDif = test;
				}
			} while (i < vector.length-1);
			
			//PRUEBA CON BUCLE FOR
			/*int minDif = vector[1] - vector[0];
			int dif;
			for (int i=2; i<vector.length; i++) {
			dif = vector[i] - vector[i-1];
			if (dif < minDif)
				minDif = dif;
			}*/
		
			return minDif;
		}

	}
