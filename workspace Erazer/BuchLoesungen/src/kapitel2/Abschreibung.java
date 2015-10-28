package kapitel2;

public class Abschreibung {
	public static void main(String[] args) {
		double buchwert = 15000.;
		double satz = 40.;
		double restwert = 100.;
		int jahr = 1;

		while (buchwert > restwert) {
			buchwert *= 1 - satz / 100;
			System.out
					.println("Buchwert nach " + jahr + " Jahren: " + buchwert);
			jahr++;
		}
	}
}