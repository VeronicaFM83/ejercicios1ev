package unidad3;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Hora {

	public static void main(String[] args) {
		
		//CLASES
		Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
		
		//SOLICITAMOS DATOS
		System.out.println("Por favor, introduzca la hora (hh):");
		int hora = input.nextInt(); // Almacenamos el número captado por teclado
		
		System.out.println("Por favor, introduzca los minutos (mm):");
		int min = input.nextInt(); // Almacenamos el número captado por teclado
		
		System.out.println("Por favor, introduzca los segundos (ss):");
		int seg = input.nextInt(); // Almacenamos el número captado por teclado

		//CALCULO
		seg ++;
		if (seg == 60) {
			seg = 0;
			min++;
			if (min == 60) {
				min = 0;
				hora++;
				if (hora == 24) {
					hora = 0;
				}// fin if hora
			}// fin if min
		}//fin if seg
		
		//RESULTADO
		System.out.println("Hora introducida + 1 segundo: " + hora + ":" + min + ":" + seg);
		
	} // fin de main
} // fin de clase