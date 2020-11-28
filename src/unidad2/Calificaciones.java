package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws IOException {
		
		//DECLARACION DE VARIABLES
		double notaExam, calExam, calFinal;
		double notaTarea, sumTareas, mediaTareas, calTareas;
		double entero, decimal, suma;
		String asignaturas[] = {"Matemáticas", "Física", "Química"}; //Array con las asignaturas para usar con bucle
		double[][] ponderacion = {{0.9,0.1,3},{0.8,0.2,2},{0.85,0.15,3}}; //Array con las ponderaciones por cada asignaturas: 3 filas, 3 columnas
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); //Usamos clase BufferedReader (solo se hace 1 vez)
		
		// BUCLE PARA CALIFICACIONES DE CADA ASIGNATURA
		for (int j = 0; j < asignaturas.length; j++) //j  es un contador que inicia en 0 coincidiendo con el primer elemento del array
		{
			//INICIALIZA VARIABLES
			sumTareas = 0;
			
			//COMIENZA ASIGNATURA
			System.out.println ("ASIGNATURA: " + asignaturas[j] + "\n");
			
			//SOLITAMOS NOTAS
			System.out.println ("Introduzca la nota del examen: ");
			notaExam = Double.parseDouble(teclado.readLine()); //Almacenamos el número captado por teclado (puede tener decimales ".")
			
			//BUCLE PARA PEDIR CALIFICACIONES TAREAS
			for (int i = 1; i <= ponderacion[j][2]; i++) //i es un contador que se incrementa con cada iteración
			{
				System.out.println ("Introduzca calificación de la tarea " + i + ": ");
				notaTarea = Float.parseFloat(teclado.readLine()); //Almacenamos el número captado por teclado (puede tener decimales ".")
				sumTareas  += notaTarea; //Sumatorio de notas				
			}//fin buble for tareas
			
			//CALCULOS
			calExam = notaExam * ponderacion[j][0] ; //Calculamos ponderación de la nota del examen
			mediaTareas = sumTareas/ponderacion[j][2]; //Calculamos media de tareas: suma de las tareas entre nº de tareas
			calTareas = mediaTareas * ponderacion[j][1]; //Calculamos el 10% de la nota que corresponde a las tareas
			calFinal = calTareas + calExam;
			
			//REDONDEO
			entero = Math.floor(calFinal); //Separamos parte entera
			decimal = Math.round((calFinal - entero) * 100); //Dejamos la parte decimal, multiplicamos por 100 para pasar a enteros 2 dígitos
			decimal /= 100; //Dividimos entre 100 para volver a pasar a decimal una vez redondeado
			suma = entero + decimal;//Resultado redondeado a 2 dígitos
			
			//RESPUESTA
			System.out.println ("Su calificación en " + asignaturas[j] + " es: " + suma + "\n");
			if (suma >= 5) {
				System.out.println ("Felicidades, ha aprobado. \n");
			}else {
				System.out.println ("Ha suspendido. \n");
			} //fin if-else
			
			//AYUDA DEBUG
			/*System.out.println ("\n notaExam " + notaExam + " numTareas " + ponderacion[j][2] + " sumTareas " + sumTareas + " mediaTareas " + mediaTareas);
			System.out.println ("\n calTareas " + calTareas + " calExam " + calExam + " calFinal " + calFinal);
			System.out.println ("\n entero " + entero + " decimal " + decimal + " suma " + suma);*/

		}//fin bucle for asignatura
        
	} //fin de main

} //fin de la clase Calificaciones
