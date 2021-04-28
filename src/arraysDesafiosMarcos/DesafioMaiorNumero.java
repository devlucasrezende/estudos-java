package arraysDesafiosMarcos;

import java.util.Scanner;

public class DesafioMaiorNumero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a quantidade  de números que desejar: ");

		int numeros = scanner.nextInt();

		double[] arrayNumero = new double[numeros];

		double maiorValor = -Double.MAX_VALUE;
		for (int i = 0; i < arrayNumero.length; i++) {
			System.out.println("informe o " + (i + 1) + " número");
			arrayNumero[i] = scanner.nextDouble();

			if (arrayNumero[i] > maiorValor) {
				maiorValor = arrayNumero[i];
			}

		}
		System.out.println(maiorValor);

		// isso aqui verifica se os dados do array (vagoes) foram preenchidos!
		// for (int i = 0; i < arrayNumero.length; i++) {
		// System.out.println(arrayNumero[i]);
		// }

		scanner.close();
	}

}
