package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoFemC {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Fórmula °C = (°F - 32) x 5/9
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double conversao = (fahrenheit - 32) * 5/9;
	
		System.out.print("Valor em Celsius: " + conversao);
				
				
		
		
		
		entrada.close();
	}

}
