package es.studium.ejercicio5;

public class Montana {

	public static void main(String[] args) {
		// Declaro la constante que la llamo MAX.
		final int MAX = 4;
		// Declaro el String de la montaña.
		String montanas[] = { "Everest", "Mont Blanc", "Veleta", "Aneto" };
		int alturas[] = { 8849, 4809, 3394, 3404 };

		// Declaro la altura máxima.
		int maximo = alturas[0];
		// Declaro la posición máxima.
		int posMax = 0;

		for (int i = 0; i < MAX; i++) {
			if (alturas[i] > maximo)

			{
				maximo = alturas[i];
				posMax = i;
			}

		}

		System.out.println("La Montana mas alta es: " + montanas[posMax] + "." + " Su altura es de: "
				+ (alturas[posMax]) + " metros.");

	}
}