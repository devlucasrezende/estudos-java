package fundamentos.desafios;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		//int a = 3 * 4 - 10;
		//double b = Math.pow(a, 3); //a classe Math fornece algumas funcionalidades. o comando ".pow". eleva o n�mero � alguma pot�ncia (x, y) onde x � o n�mero e o y � a potencia.
		
		double a = 6 * (3 + 2);
		double b = 3 * 2;
		double c = Math.pow(a, 2);
		double d = c / b;
		
		double a1 = (1 - 5) * (2 - 7);
		double a2 = 2;
		double a3 = a1 / a2;
		double a4 = Math.pow(a3, 2);
		
		double x = d - a4;
		double y = Math.pow(x, 3);
		double z = Math.pow(10, 3);
		
		double resposta = y / z;
		
		System.out.println(resposta);
		
		
		
				
				
				
		
		
		
	}

}
