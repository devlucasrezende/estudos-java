package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoeCubo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num1;
		double num2;
		
		
		
		System.out.println("Insira o número");
		num1 = entrada.nextDouble();
		
		double num1a2 = Math.pow(num1, 2);
		num2 = Math.pow(num1, 3);
		
		
		System.out.println("O valor informado elevado à segunda potência é igual a :" +num1a2 +" já elevado à terceira potência é igual a :" +num2);
		
	
		entrada.close();
	}

}
