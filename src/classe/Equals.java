package classe;

//import java.util.Date;

public class Equals {
		public static void main(String[] args) {
			
			
			Usuario u1 = new Usuario();
			u1.nome = "Pedro Silva";
			u1.email = "pedro.silva@ezemail.com.br";
			
			Usuario u2 = new Usuario();
			u2.nome = "Pedro Silva";
			u2.email = "pedro.silva@ezemail.com.br";
			
			
			System.out.println(u1 == u2); //resulta falso pois está comparando endereço de memória e os endereços no caso são diferentes (criou-se dois objetos)
			System.out.println(u1.equals(u2)); //também resulta falso pois o equals, por padrão, compara endereços de memória e, no caso, os endereços de memória são diferentes;
			System.out.println(u2.equals(u1));
			
			
			//System.out.println(u2.equals(new Date()));
					
		}

}
