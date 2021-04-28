package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //vai converter o double pra Double
		conjunto.add(true); //vai converter boolean -> Boolean
		conjunto.add("Teste"); //String
		conjunto.add(1); //vai converter int -> Integer
		conjunto.add('x'); // vai converter de char para -> Character 
		
		
		System.out.println("Tamanho do conjunto �: " +conjunto.size()); //.size imprime o tamanho do conjunto
		
		conjunto.add("Teste");
		conjunto.add('x');
		//lembrar que n�o aceita repeti��o
		System.out.println("Tamanho do conjunto �: " +conjunto.size()); //.size imprime o tamanho do conjunto
		
		
		System.out.println(conjunto.remove("teste")); //n�o existe teste no conjunto, logo o valor � false
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho do conjunto �: " +conjunto.size());
		
		System.out.println(conjunto.contains(1)); // o .contains serve para verificar se determinado elemento est� contido no conjunto
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //fez a uniao de tudo que tem em nums e jogou dentro de conjunto
		conjunto.retainAll(nums); //faz a interse��o de tal forma que s� vai ficar no conjunto o valor em comum que existia no nums, no caso 1
		
		conjunto.clear(); //limpa o conjunto
		System.out.println(conjunto);
		
		
		
	}
	

}
