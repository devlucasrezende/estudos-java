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
			System.out.println("Parab�ns, voc� foi aprovado e sua m�dia � " + media);
		}
		
		else if(media >= 4) {
			System.out.println("Voc� ter� uma segunda chance, est� de recupera��o e sua m�dia foi " + media);
		}
		
		else {
			System.out.println("Voc� foi reprovado e sua m�dia � " + media);
		}
		
		entrada.close();
	}

}


