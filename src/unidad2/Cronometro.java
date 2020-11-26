package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) throws IOException {

		double time_start, time_end, time_result, time_sec;
		
		time_start = System.currentTimeMillis(); // Grabamos tiempo inicio
		
		System.out.println ("Dime tu nombre: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Usamos clase BufferedReader
		String name =  reader.readLine(); // Almacenamos el texto captado por teclado
		time_end = System.currentTimeMillis(); // Grabamos tiempo fin
		
		time_result = (time_end - time_start); // Tiempo transcurrido en milisegundos
		time_sec = time_result / 1000; // Pasamos a segundos
        System.out.println ("Hola " + name + ", has tardado " + time_sec + " segundos en decirme tu nombre");
	} // fin de main

} // fin de la clase Cronometro
