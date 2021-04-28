package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		
		// No caso do map, é bom lembrar que temos dois valores, "Chave e Valor" por isso dentro do diamond operator há dois elementos, no exemplo é o Integer e o String.
		Map<Integer, String> usuarios = new HashMap<>();
		
		//O método para adicionar no Map é o put, lembrando que há necessidade de passar os dois valores!
		usuarios.put(1, "Roberto");
//		usuarios.put(1, "Ricardo"); //se repetir a chave, é feita uma alteração do valor! por isso o método é put e não add!
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println(usuarios.size()); //não pode haver duplicação de chave no map, por isso o resultado é 1 e não 2!
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); //retorna o conjunto das chaves - não mantem as chaves de forma ordenada
		System.out.println(usuarios.values()); //retorna os valores
		System.out.println(usuarios.entrySet()); //retorna chaves e valores juntos!
		
		System.out.println(usuarios.containsKey(2)); //metodo para ver se existe alguma chave, retorna true or false!
		System.out.println(usuarios.containsValue("Roberto")); //metedo para ver se existe algum valor, retorna true or false!
		
		System.out.println(usuarios.get(1)); //metodo para retornar o valor correspondente à chave!
		System.out.println(usuarios.remove(1));
		
		//primeiro for para percorrer as chaves. Lembrar de usar .keySet
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		
		}
		//segundo for para percorrer os valores. Lembrar de usar .values
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		//terceiro for para percorrer ao mesmo tempo chaves e valores. Utiliza-se uma forma diferente (Entry<>) onde deve ser colocado exatamente os tipos do Map, no caso Integer e String. Não esquecer de usar .entrySet
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
			//System.out.println(registro);
			
		}
		
	}

}
