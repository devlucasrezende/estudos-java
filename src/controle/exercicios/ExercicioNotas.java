package controle.exercicios;

import java.util.Scanner;

public class ExercicioNotas {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		
		
		System.out.println("Informe a primeira nota");
		int primeiraNota = entrada.nextInt();
		System.out.println("Informe a segunda nota");
		int segundaNota = entrada.nextInt();
		
		int media = (primeiraNota + segundaNota) / 2;
		
		
		if(media >= 7 && media <= 10) {
			System.out.println("Parabéns, você foi aprovado e sua média é " + media);
		}
		
		else if(media >= 4) {
			System.out.println("Você terá uma segunda chance, está de recuperação e sua média foi " + media);
		}
		
		else {
			System.out.println("Você foi reprovado e sua média é " + media);
		}
		
		entrada.close();
	}

}


