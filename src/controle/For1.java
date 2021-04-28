package controle;

public class For1 {
	public static void main(String[] args) {
		
		//For serve para criar uma estrutura determinada. A quantidade de repetição é determinada. 3 Partes 
		//1 - Declaração da variável
		//2 - Expressão que vai retornar verdadeiro ou falso
		//3 - Manipulação da variável para que esse laço pare de rodar.
		
		for(int contador = 0;contador <=20;contador += 2) {
			System.out.printf("i = %d\n", contador);
		}
		
		//Esse tipo abaixo é um laço infinito
		//for (;;) {
			//System.out.println("Fim");
		//}
	}

}
