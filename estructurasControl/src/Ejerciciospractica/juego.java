package Ejerciciospractica;

import java.util.Scanner;

public class juego {

	public static void main(String[] args) {
		int n, num;
		// n es el n�mero que hay que acertar
		 // num guarda los n�meros introducidos
		 
		 Scanner entrada = new Scanner(System.in);
		 System.out.print("Introduce N: ");
		 n =entrada.nextInt();
		 System.out.print("Introduce n�mero: ");
		 num=entrada.nextInt();

		 while(num!=n) // mientras no coincidan ambos n�meros
		 {
		 if(num>n)
		 System.out.println("menor");
		 else
		 System.out.println("mayor");
		 System.out.print("Introduce n�mero: ");
		 num=entrada.nextInt();
		 }
		 // al salir del mientras tenemos la certeza que num es igual a n

		 System.out.println("acertaste...");
		 }
		

	}


