 package es.studium.ejercicio9;

import java.util.Scanner;

public class Ejercicio9
{

	public static void main(String[] args)
	{
		int num1, num2;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Dame un número ENTERO: ");
		num1 = in.nextInt();
		System.out.println("Dame otro número ENTERO: ");
		num2 = in.nextInt();
		
		if (num1<num2){
		System.out.println("La suma de los numeros es "+(num1+num2));
		} else {
			System.out.println("La suma de los numeros es "+(num1*num2));
		} in.close();
		
	
			 
		
		

	}

}
