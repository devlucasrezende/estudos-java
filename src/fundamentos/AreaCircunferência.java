package fundamentos;

public class AreaCircunferência {

	public static void main(String[] args) {
		double raio = 3.4;
		//ao acrescentar o comando final antes da variável, ela se torna constante.
		final double PI = 3.14159;
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		
		System.out.println("Área = " + area + "m2.");
	}
}
