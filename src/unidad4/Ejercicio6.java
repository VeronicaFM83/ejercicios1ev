package unidad4;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {

		int tamanio = (int) Math.floor(Math.random()*(10-50+1)+50);// Queremos que tamanio sea un n�mero entero entre 10 y 50
		int[] vector = new int[tamanio]; // El array tendr� una longitud aleatoria entre 10 y 50
		int num; // Almacenar� temporalmente el n�mero aleatorio
		int index = 0; // �ndice de la posici�n del n�mero en el array
		while (index < tamanio) {
			num = (int) Math.floor(Math.random()*(-100-100+1)+100);// Aleatorio entre -100 y 100;
			boolean repetido = false; // Inicializamos en false, el primer n�mero no puede estar repetido
				while (repetido == false) { // Comparamos el n�mero solo si no se ha comprobado ya que est� repetido
					for (int j=0; j < index; j++) { // Recorre el array para comprobar si el num ya existe
						if (num == vector[j]) { //Si el n�mero est� repetido establecemos true y salimos del bucle for
							repetido = true;
							break;
						}// fin de if
					}// fin de for
					if (repetido == false) {
						vector[index] = num; // Almacenamos el n�mero
						//System.out.println("Num grabado:" + num);
						index++;
					}// fin de if
				}// fin de while
		}// fin de while
		System.out.println("Tama�o del array: " + tamanio + ".\nArray:" + Arrays.toString(vector) + "\n\n");		
	}// fin de main

}// fin de class
