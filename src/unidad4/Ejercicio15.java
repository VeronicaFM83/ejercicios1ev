package unidad4;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("�Cu�ntos alumnos y sus calificaciones desea introducir?");
		int numAlumnos = Integer.parseInt(input.nextLine());
		
		String[] arrayAlumnos = new String[numAlumnos];
		int[][][] arrayMedias;

		int numNotas, notaMedia = 0;
		String opc = ""; 

		for (int i=0; i<numAlumnos; i++) {
			
			System.out.println("Introduzca el nombre del alumno n� " + (i+1) + ": \n");
			arrayAlumnos[i] = input.nextLine();
			arrayMedias = notasMedias(numAlumnos, i);
			if (i==numAlumnos-1) {
				for (int [][] x: arrayMedias) {
					for (int y[]: x) {
						//System.out.printf("%-5d", y);
						for (int z: y) {
						System.out.printf("%-5d", z);
						System.out.println();
						}
					}
				}
			}
		}
		
			do {
				System.out.println("�Qu� desea hacer? \n "
					+ "	1. Mostrar la nota media de todos los alumnos.\n"
					+ "	2. Mostrar la nota media de un alumno determinado.\n"
					+ "	3. Visualizar las notas por evaluaci�n y la nota final de cada evaluaci�n.\n"
					+ "	4. Visualizar las notas por evaluaci�n y la nota final de un alumno determinado.\n"
					+ "	5. Calcular la nota media del curso.\n"
					+ "	6. Calcular la nota m�s alta y la m�s baja e indicar a qu� alumno y evaluaci�n pertenece.\n"
					+ "	7. Salir.");
				opc = "1";
			} while (isNaN(opc));
			
			switch (opc) {
			case "1":
				//notaMedTodos(arrayMedias, arrayAlumnos);
				break;
			case "2":
				//notaMedAlum();
				break;
			case "3":
				//notasTodos();
				break;
			case "4":
				//notaAlum();
				break;
			case "5":
				//notaMedCurso();
				break;
			case "6":
				//notaAlta();
				//notaBaja();
				break;
			case "7":
				System.out.println("Adi�s");
			}
			input.close();
		
}

	
	private static boolean isNaN(String opc) {
		// TODO Auto-generated method stub
		return false;
	}


	public static void notaMedTodos(int[][] arrayMedias, String[] arrayAlumnos) {
		for (int i=0;i < arrayAlumnos.length; i++) {
			System.out.println("Nombre alumno: " + arrayAlumnos[i]);
			for (int j=0; j<3; j++) {
				for (int k=0; k<(arrayMedias[j].length);k++) {
				System.out.println("\n Nota media eval " + (j+1) + ": " + arrayMedias[j][k]);
				}
			}
		}
	}
	
	public static int[][][] notasMedias(int numAlumnos, int i) {
		Scanner input = new Scanner (System.in);
		
		int numNotas = 0, notaMedia = 0;
		int[][][] arrayMedias = new int[numAlumnos][3][1];

		for (int j=0;j<3;j++) {
			double sumaNotas = 0;
			System.out.println("Introduzca n� de calificaciones de la " + (j+1) + "� evaluaci�n: ");
			numNotas = input.nextInt();
			//System.out.println(numNotas);
			double[][][] arrayNotas = new double[3][3][numNotas]; 
			for (int k=0; k<numNotas; k++) {
				
				System.out.println("Introduzca la nota " + (k+1) + " de la " + (j+1) + "� evaluaci�n: ");
				double nota = input.nextDouble();
				//System.out.println(nota);
				arrayNotas[j][j][k] = nota;
				sumaNotas += nota;
			}
			//System.out.println(sumaNotas/numNotas);
			notaMedia = (int) Math.round(sumaNotas/numNotas);
			arrayMedias[i][j][0] = notaMedia;
			System.out.println("Nota media (int):" + notaMedia);
		}
		
		//input.close();
		return arrayMedias;
	}
}


