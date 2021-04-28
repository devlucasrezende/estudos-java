package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); //o comando <String> diz que agora a lista será obrigatoriamente do tipo String
		SortedSet<String> listaAprovados = new TreeSet <>(); //o comando TreeSet garante a ordem de inserção! - O SortedSet (conjunto) aceita ordenação
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato); //como é um Set não há respeito a ordem de inserção!
		}
		
		Set<Integer> nums = new HashSet<>(); //o comando TreeSet garante a ordem de inserção! - O SortedSet (conjunto) aceita ordenação
		
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
		
		
		
	}

}
