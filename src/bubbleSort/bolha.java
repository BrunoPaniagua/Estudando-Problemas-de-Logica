package bubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bolha {
	public static void main(String[] args) {
		int[] numeros = { 3, 20, 76, 0 };
		System.out.println(Arrays.toString(bolha(numeros)));
	}

	public static int[] bolha(int sequencia[]) {

		for (int contador = 0; contador < sequencia.length; contador++) {
			for (int i = 0; i < sequencia.length - contador - 1; i++) {
				if (sequencia[i] > sequencia[i + 1]) {
					int mediador = sequencia[i];
					sequencia[i] = sequencia[i + 1];
					sequencia[i + 1] = mediador;
				}
			}
		}

		return sequencia;
	}
}
