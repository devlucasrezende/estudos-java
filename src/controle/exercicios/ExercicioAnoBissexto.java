package controle.exercicios;

import java.util.Scanner;

public class ExercicioAnoBissexto {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		
		int ano = entrada.nextInt();
		int bissexto = ano % 4;
		int bissextoA = ano % 100;
		int bissextoB = ano % 400;
		
		if (bissexto == 0 && bissextoA != 0) {
			System.out.println(ano + " é um ano bissexto");	
		if(bissextoB == 0) {
			System.out.println(ano + "é bissexto");
		}
			
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		entrada.close();
	}
}
