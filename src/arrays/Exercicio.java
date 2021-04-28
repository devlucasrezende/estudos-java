package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4]; // Se n�o inicializar os valores dentro do array, eles ser�o inicializados
												// com os valores padr�o. Veja abaixo.

		//System.out.println(Arrays.toString(notasAlunoA)); //impress�o do array com dados padr�o!
		
		//Inicializa��o do array!
		
		notasAlunoA[0] = 7.9; 
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		

		System.out.println(Arrays.toString(notasAlunoA)); // impress�o do array j� com os valores definidos!
		
		//Como pegar o �ltimo dado do array???
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); //lenght - 1 sempre � o �ltimo dado do array!!
		
		//System.out.println(notasAlunoA[4]); //Isso gera um ERRO pois o index 4 est� fora das dimens�es do Array criado [0,1,2,3];
		
		
		// Como percorrer o array?

		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i]; //usa-se notasAlunoA[i] pois vai come�ar no indice i = 0. O �ndice � onde eu quero come�ar a percorrer o array
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length); //impress�o do resultado de todas as notas divididas pelo tamanho do array!
		
		
		double notaArmazenada = 5.9;
		double [] notasAlunoB = {6.9, 8.9, notaArmazenada, 10}; //aqui inicializou o Array diretamente! Lembre-se, homogeneo e quantidade elementos pr�-definida. Tamanho � FIXO! - Menos utilizado essa forma! - Pode colocar uma vari�vel (double) dentro de um array double
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB [i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length); //impress�o do resultado das notas do aluno B dividido pelo tamanho do array!
		
		//LEMBRAR QUE ARRAY � OBJETO POR ISSO TEM METODOS e ATRIBUTOS CARAIOOOOO!
		
		

	}
}
