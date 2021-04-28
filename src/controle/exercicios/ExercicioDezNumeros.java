package controle.exercicios;

import java.util.Scanner;

public class ExercicioDezNumeros {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 10 numeros, ao final será mostrado o maior!");

		double valor = 0;
		double maiorValor = -Double.MAX_VALUE;

		for (int i = 10; i > 0; i--) {
			valor = scanner.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;

			}

		}
		System.out.println(maiorValor);

		scanner.close();
	}
}
