package es.studium.ejercicio7;

import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		int num1;
		int num2;
		
		Scanner in = new Scanner (System.in);
		

		System.out.println("Dame un n�mero:");
		num1 = in.nextInt();
		System.out.println("Dame otro n�mero:");
		num2 = in.nextInt();
		
		if (num1==num2){
			System.out.println("Los n�meros son iguales");
		} else {
			if (num1 < num2) {
				System.out.println("El primero es menor que el segundo");
			} else {
				System.out.println("El primero es mayor que el segundo");
			}
		}
		in.close();
	
		
	

	}}
