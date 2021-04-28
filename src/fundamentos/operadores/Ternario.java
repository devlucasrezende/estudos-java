package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 4;
		String resultadoRecuperacao = media >= 5.0 ? "Recupera��o" : "Reprovado";
		String resultadofinal = media >= 7.0 ? "Aprovado" : resultadoRecuperacao;
		
		System.out.println("O aluno est�: " +resultadofinal);
		
		
		
		//Operador tern�rio: S�o tr�s operandos divididos por 2 simbolos - ? e :
		
		double nota = 6.0;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia; //o && (e) adiciona mais uma condi��o.
		String resultado = temDesconto ? "Sim" : "n�o";
		
		
		System.out.println("Tem desconto? " + resultado);
		
	}

}
