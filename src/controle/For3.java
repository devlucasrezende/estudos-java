package controle;

public class For3 {
	public static void main(String[] args) {
		
		/*
		 * a variável int i = 0 só está disponível dentro do bloco de código do for. Caso tente acessá-la de fora do bloco do for não é possível.
		 * Da mesma forma, caso tente criar uma variável no mesmo bloco do for (outra variável i) não é possível. 
		 * Entrentanto, fora da do bloco do for é possível criar outra variável i
		 *
		 */
		
		
		 
		//for (int i  = 0; i <10; i++) 
		//{
			//System.out.println(i);
		//}
		/*
		 * Aqui, como a variável i no for foi declarada dentro do for, é possível criar outra variável i fora do escopo (bloco)
		 */
		
			//int i = 0;
			//System.out.println("saiu do for");
			//System.out.println(i);
			
		/*
		 * Laço dentro do outro. Exemplo abaixo	
		 */
			
			for(int i = 0; i < 10; i++){
				
				for (int j = 0; j < 10; j++) {
					System.out.printf("[%d %d]", i, j);
			}
					System.out.println();
			
		}	
		
	}

}
