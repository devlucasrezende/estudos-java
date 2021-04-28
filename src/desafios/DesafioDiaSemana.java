package desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
	
	//Criar um programa que o usuário digita o dia da semana e o sistema imprime o número correspondente	
	//Domingo -> 1
	//Quarta -> 4
	//Terça -> 3
	
		
		Scanner entrada = new Scanner(System.in);
		
		String dia;
		
		System.out.println("Digite o dia da semana: ");
		dia = entrada.next();
		
		
		if (dia.trim().equalsIgnoreCase("domingo")) {
			System.out.println("1");
			
		} else if (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("segunda-feira")) {
			System.out.println("2");
			
		} else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terça-feira") || dia.equalsIgnoreCase("terca-feira")) {
			System.out.println("3");
			
		} else if (dia.equalsIgnoreCase("quarta") || dia.equalsIgnoreCase("quarta-feira")) {
			System.out.println("4");
			
		} else if (dia.equalsIgnoreCase("quinta") || dia.equalsIgnoreCase("quinta-feira")) {
			System.out.println("5");
			
		} else if (dia.equalsIgnoreCase("sexta") || dia.equalsIgnoreCase("sexta-feira")) {
			System.out.println("6");
			
		} else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) {
			System.out.println("7");
			
		} else System.out.println("Dia inválido");
			
	
		
		
		entrada.close();
		
		// Não use == para comparar Strings. Use .equals ou .equalsIgnoreCase (não importando letras maísculas)
	}

}
