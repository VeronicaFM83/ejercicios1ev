package unidad4;

import java.util.Random;
import java.util.Scanner;

public class HundirBarcos {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 

		String[][] miArray = new String[10][10];
		Random r1 = new Random();
		int posX = r1.nextInt(9)+1; // se pasa como par�metro n�mero m�ximo-m�nimo y se suma el m�nimo
		System.out.print(posX);
		System.out.println();
		Random r2 = new Random();
		int posY = r2.nextInt(9)+1; // se pasa como par�metro n�mero m�ximo+m�nimo y se suma el m�nimo
		System.out.print(posY);
		System.out.println();
		miArray[posX][posY] = "BARCO";
		int intentos = 0;
		int testX = 11;
		int testY = 11;
		do {
			System.out.print("Indique una posici�n X (0-9)");
			testX = input.nextInt();
			System.out.print("Indique una posici�n Y (0-9)");
			testY = input.nextInt();
			intentos++;
			if (miArray[testX][testY] != "BARCO")
				System.out.print("AGUA! \n");
		} while (miArray[testX][testY] != "BARCO");
		System.out.print("HUNDIDO! \n");
		System.out.print("Intentos: " + intentos);
	}
}
