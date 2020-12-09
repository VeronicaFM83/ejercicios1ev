package unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class NotasMedias {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		  
		int[][] arrayMedias = new int[3][1];
		int numNotas = 0, notaMedia = 0;


		for (int j=0;j<3;j++) {
			double sumaNotas = 0;
			System.out.println("Introduzca nº de calificaciones de la " + (j+1) + "ª evaluación: ");
			numNotas = input.nextInt();
			//System.out.println(numNotas);
			double[][][] arrayNotas = new double[3][3][numNotas]; 
			for (int k=0; k<numNotas; k++) {
				
				System.out.println("Introduzca la nota " + (k+1) + " de la " + (j+1) + "ª evaluación: ");
				double nota = input.nextDouble();
				//System.out.println(nota);
				arrayNotas[j][j][k] = nota;
				sumaNotas += nota;
			}
			System.out.println(sumaNotas/numNotas);
			notaMedia = (int) Math.round(sumaNotas/numNotas);
			System.out.println(notaMedia);
			arrayMedias[j][0] = notaMedia;
			System.out.println(Arrays.toString(arrayMedias[j]));
			
		}
		for (int l=0;l<arrayMedias.length;l++) {
		   System.out.println("Media de la " + (l+1) + " eval: " + Arrays.toString(arrayMedias[l]));// imprime directamente el contenido del array pasado a String
		}
		input.close();
	}
}