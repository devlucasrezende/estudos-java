package fundamentos;

public class ConversaoTipoPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1; //convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.12345454535342353545; //convers�o explicita atrav�s do (CAST)
		System.out.println(b);
		
		int c = 128;
		byte d = (byte)c; //convers�o explicita atrav�s do (CAST)
		
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		
		System.out.println(f);
		
		
	}

}
