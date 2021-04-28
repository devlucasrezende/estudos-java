package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double base;
		double altura;
		
		
		System.out.println("Informe a base do triangulo: ");
		base = entrada.nextDouble();
		
		System.out.println("Informe a altura do triangulo: ");
		altura = entrada.nextDouble();
		
		double resultado = (base * altura) / 2;
		
		
			
		System.out.println("A área do triangulo é: " +resultado);
		
		
		
		
		
		entrada.close();
	}

}
