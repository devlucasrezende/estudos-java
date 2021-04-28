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

//While é melhor quando não tem número definido de vezes que deve repetir



