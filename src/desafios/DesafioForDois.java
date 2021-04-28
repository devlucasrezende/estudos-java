package desafios;

public class DesafioForDois {

	public static void main(String[] args) {

		boolean teste = true;
		String total = "";
		
		/*No for existem 3 espaços (    ;     ;    ) No primeiro espaço temos a variavel normalmente já inicializada (ponto de partida), no segundo espaço temos "até onde queremos ir" 
		 * no terceiro espaço temos o incremento, ou seja, "o que faz o for parar"
		 */
		
		for (int linha = 0; teste; linha++) {

			total += "#"; //Aqui significa total = total + 1 "#" - que significa somatório (ensino fundamental)
			
			System.out.println(total);

			if (linha == 5) {
				teste = false;
			}
		}

	}
}

/*
 * Resposta do professor:
 * for (String v = "#"; !v.equals("######"); v = v + "#") {
 * 	System.out.println (v);
 * 	}
 */


