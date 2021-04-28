package colecoes;

import java.util.ArrayList;

public class LIsta {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); //pegar um elemento da lista pelo indice
		
		System.out.println(">>>>>>>" + lista.remove(1)); //remoção a partir do ID - retorna escrito
		System.out.println(lista.remove(new Usuario("Manu"))); // remoção a partir do objeto -> retorna boolean
		
		System.out.println("Tem? " +lista.contains(new Usuario ("Lia")));
		

		
		
		for(Usuario u: lista) {
			System.out.println(u.nome); //ordem de inserção é mantida
			//System.out.println(u); //usando o método toString
		}
	}

}


 
