package es.studium.ejercicio3; //Saber si un numero es par o impar

import java.util.Scanner;

public class Ejercicio3
{

	public static void main(String[] args)
	{
		int num;
		Scanner in = new Scanner (System.in);
		System.out.println("Dame un n�mero:");
		num = in.nextInt();
		in.close();
		if(num%2==0){
			System.out.println("El n�mero es PAR");	
		}
		else 
		{
			System.out.println("El n�mero IMPAR");	
		}

	}

}
