package controle.exercicios;

import java.util.Scanner;

public class ExercicioZeroADez {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero");
		
		int numero = entrada.nextInt();
		
		 if(numero <= 0 || numero <=10 && numero % 2 == 0) { 
			 System.out.println("O numero que voc� digitou est� entre 0 a 10 e � par");
		 }
		 
		 else {
			 System.out.println("O n�mero que voc� digitou n�o est� entre 0 a 10 ou, se est�, n�o � par!");
		 }
		 


		entrada.close();
	}
}
