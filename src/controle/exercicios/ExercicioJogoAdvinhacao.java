package controle.exercicios;

import java.util.Scanner;

public class ExercicioJogoAdvinhacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Jogo da advinhação: Escolha um número de 0 a 100, você tem 10 tentativas!");

		int numeroEscolhido = 20;
		int valor = 0;
		
		
		for (int i = 9; i >= 0 && numeroEscolhido != valor; i--) {
			valor = scanner.nextInt();
			if (valor < numeroEscolhido)
				System.out.println(
						"O número digitado é menor que o número escolhido. Você ainda tem " + i + " tentativas");

			else if (valor > numeroEscolhido)
				System.out.println(
						"O número digitado é maior que o número escolhido. Você ainda tem " + i + " tentativas");

			else {
				System.out.println("Parabéns você acertou!");
				break;
			}

		}

		scanner.close();
	}

}
