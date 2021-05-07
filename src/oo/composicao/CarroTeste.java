package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		
	
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		
		c2.ligar();
		
		System.out.println(c1.estaLigado());
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
	

		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear(); //aqui agora pode frear a vontade, pois o giro m�nimo � 600
		
		//Aqui o usu�rio poderia colocar um valor imposs�vel. FALTOU ENCAPSULAMENTO!!!
		//c1.motor.fatorInjecao = -30;
		
		System.out.println(c1.motor.giros());
		
		//Rela��o biderecional! - 1 motor tem 1 carro, 1 carro conhece 1 motor!
		System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.giros());
		
	}

}
