package es.estudium.Ejercicio14;

import java.util.Scanner;

public class Ejercicio14
{
	 public static void main(String[] args) {
		    
		 int base , expont;
	     int result;
	     
	     Scanner in = new Scanner(System.in);
	     System.out.println("Dame un numero Base");
	     base=in.nextInt();
	     System.out.println("Dame otro numero Exponente");
	     expont=in.nextInt();
	     in.close();
	     
	     
	     result= pot(base,expont);
	     System.out.println("El numero " +base+ " elevado a " +expont + "es igual a: " +result); 
	     
	    
	     
	   }

	public static int pot(int base, int expont)
	{
		int i, result =1;
	     for (i = 1; i <= expont; i++) {

	            result = result * base;
	}
		return result;
	}
}

		  
	
        
    

