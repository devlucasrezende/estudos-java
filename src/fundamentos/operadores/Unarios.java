package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1; - incremento
		a--; //a = a - 1; - decremento
		
		
		++b; //forma pré fixada
		--b; //forma pré fixada
		
		System.out.println(a);
		System.out.println(b);
		
		//uma das maiores virtudes do programador é escrever um código fácil
		
		System.out.println(++a == b--); //codigo que gera confusão! - ++a (vem primeiro) que b-- | lembrar ++ pressa
		System.out.println(a); //a = 2 
		System.out.println(b); //b = 1
		
		
	}

}
