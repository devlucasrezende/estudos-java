package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario ("Pedro"));
		usuarios.add(new Usuario ("Ana"));
		usuarios.add(new Usuario ("Guilherme"));
		
		boolean resultado = usuarios.contains(new Usuario ("Guilherme"));
		System.out.println(resultado);
		//Se não tiver hashcode não vai conseguir encontrar Guilherme, pois na primeira varredura pelo Hashcode não encontra nada!
		//Lembrar sempre de implementar o equals e o hashCode - Disponibilizado pelo Eclipse é o melhor!
	}

}
