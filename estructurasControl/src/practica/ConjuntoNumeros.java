package practica;

import java.util.Scanner;

//Realizar un pseudoc�digo que determine de un conjunto de 6 n�meros introducidos por teclado cu�ntos son menores que 15
//cu�ntos mayores de 55 y cu�ntos est�n comprendidos entre 45 y 55

public class ConjuntoNumeros {
	
	public static void main(String[] args) {
		
		    Scanner entrada = new Scanner(System.in); {
		    
		    int menores15 = 0;
		    int mayores55 = 0;
		    int entre45y55= 0;
		    
		    System.out.println("Introduce seis numeros: ");
		    for(int cont = 1; cont <= 6; cont++) {
		    	
		    	System.out.println("Dime el numero: ");
		    	int num = entrada.nextInt();
		    	if (num < 15) 
		    	{	
		    		menores15++;
		    	}
		    	else if (num > 55)
		    	{
		    		mayores55++;
		    	}
		    	else if (num >= 45)
		    	{
		    		entre45y55++;
		    	}
		    	
		    }
		    System.out.println("numeros menores de 15: " + menores15);
		    System.out.println("numeros menores de 55: " + mayores55);
		    System.out.println("numeros entre 45 y 55: " + entre45y55);
		    
		    }
	}
}



