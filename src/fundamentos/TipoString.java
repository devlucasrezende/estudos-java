package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		//.charAt você pega letras isoladas dentro da String
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		//depois de determinar a String o seu valor é imutável. O que pode ser feito são substituições. Exemplo:
		
		s = "Bom dia!";
	
		
		System.out.println(s.concat("!!!"));
		//o comando ".concat" soma à String o que você quiser acrescer.
		System.out.println(s + "!!!");
		//da mesma forma o comando "+" de fora das aspas acresce a String o que estiver dentro das aspas.
		System.out.println(s.startsWith("Bom"));
		//o comando ".startsWith" faz uma verificação booleana (true ou false). No exemplo, verificou-se se a String começa com "Bom", retornando true
		System.out.println(s.length());
		//o comando ".lenght" conta quantos caracters tem na String
		System.out.println(s.endsWith("dia"));
		//o comando ".endsWith" faz uma verificação booleana (true ou false) verificando se a String termina de alguma forma.
		System.out.println(s.equals("Bom dia!"));
		//o comando ".equals" verifica se a String é igual ao que foi definido, retornando true ou false.
		System.out.println(s.equalsIgnoreCase("bom dia!"));
		//o comando ".equalsIgnoreCase" verifica se a string é igual ao que foi definido, ignorando letras maísculas de minúsculas, retornando true ou false.
		
		String nome = "Pedro";
		String sobrenome = "Santos";
		int idade = 33;
		double salario = 12345.987;
		
	
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);
		//o comando \n quebra uma linha
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f mensalmente", nome, sobrenome, idade, salario);
		//o comando % vai "linkar" as respectivas variáveis. o .2f determina quantas casas decimais serão utilizadas.
		
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f mensalmente", nome, sobrenome, idade, salario);
	
		System.out.println(frase);
		
		System.out.println("Frase qualquer".substring(6, 8));
		//o comando ".substrig( )" pega uma parte da string e imprime. Aqui o 6 é inclusivo e o 8 não entra
		
		
				
		
		
		
		
		
		
		
		
	}

}
