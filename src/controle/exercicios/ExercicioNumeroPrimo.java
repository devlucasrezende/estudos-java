package controle.exercicios;

import java.util.Scanner;

public class ExercicioNumeroPrimo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int divisor = 0;
		System.out.println("Digite um n�mero");
		int numero = entrada.nextInt();
		
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				divisor++;
			}
		}
		
		if (divisor == 0) {
			System.out.println("O n�mero " + numero + " � primo.");
		}
		
		else {
			System.out.println("O n�mero " + numero + " n�o � primo");
		}
		
		
		

		entrada.close();
	}

}
