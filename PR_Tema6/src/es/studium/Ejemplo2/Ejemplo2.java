package es.studium.Ejemplo2;

public class Ejemplo2 {

	public static void main(String[] args) 
	{
		final int TAM =5;
		int tabla[] = new int[TAM];
		
		for (int i = 0; i<=TAM;i++) 
		{
			try 
			{
				tabla[i] = i*2;
				//Mas Instrucciones
				//Mas
				//Mas...
				//Mas....
			}
			catch(ArrayIndexOutOfBoundsException ioobe)
			{
					//INSTRUCCIONES DE EXCEPCIÓN
			}
			/*
			 --- diferentes Exceptions.
			catch(ArithmeticException ae) 
			{
				System.out.println("Error: "+ae.getMessage());
			}
			--- coge todas las excepciones.
			catch(Exception e) 
			{
				System.out.println("Error: "+e.getMessage());
				throw(e); // Es para mandar el problema a un orden superior "SO" 	
			}
			 * 
			 * */
			finally
			{
				// INSTRUCCIONES QUE SIEMPRE SE EJECUTAN
				// TRAS EL TRY SIN ERROR
				// CON ERROR Y EL CATCH CORRESPONDIENTE 
			}
			
		}
		for(int elemento: tabla) {
			System.out.println(elemento);
		}

	}

}
