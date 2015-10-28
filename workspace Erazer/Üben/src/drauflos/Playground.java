package drauflos;

public class Playground {
	public static void main(String[] args) {
		
		int a = 4;
		int b = 5;
		int erg = zusammenrechnen(a, b);
		System.out.println(erg);
	
	}
	
	public static int zusammenrechnen(int a, int b) {
		int erg = a + b;
		return erg;
	}

}