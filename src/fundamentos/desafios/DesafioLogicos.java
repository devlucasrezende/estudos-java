package fundamentos.desafios;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		
		
		boolean tv50 = trabalho1 && trabalho2;
		
		System.out.println("Comprou TV 50?: " + tv50);
		
		boolean tv32 = trabalho1 ^ trabalho2;
		
		System.out.println("Comprou TV 32? " + tv32);
		
		boolean sorvete = (tv32 || tv50);
		
		System.out.println("Comprou sorvete? " + sorvete);
		
		//operador un�rio
		
		System.out.println("Est� mais saud�vel? " +!sorvete);
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
	}

}
