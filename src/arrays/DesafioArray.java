package arrays;



import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantas notas você quer informar?");
		int tamanhoArray = scanner.nextInt();
		
		double[] notas = new double[tamanhoArray];
		
	
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1));
			notas[i] = scanner.nextDouble();
		}
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		System.out.println("A média é : " + total / notas.length);
		
		
		//System.out.println(Arrays.toString(notas)); //impressao do array com valores passados pelo usuário
		
		scanner.close();
	}
}
//insercaoNotas += notas[i]; a princípio não preciso disso