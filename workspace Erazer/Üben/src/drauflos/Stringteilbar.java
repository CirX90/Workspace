package drauflos;

public class Stringteilbar {
	public static void main(String[] args) {
	
		int x = 10;
		int y = 5;
		
		String ergebnis = (x%y == 0)? "teilbar" : "nicht teilbar";
		System.out.println(ergebnis);
	}
}