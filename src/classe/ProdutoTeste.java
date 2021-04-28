package classe;


public class ProdutoTeste {
	public static void main(String[] args) {
		
	
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;

		Produto p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		
		
		System.out.println("O pre�o inicial do produto " + p1.nome + " era de " + p1.preco + " e com desconto � de: R$" + p1.precoComDesconto());
		System.out.println("O pre�o inicial do produto " + p2.nome + " era de " + p2.preco + " e com desconto � de: R$" + p2.precoComDesconto());
		
		
		
		double precoFinal1 = p1.precoComDesconto();  //chama o m�todo precoComDesconto
		double precoFinal12 = p2.precoComDescontoGerente(0.1); //chama o m�todo precoComDesconto + parametro do desconto do gerente
		double mediaCarrinho = (precoFinal1 + precoFinal12) / 2;
		
		System.out.printf("M�dia do Carrinho = R$%.2f", mediaCarrinho);
		
		
		/*temos aqui um unico molde (classe produto) com duas inst�ncias (p1 e p2)
		 * Lembrando que a classe define o tipo (qual tipo? Produto)
		 * Para acessar os atributos de uma classe � utilizada a nota��o PONTO (p1 . nome, p1 . preco) etc
		 */
		
		//Quando chama com parenteses () � metodo, sem () � atributo
		 
		
		
		/*produto = tipo
		 * p1 = nome 
		 * = (recebe)
		 * new - construtor
		 * Produto(); - o nome do construtor � exatamente o mesmo nome da classe, por isso new Produto.
		 */
	}

}


//Como est� dentro do pr�prio pacote de classe, n�o preciso importar nada para utilizar (o mesmo se aplica ao java.lang). Se estivesse fora do pacote teria que importar
