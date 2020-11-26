package unidad2;

public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double euro = 3.6; 
		double cambio = 1.18;
		double dolar = (euro*cambio);
		double entero = Math.floor(dolar);
		double decimal = Math.ceil((dolar-entero) * 100)/100;
		System.out.println(euro + " euros equivalen a " + (entero+decimal) + " dólares ");


	} // fin de main

} // fin de la clase Conversor
