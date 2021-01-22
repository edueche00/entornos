package ArraysBidimensionales;

import java.io.IOException;

import Practica3.Cadena;

public class Matriz {
	private double[][] matriz;
	private int numFilas;
	private int numColum;
	
	/////////////////////////
	public Matriz(int numFilas, int numColum)
	{
		this.numFilas = numFilas;
		this.numColum = numColum;
		matriz = new double [numFilas][numColum];
	}
////////////////////////////////////////////
	public Matriz (Matriz copia)
	{
		numFilas = copia.numFilas;
		numColum = copia.numColum;
		matriz = new double [numFilas][numColum] ;
		int i;
		int j;
		for(i = 0; copia.matriz[i][j] != 0; i++)
		{
			matriz[i] = copia.matriz[i];
		}
		matriz[i][j] = 0;
	}
<<>	
	////////////////////////////////
	public void leerMatriz() throws IOException
	{
		int i = 0,0;
		char letra = (char)System.in.read();	
		
		while(i < tamMax && letra != '\n')
		{
			cadena[i] = letra;
			i++;
			letra = (char)System.in.read();	
		}
		cadena[i] = '\0';
	}
	}
-85n
