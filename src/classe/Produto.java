package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.50;
	
	
	//Quando cria um construtor que recebe par�metros, o construtor padr�o se perde, tanto que na classe ProdutoTeste ocorre erro (lembrar de salvar o c�digo)
	
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
 * Nesse segundo m�todo h� um parametro novo "descontoDoGerente". Repare que ele n�o est� definido na class Produto, ent�o, deve ser passado manualmente quando o m�todo for chamado (entre parenteses)	
 * Pode ter nomes iguais, contanto que os par�metros sejam diferentes
 */
	
	double precoComDescontoGerente(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
		}
	
	
	
}