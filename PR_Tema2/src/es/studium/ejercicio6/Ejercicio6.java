package es.studium.ejercicio6;// dividir con decimales

import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		int numerador, denominador;
		double resultado;
		
Scanner in = new Scanner (System.in);
		
		System.out.println("Dame el numerador:");
		numerador = in.nextInt();
		System.out.println("Dame el denominador:");
		denominador = in.nextInt();
		in.close();
		
		resultado = dividir(numerador,denominador);
		System.out.println("La división da " + resultado);

	}

	private static double dividir(int num, int den)
	{
		double r;
		r = (double) num / (double) den; //si no pones el "double" sería una division entera.
		return r;
	}

}
