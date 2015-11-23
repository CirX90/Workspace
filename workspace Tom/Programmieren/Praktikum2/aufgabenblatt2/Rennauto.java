/**
 * Praktikum TI-PM2, WS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Lenard Lange 	 (lenard.lange@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.3
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt2;

/**
 * Klasse um ein Rennauto in einem Rennen zu simulieren. Diese ist als Thread
 * umgesetzt. Zur Laufzeit bewegt sich das Rennauto sekundenweise in Schritten
 * weiter. Dazu hat ein Rennauto eine Durchschnittsgeschwindigkeit in m/s und
 * kennt die Länge der Rennstrecke. Da die Fahrer mal besser und mal schlechter
 * fahren, benötigen Sie aber nicht genau eine Sekunde pro Schritt. Stattdessen
 * variiert die Zeit für einen Schritt zufallsbasiert zwischen 0.8 und 1.2
 * Sekunden. Nach jedem Schritt gibt das Auto seine aktuelle Position aus. Hat
 * das Auto das Streckenende erreicht, endet der Thread. Das Auto merkt sich am
 * Streckenende die benötigte Zeit in Sekunden.
 * 
 * @author Tom, Lenard
 *
 */

public class Rennauto extends Thread implements Comparable<Rennauto> {

	/**
	 * Startzeit des Programms festhalten.
	 */

	private long startZeit = System.currentTimeMillis();

	/**
	 * Aktuelle Position der Autos.
	 */

	private double aktuellePosition = 0;

	/**
	 * Zugriff auf Variablen und Methoden der Klasse Rennen.
	 */

	Rennen rennen = new Rennen();

	/**
	 * Geschwindigkeit der Rennautos.
	 */

	private double geschwindigkeit;

	/**
	 * Dauer die die Liebenszeit der Threads darstellen soll.
	 */

	private double dauer;

	/**
	 * Name der Autos.
	 */

	private String fahrerName;

	/**
	 * Zeit für einen Schritt der Autos variiert zufallsbasiert zwischen 0.8 und
	 * 1.2 Sekunden.
	 */

	private int schrittZeit = (int) (Math.random() * 401 + 800);

	// Getter Methoden

	public double getAktuellePosition() {
		return aktuellePosition;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public double getDauer() {
		return dauer;
	}

	public String getFahrerName() {
		return fahrerName;
	}

	/**
	 * Konstruktor.
	 * 
	 * @param name
	 * @param streckenlaenge
	 */

	public Rennauto(String fahrerName, double geschwindigkeit) {
		this.fahrerName = fahrerName;
		this.geschwindigkeit = geschwindigkeit;
	}

	/**
	 * Override run Methode. Aktuelle Position der einzelnen Autos wird jede
	 * Runde ermittelt und ausgegeben. Die "dauer" wird mit der Differenz aus
	 * Start- und Endzeitpunkt des Threads befüllt. In Sekunden umgewandelt und
	 * gerundet. Der Thread wir so lange schlafen gelegt wie eine zeit zwischen
	 * einem Schritt der Autos dauern soll.
	 */

	@Override
	public void run() {
		while (!isInterrupted()
				&& aktuellePosition <= rennen.getStreckenlaenge() - 1) {

			aktuellePosition += getGeschwindigkeit();

			System.err.println(fahrerName + ": " + aktuellePosition + "/"
					+ rennen.getStreckenlaenge());

			// Differnez zwischen Start- und Endzeitpunkt.
			dauer = System.currentTimeMillis() - startZeit;
			// Umwandlung von Mili ind Sekunden.
			dauer /= 1000;
			// Runden auf eine Nachkommastelle.
			dauer = Math.round(dauer * 10.0) / 10.0;

			try {
				Thread.sleep(schrittZeit);
			} catch (InterruptedException e) {
				try {
					Thread.sleep(1000);
					interrupt();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	/**
	 * Override CompareTo Methode um Autos nach der Zeit zu sortieren.
	 */

	@Override
	public int compareTo(Rennauto auto) {
		int ergebnis = 0;
		if (getDauer() < auto.getDauer()) {
			ergebnis = -1;
		}
		if (getDauer() == auto.getDauer()) {
			ergebnis = 0;
		}
		if (getDauer() > auto.getDauer()) {
			ergebnis = 1;
		}
		return ergebnis;
	}
}