package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		String frase = "";
		
		while (!frase.equalsIgnoreCase("sair")) {
			System.out.println("Digite a palavra chave");
			frase = entrada.nextLine();
		}
		
		
		entrada.close();
	}

}

//While � melhor quando n�o tem n�mero definido de vezes que deve repetir



