package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data(); //Usou o construtor padrão, com valores padrão
		d1.ano = 2020; //posso alterar somente uma variável, se quiser!
		

		Data d2 = new Data(31, 12, 2020);  //Usou o construtor com argumentos
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	}

}
