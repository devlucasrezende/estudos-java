package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String salario1;
		String salario2;
		String salario3;
		double mediaSalarial;
		
		
	
		
		System.out.println("Olá trabalhador. Por favor digite o seu primeiro salário: ");
		salario1 = entrada.next().replace(",", ".");
		Double numero1 = Double.parseDouble(salario1);
				
		System.out.println("Olá trabalhador. Por favor digite o seu segundo salário: ");
		salario2 = entrada.next().replace(",", ".");
		Double numero2 = Double.parseDouble(salario2);
		
		
		System.out.println("Olá trabalhador. Por favor digite o seu terceiro salário: ");
		salario3 = entrada.next().replace(",", ".");
		Double numero3 = Double.parseDouble(salario3);
		
		mediaSalarial = (numero1 + numero2 + numero3) / 3;
				
		
		System.out.println("Sua média salarial é :" + mediaSalarial);
		
		
		
		entrada.close();
	}

}