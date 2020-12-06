package unidad4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio7 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int [] vector;
		System.out.println("Introduce la dimensi√≥n del vetor (10<=dim<=1.000.000):");
		int dim = in.nextInt();
		vector = new int[dim];
		long t0 = System.currentTimeMillis();
		for (int i=0; i<vector.length; i++) {
			System.out.println("Vuelta " + i);
			int j;
			int n;
			do {
				//n = r.nextInt(15);
				System.out.println("introduzca num");
				n = input.nextInt();
				j = 0;
				System.out.println(j);
				while (j < i && vector[j] != n) { // Si j es menor que i (Ìndice del array) y el num de la posiciÛn j es diferente al n˙mero
					j++;} // entonces incrementa el contador j para comprobar el siguiente n˙mero
				System.out.println("j " + j);
				System.out.println(" i: " + i);
			} while (j != i);
			vector[i] = n;
			System.out.println("vector num: " + vector[i]);
		}
		long t1 = System.currentTimeMillis() - t0;
		System.out.println("Tama√±o del vector: " + vector.length);
		System.out.println("Tiempo empleado en llenarlo: " + t1 + " milisegundos");
		t0 = System.currentTimeMillis();
		int dif = 0;
		
 		t1 = System.currentTimeMillis() - t0;
 		System.out.println("Diferencia entre el valor mayor y el menor: " + dif);
		System.out.println("Tiempo empleado en calcular la diferencia: " + t1 + "milisegundos");
		System.out.println("El vector contiene: " + Arrays.toString(vector));
	}

}
