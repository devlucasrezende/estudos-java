package controle.exercicios;

import java.util.Scanner;

public class ExercicioNumeroPar {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero = 0;
		int resultado = 0;
		while (numero >= 0) {
			System.out.println("Digite um n�mero positivo para somar ou um negativo para sair");
			numero = scanner.nextInt();
			if (numero >= 0) {
				resultado = resultado + numero;
				System.out.println("A soma at� agora � igual a " + resultado);
				}
			else {
				System.out.println("Fim");
			}

		}

		scanner.close();
	}

}
