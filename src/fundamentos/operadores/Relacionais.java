package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		System.out.println(3 > 4);
		System.out.println(3 >= 4);
		System.out.println(3 < 4);
		System.out.println(3 <= 4);
		System.out.println(3 != 4);
		
		double nota = 10.0;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia; //o && (e) adiciona mais uma condição.
		
		
		System.out.println("Tem desconto? " + temDesconto);
		
					
	}

}
