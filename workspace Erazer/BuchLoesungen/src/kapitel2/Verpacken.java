package kapitel2;

public class Verpacken {
	public static void main(String[] args) {

		int flaschen = 42;
		int volumenKartons = 10;
		int anzahlKartons;
		int restFlaschen;

		anzahlKartons = flaschen / volumenKartons;
		restFlaschen = flaschen % volumenKartons;

		System.out.print("Für " + flaschen + " Flaschen werden "
				+ anzahlKartons + " Kartons benötigt "
				+ "weil in jeden Karton nur " + volumenKartons
				+ " Flaschen passen. Dabei bleiben " + restFlaschen
				+ " Flaschen übrig.");
	}
}