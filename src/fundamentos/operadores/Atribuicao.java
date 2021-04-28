package fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		//aqui o operador é o = que fica no meio 
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c = c + b;
		c -= a; //c = c - b;
		c *= b; //c = c * b;
		c /= a; //c = c / a;
		
		System.out.println(c);
		
		c %=2; //c = c % 2; 0 ou 1
		
		System.out.println(c);
		
		
			
			
		
		
		
	}

}
