package fundamentos.exercicios;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Foruma ; altura ao quadrado / peso
		
		String altura;
		String peso;
		
		
		System.out.println("Informe sua altura :");
		altura = entrada.next();
		Double numAltura = Double.parseDouble(altura);
		
		System.out.println("Informe seu peso :");
		peso = entrada.next();
		Double numPeso = Double.parseDouble(peso);
		
		double imc = numPeso / Math.pow(numAltura, 2);
		
		
		
		System.out.println("Seu IMC é :" +imc);
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
