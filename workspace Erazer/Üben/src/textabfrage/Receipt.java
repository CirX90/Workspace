package textabfrage;
public class Receipt {
	public static void main(String[] args) {
		// Einzelpreise der Waren
		double wurst = 4.2;
		double kaese = 2.3;
		double brot = 2.1;
		double dvd = 12.0;

		// Anzahl der Waren
		int anzWurst = 1;
		int anzKaese = 1;
		int anzBrot = 1;
		int anzDvd = 2;

		// Inhalt der Brieftasche
		double brieftasche = 50.0;

		// Summe gekaufter Waren
		double summe = 0;
		summe = summe + anzWurst * wurst;
		summe = summe + anzKaese * kaese;
		summe = summe + anzBrot * brot;
		summe = summe + anzDvd * dvd;

		if (summe > brieftasche) {
			System.out.println("Sie haben nicht genug Geld in Ihrer Brieftasche");
		} else {
			// Strings lassen sich sehr gut formatieren:
			// http://docs.oracle.com/javase/6/docs/api/java/util/Formatter.html#syntax
			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Wurst", anzWurst, wurst));
			System.out.println(String.format("%30.2f EUR", anzWurst * wurst));

			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Käse", anzKaese, kaese));
			System.out.println(String.format("%30.2f EUR", anzKaese * kaese));

			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Brot", anzBrot, brot));
			System.out.println(String.format("%30.2f EUR", anzBrot * brot));

			System.out.println(String.format("%-9s %2d x %5.2f EUR", "DVD", anzDvd, dvd));
			System.out.println(String.format("%30.2f EUR", anzDvd * dvd));

			System.out.println("__________________________________");

			System.out.println(String.format("%-9s %20.2f EUR", "Gesamt", summe));
			System.out.println(String.format("%-9s %20.2f EUR", "Gegeben", brieftasche));
			System.out.println();
			System.out.println(String.format("%-9s %20.2f EUR", "Zurück", brieftasche - summe));
		}
	}
}