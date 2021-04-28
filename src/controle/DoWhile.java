package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		// if (... expressão verdadeira ou falsa) sentença de código; ou {}
		// while (...) sentença; ou {}
		//for (inicializa a variável; expressão; modificação da variável (incremento, decremento, etc) Sentença de codigo ou {}
		// do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("obrigado!");
		
		
		
		
		
		entrada.close();
		
		
		
	}

}

