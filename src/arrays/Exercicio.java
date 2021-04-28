package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4]; // Se não inicializar os valores dentro do array, eles serão inicializados
												// com os valores padrão. Veja abaixo.

		//System.out.println(Arrays.toString(notasAlunoA)); //impressão do array com dados padrão!
		
		//Inicialização do array!
		
		notasAlunoA[0] = 7.9; 
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		

		System.out.println(Arrays.toString(notasAlunoA)); // impressão do array já com os valores definidos!
		
		//Como pegar o último dado do array???
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); //lenght - 1 sempre é o último dado do array!!
		
		//System.out.println(notasAlunoA[4]); //Isso gera um ERRO pois o index 4 está fora das dimensões do Array criado [0,1,2,3];
		
		
		// Como percorrer o array?

		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i]; //usa-se notasAlunoA[i] pois vai começar no indice i = 0. O índice é onde eu quero começar a percorrer o array
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length); //impressão do resultado de todas as notas divididas pelo tamanho do array!
		
		
		double notaArmazenada = 5.9;
		double [] notasAlunoB = {6.9, 8.9, notaArmazenada, 10}; //aqui inicializou o Array diretamente! Lembre-se, homogeneo e quantidade elementos pré-definida. Tamanho é FIXO! - Menos utilizado essa forma! - Pode colocar uma variável (double) dentro de um array double
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB [i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length); //impressão do resultado das notas do aluno B dividido pelo tamanho do array!
		
		//LEMBRAR QUE ARRAY É OBJETO POR ISSO TEM METODOS e ATRIBUTOS CARAIOOOOO!
		
		

	}
}
