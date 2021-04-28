package classeDesafio;

public class Jantar {
	public static void main(String[] args) {
		
		
		//1 comidas
		//pessoa
		//comer a comida
		//printar o nome da pessoa, peso antes de comer, peso depois de comer
		
		Comida c1 = new Comida("arroz", 0.200);
		Comida c2 = new Comida("feijão", 0.500);
		Comida c3 = new Comida ("picanha", 1.000);
		Pessoa p = new Pessoa("João", 110.00);
		Pessoa p1 = new Pessoa("Maria", 90.00);
		

		
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c3);
		
		System.out.println(p.apresentar());
		
		
		System.out.println(p1.apresentar());
		
		p1.comer(c1);
		p.comer(c2);
		
		System.out.println(p1.apresentar());
		
		
	
		
		
		
	
		
		
		
		
			
	}

}
