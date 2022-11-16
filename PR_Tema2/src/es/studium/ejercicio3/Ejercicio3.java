package es.studium.ejercicio3; //Saber si un numero es par o impar

import java.util.Scanner;

public class Ejercicio3
{

	public static void main(String[] args)
	{
		int num;
		Scanner in = new Scanner (System.in);
		System.out.println("Dame un número:");
		num = in.nextInt();
		in.close();
		if(num%2==0){
			System.out.println("El número es PAR");	
		}
		else 
		{
			System.out.println("El número IMPAR");	
		}

	}

}
