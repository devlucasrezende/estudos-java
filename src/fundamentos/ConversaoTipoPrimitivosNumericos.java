package fundamentos;

public class ConversaoTipoPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1; //conversão implícita
		System.out.println(a);
		
		float b = (float) 1.12345454535342353545; //conversão explicita através do (CAST)
		System.out.println(b);
		
		int c = 128;
		byte d = (byte)c; //conversão explicita através do (CAST)
		
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		
		System.out.println(f);
		
		
	}

}
