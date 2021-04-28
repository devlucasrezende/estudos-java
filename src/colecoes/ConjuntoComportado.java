package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); //o comando <String> diz que agora a lista ser� obrigatoriamente do tipo String
		SortedSet<String> listaAprovados = new TreeSet <>(); //o comando TreeSet garante a ordem de inser��o! - O SortedSet (conjunto) aceita ordena��o
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato); //como � um Set n�o h� respeito a ordem de inser��o!
		}
		
		Set<Integer> nums = new HashSet<>(); //o comando TreeSet garante a ordem de inser��o! - O SortedSet (conjunto) aceita ordena��o
		
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
		
		
		
	}

}
