package kapitel2;

public class Teilbarkeit {
	public static void main(String[] args) {
		
		int x = 123456789;
		int y = 3;
		
		if (x%y == 0) {
			System.out.println("x ist durch y ohne Rest teilbar, denn " + x +
					"/" + y + " = " + x/y + ".");
		}
		
		else {
			System.out.println("Die Zahlen sind NICHT ohne Rest teilbar!");
		}
	}

}