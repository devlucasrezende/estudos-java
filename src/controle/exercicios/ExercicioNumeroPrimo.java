package controle.exercicios;

import java.util.Scanner;

public class ExercicioNumeroPrimo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int divisor = 0;
		System.out.println("Digite um número");
		int numero = entrada.nextInt();
		
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				divisor++;
			}
		}
		
		if (divisor == 0) {
			System.out.println("O número " + numero + " é primo.");
		}
		
		else {
			System.out.println("O número " + numero + " não é primo");
		}
		
		
		

		entrada.close();
	}

}
