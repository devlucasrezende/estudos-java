package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String ("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine(); //se estivesse somente .next, já iria ignorar (tirar) os espaços em branco
		
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); // o .trim faz ignorar espaços digitados pelo usuário, no caso.
		
		//IMPORTANTE = quando for comparar Strings, cuidado para não comparar usando ==. O correto é usar o .equals
		
		
		
		entrada.close();
				
		
		
		
	}

}
