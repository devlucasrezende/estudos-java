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
			
			
			System.out.println(u1 == u2); //resulta falso pois est� comparando endere�o de mem�ria e os endere�os no caso s�o diferentes (criou-se dois objetos)
			System.out.println(u1.equals(u2)); //tamb�m resulta falso pois o equals, por padr�o, compara endere�os de mem�ria e, no caso, os endere�os de mem�ria s�o diferentes;
			System.out.println(u2.equals(u1));
			
			
			//System.out.println(u2.equals(new Date()));
					
		}

}
