package Ejerciciospractica;

import java.util.Scanner;

public class numerosmostrados {

	public static void main(String[] args) {
		int num, contador;
		 // num guardar� los n�meros introducidos
		 // y contador se incrementar� para llevar la cuenta de los n�meros introducidos

		 Scanner entrada = new Scanner(System.in);	
		 System.out.print("Introduzca un n�mero: ");
		 num=entrada.nextInt();
		 contador=0; // al comienzo el n�mero de n�meros introducidos es 0

		 while(num>0) // mientras num sea positiva
		 {
		 contador =contador+1; // contador toma el valor que tuviera en este momento m�s uno
		 // en definitiva: contador se incrementa en uno
		 System.out.print("Introduzca otro n�mero: ");
		 num=entrada.nextInt();
		 }
		 System.out.println("Se han introducido: " +contador + " n�meros");
		 // sin tener en cuenta el �ltimo n�mero negativo.
		 }
	}

