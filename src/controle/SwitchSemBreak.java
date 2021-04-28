package controle;

 //import java.util.Scanner;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		//if (bool)...
		//while (bool)...
		//for (   ; bool;   )
		
		//Scanner entrada = new Scanner(System.in);
		
		//System.out.println("Qual a sua faixa de Karate?");
		
		//String faixa = entrada.nextLine();
		
		
		// Exmplo de switch sem usar break, se a pessoa é faixa preta ela sabe tudo pra baixo!
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		
		case "preta": 
			System.out.println( "Sei o Bassai-Dai...");
			//break;
			
		case "marrom":
			System.out.println("Sei o Takki Shodan");
			//break;
		case "roxa":
			System.out.println("Sei o Heian Godan");
			//break;
		case "verde":
			System.out.println("Sei o Heyan Yodan");
			//break;
		case "laranja":
			System.out.println("Sei o Heian Sandan");
			//break;;
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
			//break;
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
					
		}
		
		//entrada.close();
			System.out.println("Fim!");
	}

}
