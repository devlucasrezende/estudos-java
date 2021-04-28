package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		// byte
		Byte b = 1;
		Short s = 1000;

		// Integer.parseInt(entrada.next());
		Integer i = 10000; // tipo primitivo do int
		Long l = 100000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString()); //converte o valor short pra String (quando imprime no console)
		System.out.println(i * 3);
		System.out.println(l / 3);
		Float f = 123F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.toString());
		
				
				
		
		
		
		
		
				
				
		
	
		
		

	}

}
