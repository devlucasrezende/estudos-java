package controle;

public class Continue {
	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			
			System.out.println(i);
		}
		
		for(int i = 0; i <= 10; i++) {
			if (i == 5) 
				continue;
				
				System.out.println(i);
	
			}

		}
	
	 }



//Enquanto o break sai do for, o continue interrompe apenas 1 itera��o (repeti��o) 