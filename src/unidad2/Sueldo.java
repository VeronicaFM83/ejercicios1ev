package unidad2;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		
		//CLASES
		Scanner input = new Scanner (System.in); // Objeto Scanner para captar datos por teclado
		
		//VARIABLES
		double sueldoBase, sueldoNeto, comision, importeVenta = 0, totalVentas = 0;
		int numVentas;
		
		//SOLICITUD DE DATOS
		System.out.println ("Por favor, introduzca sueldo base.");
		sueldoBase = Double.parseDouble(input.nextLine()); // Almacenamos el texto captado por teclado
		System.out.println ("¿Cuál es el porcentaje de comisión por venta?");
		comision = Integer.parseInt(input.nextLine()); // Almacenamos el texto captado por teclado
		System.out.println ("¿Cuántas ventas ha realizado este mes?");
		numVentas = Integer.parseInt(input.nextLine()); // Almacenamos el texto captado por teclado
		//BUCLE PARA SOLICITAR IMPORTE VENTAS
		for (int i = 1; (i <= numVentas) && (i != 0); i++) { //i es un contador
			System.out.println ("Introduzca importe de la venta nº" + i + ":");
			importeVenta = Double.parseDouble(input.nextLine()); // Almacenamos el texto captado por teclado
			totalVentas += importeVenta; // Sumatorio de importes de venta
		}
		
		//CALCULO
		sueldoNeto = sueldoBase + (totalVentas * (comision / 100));
	
		//REDONDEO
		double entero = (int) Math.floor(sueldoNeto); //Separamos parte entera
		double decimal = Math.round((sueldoNeto - entero) * 100); //Dejamos la parte decimal, multiplicamos por 100 para pasar a enteros 2 dígitos
		decimal /= 100; //Dividimos entre 100 para volver a pasar a decimal una vez redondeado
		sueldoNeto = entero + decimal; //Resultado redondeado a 2 dígitos
		
		//RESULTADO
		System.out.println ("Este mes su sueldo será: " + sueldoNeto + " euros\n");
		
	} //fin de main

} //fin de la clase Sueldo