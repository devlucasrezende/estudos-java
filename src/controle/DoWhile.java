package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		// if (... express�o verdadeira ou falsa) senten�a de c�digo; ou {}
		// while (...) senten�a; ou {}
		//for (inicializa a vari�vel; express�o; modifica��o da vari�vel (incremento, decremento, etc) Senten�a de codigo ou {}
		// do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("obrigado!");
		
		
		
		
		
		entrada.close();
		
		
		
	}

}

