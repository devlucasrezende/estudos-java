package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	// Padrao 1/1/1970
	Data() {
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		
		this(1, 1, 1970); //this como m�todo, um construtor chama outro construtor

	}

	Data(int dia, int mesInicial, int anoInicial) {
		this.dia = dia;
		mesInicial = mes;
		anoInicial = ano;
	}

	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; //vari�vel local - dentro do m�todo - �rea de visibilidade � apenas do metodo
		return String.format(formato, this.dia, mes, ano);
	}
	

}
