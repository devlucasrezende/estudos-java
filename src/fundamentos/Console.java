package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
		//printf � o print formatado
		
		System.out.printf("Sal�rio: %.1f", 1234.5678);
		
		/*
		 * Para capturarmos informa�oes do usu�rio via teclado utilizamos o Scanner.
		 * Primeiro temos que fazer o import do Scanner.
		 * System.in = entrada
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\n\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("\n\nDigite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("\n\nDigite a suu idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("\nNome = " + nome + " " + sobrenome + "\nIdade = " + idade);
		
		entrada.close();
		
	
	}
}
