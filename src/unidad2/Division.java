package unidad2;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1234;
		double b = 532;
		double resultado = a/b;
		double entero = Math.floor(resultado);
		double decimal = Math.ceil((resultado-entero) * 100)/100;
		
		System.out.println("División: " + a + " / " + b + " = " +  resultado);
		System.out.println("Redondeo a dos decimales " + (entero + decimal));

	} // fin de main

} // fin de la clase Division
