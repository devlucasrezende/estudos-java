package arrays;


import java.util.Scanner;

public class DesafioArrayUmFor {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantas notas?");
		
		int tamanhoArray = scanner.nextInt();
		
		double[] notas = new double [tamanhoArray];
		
		
		double insercaoNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("informe a nota");
			notas [i] = scanner.nextDouble();
			insercaoNotas += notas[i];
		}
		
			//System.out.println(insercaoNotas);
		
		
		//System.out.println(Arrays.toString(notas)); printa o array em forma de string
		
		
		for(int i = 0; i< notas.length; i++){
		   
			System.out.println(notas[i]);
		
		}
		
		
		System.out.println("A média do aluno é : " +insercaoNotas / notas.length);
	
		scanner.close();
	}

}
