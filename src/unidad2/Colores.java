package unidad2;

import java.util.Scanner;

public class Colores {

	public static void main(String[] args) {
			
			//CLASES
			Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
			
			//VARIABLES
			int n, r, g, b;
			double y, i, q;
			String[] rgb = {"R","G","B"};
			String[] yiq = {"Y","I","Q"};
			int rgbValor[] = new int[3];
			double yiqValor[] = new double[3];
			
			//SOLICITUD DE DATOS
			for (int k = 0; k < rgb.length; k++ ) { // k es un contador que comienza en 0 para leer el contenido de arrays
				System.out.println ("Por favor, introduzca la componente rgb " + rgb[k] + " del color a convertir: ");
				n = Integer.parseInt(input.nextLine()); // Almacenamos el número captado por teclado
				while ((n > 255) || (n < 0)) { // Comprobamos que sea un número entre 0 y 255
					System.out.println ("Por favor, introduzca un valor válido para " + rgb[k]);
					n = Integer.parseInt(input.nextLine()); // Almacenamos el número captado por teclado
				}// fin de while
				rgbValor[k] = (int) n; // Almacenamos el número dentro de array
			}// fin de for
			
			//CALCULO
			yiqValor[0] = (0.299 * rgbValor[0]) + (0.587 * rgbValor[1]) + (0.114 * rgbValor[2]);
			yiqValor[1] = (0.596 * rgbValor[0]) + (0.275 * rgbValor[1]) + (0.321 * rgbValor[2]);
			yiqValor[2] = (0.212 * rgbValor[0]) + (0.528 * rgbValor[1]) + (0.311 * rgbValor[2]);
		
			//REDONDEO
			for (int j = 0; j < yiqValor.length; j++ ) { // j es un contador que comienza en 0 para leer el contenido de arrays
				double entero = (int) Math.floor(yiqValor[j]); // Separamos parte entera
				double decimal = Math.round((yiqValor[j] - entero) * 100); // Dejamos la parte decimal, multiplicamos por 100 para pasar a enteros 2 dígitos
				decimal /= 100; // Dividimos entre 100 para volver a pasar a decimal una vez redondeado
				yiqValor[j] = entero + decimal; // Resultado redondeado a 2 dígitos
				System.out.println (yiq[j] + ": " + yiqValor[j] + "\n");
			}
			
		} //fin de main

	} //fin de la clase colores
