package es.studium.ejercicio8;

import java.util.Scanner;

public class Ejercicio8
{

	public static void main(String[] args)
	{
	int base1;
	int exponente1;
	int i;
	int resultado = 1;
	
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("Dame un número para la base: ");
	base1 = in.nextInt();
	System.out.println("Dame otro número para la: ");
	exponente1 = in.nextInt();
	
	in.close();
	for (i = 1; i <= exponente1; i++) {
		resultado = resultado * base1;
	
		
		}System.out.println("El resultado de la potencia es:" + resultado);
		;
	}
	
}
