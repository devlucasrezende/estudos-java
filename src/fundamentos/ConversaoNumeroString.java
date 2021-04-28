package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString()); 
		/*
		 * por mais que apareça 10000 no console, esses 10000 não é um número, mas, sim, uma String (conjunto de caracteres)
		 * Assim teremos funções específicas da String como por exemplo o .lenght, para saber quantos caracteres existe na String. Veja
		 */
		
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2)); //passa o int direto pra String através do Integer.
		
		System.out.println(("" + num2)); //gambiarra
		
		
		
		
	}

}
