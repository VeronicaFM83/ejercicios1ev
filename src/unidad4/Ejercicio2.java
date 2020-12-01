package unidad4;

import java.util.Scanner;

public class Ejercicio2 {
	
	//CLASES
	static Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
	
	public static void main(String[] args) {
		System.out.println("Escriba un texto");
		String texto = input.nextLine(); // Almacenamos texto por teclado
		StringBuffer invertido = new StringBuffer(texto); // Creamos un búfer de cadena con el texto
		invertido = invertido.reverse(); // Usamos el método reverse de StringBuffer
		System.out.println(texto + "\n" + invertido);
	}
}
