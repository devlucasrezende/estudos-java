package controle;

public class For1 {
	public static void main(String[] args) {
		
		//For serve para criar uma estrutura determinada. A quantidade de repeti��o � determinada. 3 Partes 
		//1 - Declara��o da vari�vel
		//2 - Express�o que vai retornar verdadeiro ou falso
		//3 - Manipula��o da vari�vel para que esse la�o pare de rodar.
		
		for(int contador = 0;contador <=20;contador += 2) {
			System.out.printf("i = %d\n", contador);
		}
		
		//Esse tipo abaixo � um la�o infinito
		//for (;;) {
			//System.out.println("Fim");
		//}
	}

}
