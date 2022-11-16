package es.studium.ejercicio16;

import java.util.Scanner;

public class Ejercicio16
{

	public static void main(String[] args)
	{
		int num1,num2,num3;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Dame tres numeros: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		in.close();
		
		System.out.println("El resultado de la expresion es:" + expresion (num1,num2,num3));
	}

	private static float expresion(int num1, int num2, int num3)
	{
		// TODO Auto-generated method stub
		return (((((float)num2*(float)num2-(4*(float)num1*(float)num3))/(2*(float)num1))));
	}
	

}
