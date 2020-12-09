package unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//CLASES
		Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
		
		//VARIABLES
		System.out.println("Introduzca número de tiradas de dado");
		int tiradas = input.nextInt();
		int[] numeros = new int[tiradas];
		int[] repetido = new int[tiradas];
		int repeticion = 0;
		//int unicos = 0;
		
		//TIRADAS
		for (int i = 0; i < tiradas; i++) { // i es un contador para realizar n tiradas y guardar en array
			numeros[i] = (int) Math.floor(Math.random()*(1-6+1)+6); // Número random entre 1 y 6
			System.out.println("Tirada " + (i+1) + ": "+ numeros[i]);	
		}// fin de for
		
		//CONTAR REPETIDOS
		Arrays.sort(numeros); // Se ordena el contenido del array
		int[] copia = numeros; // Copiamos el contenido del array para comparar
		int copiaNum = 0; // Variable que sirve para comprobar si ya hemos leído ese número
		for (int j = 0 ; j < tiradas ; j++) { // j es un contador para leer array de la copia
        	repetido[j] = 0; // Ponemos el contador de repetidos a 0
        	if (copia[j] != copiaNum) { // Comprobamos si el número es igual que el anterior para saltárnoslo (ver línea 39)
	        	for (int k = 0; k < tiradas; k++) { // k es un contador para leer todo el array de numeros y comparar con cada posición del array copia
	        		if (copia[j] == numeros[k]) { // Se comprueba si el número es igual que la copia
	        			repetido[j]++; // Incrementamos número de repeticiones
	        		} // fin de if
	        	} // fin de for
	        	System.out.println("El número " + numeros[j] + " se ha repetido " + repetido[j] + " veces");
        	}// fin de if
        	copiaNum = numeros[j];
        } // fin de for
		
	} // fin de main
} // fin de la clase

