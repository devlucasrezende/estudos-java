package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		//Levmrar que pilha o primeiro a entrar é o primeiro a sair (Last in, First out - LIFO)
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		//A diferença aqui é igual da queue, se não tiver nenhum elemento, o peek retorna null e o element retorna exceção!
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//A diferença aqui é igual da queue, se não tiver nenhum elemento o poll retorna null e o remove retorna exceção!
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		//System.out.println(livros.pop()); // assim como remove, também joga uma exceção caso não tenha ngm para tirar
		
		/*
		livros.size();
		livros.clear();
		livros.contains();
		livros.isEmpty();
		*/
		
	
		
		
	}

}
