package arrays;


public class ExercicioForeach {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		double total = 0;
		for (double nota:  notasAlunoA) {
			total += nota;
			
		}
		
		System.out.println(total / notasAlunoA.length);

		//double notaArmazenada = 5.9;
		//double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };

		//for (double totalAlunoB : notasAlunoB) {

			//System.out.println(totalAlunoB / notasAlunoB.length);

		}
	}
//}
