package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		//Levmrar que pilha o primeiro a entrar � o primeiro a sair (Last in, First out - LIFO)
		
		livros.add("O Pequeno Pr�ncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		//A diferen�a aqui � igual da queue, se n�o tiver nenhum elemento, o peek retorna null e o element retorna exce��o!
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//A diferen�a aqui � igual da queue, se n�o tiver nenhum elemento o poll retorna null e o remove retorna exce��o!
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		//System.out.println(livros.pop()); // assim como remove, tamb�m joga uma exce��o caso n�o tenha ngm para tirar
		
		/*
		livros.size();
		livros.clear();
		livros.contains();
		livros.isEmpty();
		*/
		
	
		
		
	}

}
