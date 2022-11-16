package es.studium.ejercicio10;

import java.util.Scanner;

public class Ejercicio10
{

	public static void main(String[] args)
	{
		int num1, num2, i;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Dame un número: ");
		num1 = in.nextInt();
		System.out.println("Dame otro número: ");
		num2 = in.nextInt();
		in.close();
		
		i = 1;
		while (i <=num2) {
			System.out.println(num1);
			i = i+1;
		}
	}

}
