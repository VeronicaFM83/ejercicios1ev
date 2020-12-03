package unidad4;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {

		int tamanio = (int) Math.floor(Math.random()*(10-50+1)+50);// Queremos que tamanio sea un número entero entre 10 y 50
		int[] vector = new int[tamanio]; // El array tendrá una longitud aleatoria entre 10 y 50
		int num; // Almacenará temporalmente el número aleatorio
		int index = 0; // Índice de la posición del número en el array
		while (index < tamanio) {
			num = (int) Math.floor(Math.random()*(-100-100+1)+100);// Aleatorio entre -100 y 100;
			boolean repetido = false; // Inicializamos en false, el primer número no puede estar repetido
				while (repetido == false) { // Comparamos el número solo si no se ha comprobado ya que está repetido
					for (int j=0; j < index; j++) { // Recorre el array para comprobar si el num ya existe
						if (num == vector[j]) { //Si el número está repetido establecemos true y salimos del bucle for
							repetido = true;
							break;
						}// fin de if
					}// fin de for
					if (repetido == false) {
						vector[index] = num; // Almacenamos el número
						//System.out.println("Num grabado:" + num);
						index++;
					}// fin de if
				}// fin de while
		}// fin de while
		System.out.println("Tamaño del array: " + tamanio + ".\nArray:" + Arrays.toString(vector) + "\n\n");		
	}// fin de main

}// fin de class
