package classeDesafio;

public class Pessoa {
	
	//nome
	//peso
	
	String nome;
	double peso;

	
	Pessoa (String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	
	}
	
	void comer (Comida comida) {
		this.peso += comida.peso; 
		
	}
	
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + peso + " kg.";
	}
	

	}


