package Ejerciciospractica;

import java.util.Scanner;

/*Pedir el d�a, mes y a�o de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
30 d�as.*/

public class mesa�odia {
	
	public static void main(String[] args) {
		int dia,mes,a�o;
		 // para que una fecha sea correcta se tiene que cumplir
		 // d�a en el rango 1..30
		 // mes en el rango 1..12
		 // a�o cualquiera distinto del 0
		 Scanner entrada = new Scanner(System.in);
		 System.out.print("Introduzca d�a: ");
		 dia=entrada.nextInt();
		 System.out.print("Introduzca mes: ");
		 mes=entrada.nextInt();
		 System.out.print("Introduzca a�o: ");
		 a�o=entrada.nextInt();

		 if (dia >= 1 && dia <=30)
			 if (mes >= 1 && mes <= 12)
				 if (a�o != 0)
					 System.out.println ("Fecha correcta");
				 	else
				 		System.out.println ("A�o incorrecto");
				 	else
				 		System.out.println("Mes incorrecto");
				 	else
				 		System.out.println("D�a incorrecto");

				 }
	}


