package desafios;

public class DesafioForDois {

	public static void main(String[] args) {

		boolean teste = true;
		String total = "";
		
		/*No for existem 3 espa�os (    ;     ;    ) No primeiro espa�o temos a variavel normalmente j� inicializada (ponto de partida), no segundo espa�o temos "at� onde queremos ir" 
		 * no terceiro espa�o temos o incremento, ou seja, "o que faz o for parar"
		 */
		
		for (int linha = 0; teste; linha++) {

			total += "#"; //Aqui significa total = total + 1 "#" - que significa somat�rio (ensino fundamental)
			
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


