/**
 * Praktikum TI-PM Gruppe 2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 2
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt4_2;

public class Kontrollstation {

	public static void main(String[] args) {

		// Lok und Zug erstellen und zwei Wagen hinzuf�gen.
		Lokomotive lok1 = new Lokomotive(60, 1337);
		Zug zug1 = new Zug(lok1);

		// Zuf�llige Seriennummer mit Math.random.
		zug1.wagenHinzufuegen(new Wagen(20, 60,
				(int) (Math.random() * 10000) + 1));
		zug1.wagenHinzufuegen(new Wagen(25, 60,
				(int) (Math.random() * 10000) + 1));

		// Ausgabe des ersten Zugs mit allen Informationen.
		zug1.info();
		System.out.format("............................................\n");
		System.out.format("Anzahl der Wagen: %d\n", zug1.getWagenAnzahl());
		System.out.format("Gesamtkapazit�t: %d Person(en)\n",
				zug1.getKapazitaet());
		System.out.format("Gesamtl�nge: %d Meter\n", zug1.getLaenge());
		System.out.format("............................................\n");

		// zweiten Zug erstellen und einen Wagen hinzuf�gen.
		Lokomotive lok2 = new Lokomotive(60, 1234);
		Zug zug2 = new Zug(lok2);

		zug2.wagenHinzufuegen(new Wagen(15, 40,
				(int) (Math.random() * 10000) + 1));

		// Ausgabe des zweiten Zugs mit allen Informationen.
		zug2.info();
		System.out.format("............................................\n");
		System.out.format("Anzahl der Wagen: %d\n", zug2.getWagenAnzahl());
		System.out.format("Gesamtkapazit�t: %d Person(en)\n",
				zug2.getKapazitaet());
		System.out.format("Gesamtl�nge: %d Meter\n", zug2.getLaenge());
		System.out.format("............................................\n");

		// Aufruf Methode, Wagen von Zug1 an Zug2 anh�ngen.
		System.out.println("\nWagen werden umgeh�ngt.\n");
		zug1.zugAnhaengen(zug1);

		// Ausgabe des ersten Zugs mit allen ver�nderten Informationen.
		zug1.info();
		System.out.format("............................................\n");
		System.out.format("Anzahl der Wagen: %d\n", zug1.getWagenAnzahl());
		System.out.format("Gesamtkapazit�t: %d Person(en)\n",
				zug1.getKapazitaet());
		System.out.format("Gesamtl�nge: %d Meter\n", zug1.getLaenge());
		System.out.format("............................................\n");

		// Ausgabe des zweiten Zugs mit allen ver�nderten Informationen.
		zug2.info();
		System.out.format("............................................\n");
		System.out.format("Anzahl der Wagen: %d\n", zug2.getWagenAnzahl());
		System.out.format("Gesamtkapazit�t: %d Person(en)\n",
				zug2.getKapazitaet());
		System.out.format("Gesamtl�nge: %d Meter\n", zug2.getLaenge());
		System.out.format("............................................\n");

	}

}