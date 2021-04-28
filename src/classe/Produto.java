package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.50;
	
	
	//Quando cria um construtor que recebe parâmetros, o construtor padrão se perde, tanto que na classe ProdutoTeste ocorre erro (lembrar de salvar o código)
	
	Produto() {

	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	

	double precoComDesconto() {
		return preco * (1 - desconto);
			}

	
/*
 * Nesse segundo método há um parametro novo "descontoDoGerente". Repare que ele não está definido na class Produto, então, deve ser passado manualmente quando o método for chamado (entre parenteses)	
 * Pode ter nomes iguais, contanto que os parâmetros sejam diferentes
 */
	
	double precoComDescontoGerente(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
		}
	
	
	
}