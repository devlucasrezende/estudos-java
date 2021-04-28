package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Tanto add, quanto offer, adicionam elementos na fila, a diferença é quando a fila está cheia - add -> erro, offer -> true or false
		
		fila.add("Ana"); //adiciona alguem na fila. Caso seja uma fila com tamanho prédefinido, e tente usar o add, vai retornar exceção! - ERRO
		fila.offer("Bia"); //Caso seja uma fila com tamanho prédefinido, o offer simplesmente vai retornar true or false se conseguiu add ou não! - SEM ERRO
		fila.add("Carlos"); 
		fila.offer("Daniel"); 
		fila.add("Rafaela"); 
		fila.offer("Gui"); 
		
		//Diferença é o comportamento, quando a fila está vazia!
		//Peek e Element - obtem proximo elemento da fila sem o remover!
		System.out.println(fila.peek()); //se a fila estiver vazia, retorna null
		System.out.println(fila.element()); //se a fila estiver vazia, retorna erro
		
		//Diferença é o comportamento, quando a fila está vazia!
		//Poll e remove - obtem proximo elemento da fila e o remove!
		System.out.println(fila.poll()); //Poll pega o próximo elemento da fila e o remove! - se a fila estiver vazia, retorna null
		System.out.println(fila.remove()); //se chamar o remove quando a lista estiver vazia vai dar exceção!
		
		
		//fila.size();
		//fila.clear(); - limpa a fila
		//fila.isEmpty(); - fila está vazia?
		//fila.contains(); - verifica se o elemento está contido na fila
		
		
		
	}
}
