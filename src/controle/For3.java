package controle;

public class For3 {
	public static void main(String[] args) {
		
		/*
		 * a vari�vel int i = 0 s� est� dispon�vel dentro do bloco de c�digo do for. Caso tente acess�-la de fora do bloco do for n�o � poss�vel.
		 * Da mesma forma, caso tente criar uma vari�vel no mesmo bloco do for (outra vari�vel i) n�o � poss�vel. 
		 * Entrentanto, fora da do bloco do for � poss�vel criar outra vari�vel i
		 *
		 */
		
		
		 
		//for (int i  = 0; i <10; i++) 
		//{
			//System.out.println(i);
		//}
		/*
		 * Aqui, como a vari�vel i no for foi declarada dentro do for, � poss�vel criar outra vari�vel i fora do escopo (bloco)
		 */
		
			//int i = 0;
			//System.out.println("saiu do for");
			//System.out.println(i);
			
		/*
		 * La�o dentro do outro. Exemplo abaixo	
		 */
			
			for(int i = 0; i < 10; i++){
				
				for (int j = 0; j < 10; j++) {
					System.out.printf("[%d %d]", i, j);
			}
					System.out.println();
			
		}	
		
	}

}
