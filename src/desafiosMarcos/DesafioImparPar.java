package desafiosMarcos;

import java.util.Scanner;

public class DesafioImparPar {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		
		
		while (numero != -1 && numero == 0) {
			System.out.println("Informe um n�mero ou escreva (-1) para sair");
			numero = entrada.nextInt();
			
			if (numero != -1) 
				
				if (numero % 2 == 0) {
					System.out.println("N�mero par");
			 }
			
			 else {
				 System.out.println("N�mero �mpar");
			 }
			
			else
				
				System.out.println("Saiu");
			}
			
		entrada.close();
		 }  
		 
		
		}
	
	

		
	


	


		
		

