package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoCemF {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Fórmula °F = °C × 1, 8 + 32
		
		final double ajuste = 1.8;
		final double fator = 32;
		String celsius;
		
		
		System.out.println("Informe a temperatura em Celsius: ");
		celsius = entrada.next();
		Double numCelsius = Double.parseDouble(celsius);
		
		
		System.out.println(celsius);
		
		double fahrenheit = numCelsius * ajuste + fator;
		
		
		System.out.println("A temperatura de "+celsius +" °C tem um valor em Fagrenheit = " +fahrenheit);
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
