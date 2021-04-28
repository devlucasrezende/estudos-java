package desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
	
	//Criar um programa que o usu�rio digita o dia da semana e o sistema imprime o n�mero correspondente	
	//Domingo -> 1
	//Quarta -> 4
	//Ter�a -> 3
	
		
		Scanner entrada = new Scanner(System.in);
		
		String dia;
		
		System.out.println("Digite o dia da semana: ");
		dia = entrada.next();
		
		
		if (dia.trim().equalsIgnoreCase("domingo")) {
			System.out.println("1");
			
		} else if (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("segunda-feira")) {
			System.out.println("2");
			
		} else if (dia.equalsIgnoreCase("ter�a") || dia.equalsIgnoreCase("ter�a-feira") || dia.equalsIgnoreCase("terca-feira")) {
			System.out.println("3");
			
		} else if (dia.equalsIgnoreCase("quarta") || dia.equalsIgnoreCase("quarta-feira")) {
			System.out.println("4");
			
		} else if (dia.equalsIgnoreCase("quinta") || dia.equalsIgnoreCase("quinta-feira")) {
			System.out.println("5");
			
		} else if (dia.equalsIgnoreCase("sexta") || dia.equalsIgnoreCase("sexta-feira")) {
			System.out.println("6");
			
		} else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("s�bado")) {
			System.out.println("7");
			
		} else System.out.println("Dia inv�lido");
			
	
		
		
		entrada.close();
		
		// N�o use == para comparar Strings. Use .equals ou .equalsIgnoreCase (n�o importando letras ma�sculas)
	}

}
