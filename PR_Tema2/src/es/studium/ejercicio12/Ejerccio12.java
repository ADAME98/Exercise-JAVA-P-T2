package es.studium.ejercicio12;

import java.util.Scanner;

public class Ejerccio12
{

	public static void main(String[] args)
	{
		
	     int num1 , num2;
	     int result;
	     
	     Scanner in = new Scanner(System.in);
	     System.out.println("Dame un numero ENTERO");
	     num1=in.nextInt();
	     System.out.println("Dame otro numero ENTERO");
	     num2=in.nextInt();
	     in.close();
	     
	     result = suma(num1,num2);
	     System.out.println("El Resultado es " + result);
	     
	     
	}

	private static int suma(int num1, int num2)
	{
		int r; 
		r= num1+num2;
		return r;
	}

	

}
