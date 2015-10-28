package kapitel2;

public class Teilbarkeit2 {
	public static void main(String[] args) {
		int x = 123456789;
		int y = 3;

		String ergebnis = (x % y == 0) ? "teilbar" : "nicht teilbar";

		System.out.println(x + " ist durch " + y + " " + ergebnis + ".");
	}
}