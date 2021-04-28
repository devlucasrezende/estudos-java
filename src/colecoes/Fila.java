package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Tanto add, quanto offer, adicionam elementos na fila, a diferen�a � quando a fila est� cheia - add -> erro, offer -> true or false
		
		fila.add("Ana"); //adiciona alguem na fila. Caso seja uma fila com tamanho pr�definido, e tente usar o add, vai retornar exce��o! - ERRO
		fila.offer("Bia"); //Caso seja uma fila com tamanho pr�definido, o offer simplesmente vai retornar true or false se conseguiu add ou n�o! - SEM ERRO
		fila.add("Carlos"); 
		fila.offer("Daniel"); 
		fila.add("Rafaela"); 
		fila.offer("Gui"); 
		
		//Diferen�a � o comportamento, quando a fila est� vazia!
		//Peek e Element - obtem proximo elemento da fila sem o remover!
		System.out.println(fila.peek()); //se a fila estiver vazia, retorna null
		System.out.println(fila.element()); //se a fila estiver vazia, retorna erro
		
		//Diferen�a � o comportamento, quando a fila est� vazia!
		//Poll e remove - obtem proximo elemento da fila e o remove!
		System.out.println(fila.poll()); //Poll pega o pr�ximo elemento da fila e o remove! - se a fila estiver vazia, retorna null
		System.out.println(fila.remove()); //se chamar o remove quando a lista estiver vazia vai dar exce��o!
		
		
		//fila.size();
		//fila.clear(); - limpa a fila
		//fila.isEmpty(); - fila est� vazia?
		//fila.contains(); - verifica se o elemento est� contido na fila
		
		
		
	}
}
