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
		c1.frear(); //aqui agora pode frear a vontade, pois o giro mínimo é 600
		
		//Aqui o usuário poderia colocar um valor impossível. FALTOU ENCAPSULAMENTO!!!
		//c1.motor.fatorInjecao = -30;
		
		System.out.println(c1.motor.giros());
		
		//Relação biderecional! - 1 motor tem 1 carro, 1 carro conhece 1 motor!
		System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.giros());
		
	}

}
