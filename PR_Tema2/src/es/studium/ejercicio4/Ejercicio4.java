package es.studium.ejercicio4; //sacar los pares

import java.util.Scanner;

public class Ejercicio4
{

	public static void main(String[] args)
	{
		int num1, num2, i;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Dame un número:");
		num1 = in.nextInt();
		System.out.println("Dame otro número:");
		num2 = in.nextInt();
		in.close();
		for(i=num1; i<=num2; i++) {
			if(i%2==0)
				System.out.println(i);
		
			
	}
	}
	

}
