/**
 * Praktikum TI-PM2, WS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Lenard Lange 	 (lenard.lange@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.3
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt2;

/**
 * Klasse simuliert zus�tzlich einen Rennabbruch. Dazu wird ein zus�tzlicher
 * Thread implementiert, der einmal pro Sekunde mit einer Wahrscheinlichkei von
 * 10% einen Rennabbruch ausl�st. Daf�r kennt die Klasse die Rennwagen und
 * sendet diesen bei einem Abbruch ein Interrupt. 
 * 
 * @author Lenard, Tom
 *
 */
public class Rennabbruch extends Thread {

	/**
	 * Zugriff auf Variablen und Methoden der Klasse Rennen.
	 */

	private Rennauto auto1;

	/**
	 * Zugriff auf Variablen und Methoden der Klasse Rennen.
	 */

	private Rennauto auto2;

	/**
	 * Zugriff auf Variablen und Methoden der Klasse Rennen.
	 */

	private Rennauto auto3;

	/**
	 * Stellt die Rundenanzahl des Rennens dar.
	 */

	private double runden;

	/**
	 * Konstruktor
	 * 
	 * @param auto1
	 * @param auto2
	 * @param auto3
	 * @param runden
	 */

	public Rennabbruch(Rennauto auto1, Rennauto auto2, Rennauto auto3,
			double runden) {
		this.auto1 = auto1;
		this.auto2 = auto2;
		this.auto3 = auto3;
		this.runden = runden;
	}

	/**
	 * Override run Methode. Wird so lange wiederholt bis sie interrupted wird.
	 * Es wird eine Variable Zaehler deklariert die jedes mal mit der aktuellen
	 * Position eines Wagens gef�llt wird. Sollte dieser Z�hler den gleichen
	 * Wert wie "runden" besitzen wird die Methode interrupted und durch die
	 * Schleife dann beendet. Abbruch Variable die eine Zahl zwischen 1 und 10
	 * erh�lt. Der Threads wird eine Sekunde schlafen gelegt und pr�ft dann
	 * durch eine Bedingung ob die Abbruchvariable mit einer 1 �bereinstimmt um
	 * eine 10% Chance zu simulieren. Sollte dies der Fall sein werden alle
	 * Threads beendet.
	 */

	@Override
	public void run() {

		while (!isInterrupted()) {

			double zaehler = auto3.getAktuellePosition();

			int abbruch = (int) (10 * Math.random() + 1);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			if (abbruch == 1) {
				auto1.interrupt();
				auto2.interrupt();
				auto3.interrupt();
				interrupt();
				System.out.println("Rennabbruch");
			}

			if (zaehler == runden) {
				interrupt();
			}
		}
	}
}