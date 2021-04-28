package controle.exercicios;

import java.util.Scanner;

public class ExercicioJogoAdvinhacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Jogo da advinha��o: Escolha um n�mero de 0 a 100, voc� tem 10 tentativas!");

		int numeroEscolhido = 20;
		int valor = 0;
		
		
		for (int i = 9; i >= 0 && numeroEscolhido != valor; i--) {
			valor = scanner.nextInt();
			if (valor < numeroEscolhido)
				System.out.println(
						"O n�mero digitado � menor que o n�mero escolhido. Voc� ainda tem " + i + " tentativas");

			else if (valor > numeroEscolhido)
				System.out.println(
						"O n�mero digitado � maior que o n�mero escolhido. Voc� ainda tem " + i + " tentativas");

			else {
				System.out.println("Parab�ns voc� acertou!");
				break;
			}

		}

		scanner.close();
	}

}
