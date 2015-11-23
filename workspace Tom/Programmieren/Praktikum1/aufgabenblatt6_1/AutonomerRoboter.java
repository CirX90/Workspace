/**
 * Praktikum TI-PM Gruppe 2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 6, Aufgabe 1
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt6_1;

/**
 * Dieses Programm dient dazu, einen autonomen Roboter in seinen Grundz�gen zu
 * repr�sentieren. Dabei werden zwei Interfaces und mehrere Klassen mit
 * F�higkeiten erstellt, die der Roboter besitzen soll. Wichtig ist, dass man
 * die F�higkeiten wechseln kann und dann per Textausgabe pr�ft, ob diese
 * funktionieren.
 * 
 * @author Tom Hertel
 *
 */

public class AutonomerRoboter {

	/**
	 * Objektvariable des Interface IBewegungsVerhalten damit der Roboter die
	 * Eigenschaften f�r die Bewegung richtig verwalten kann.
	 */

	private IBewegungsVerhalten bewegungsVerhalten;

	/**
	 * Objektvariable des Interface IWahrnehmungsVerhalten damit der Roboter die
	 * Eigenschaften f�r die Wahrnehmung richtig verwalten kann.
	 */

	private IWahrnehmungsVerhalten umgebungsWahrnehmungsVerhalten;

	/**
	 * Der Konstruktor um ein Objekt des Roboters direkt mit zwei Eigenschaften
	 * zu erstellen und deren Textausgabe per Setter Methode abrufbar zu machen.
	 * 
	 * @param bewegen
	 *            , beliebiges Bewegungsverhalten beim Erstellen.
	 * @param wahrnehmen
	 *            , beliebiges Wahrnehmungsverhalten beim Erstellen.
	 */

	public AutonomerRoboter(IBewegungsVerhalten bewegen,
			IWahrnehmungsVerhalten wahrnehmen) {
		setBewegungsVerhalten(bewegen);
		setUmgebungsWahrnehmungsVerhalten(wahrnehmen);

	}

	/**
	 * Methode dient der Ver�nderung des Bewegungsverhaltens des Roboters.
	 * 
	 * @param bewegungsVerhalten
	 */

	public void setBewegungsVerhalten(IBewegungsVerhalten bewegungsVerhalten) {
		this.bewegungsVerhalten = bewegungsVerhalten;
	}

	/**
	 * Methode dient der Ver�nderung des Umgebungswahrnehmungsverhaltens des
	 * Roboters.
	 * 
	 * @param umgebungsWahrnehmungsVerhalten
	 */

	public void setUmgebungsWahrnehmungsVerhalten(
			IWahrnehmungsVerhalten umgebungsWahrnehmungsVerhalten) {
		this.umgebungsWahrnehmungsVerhalten = umgebungsWahrnehmungsVerhalten;
	}

	/**
	 * Methode um eine andere Methode aus dem zust�ndigen Verhaltensinterface
	 * aufzurufen.
	 */

	public void nimmUmgebungWahr() {
		bewegungsVerhalten.bewegungsVerhalten();

	}

	/**
	 * Methode um eine andere Methode aus dem zust�ndigen Verhaltensinterface
	 * aufzurufen.
	 */

	public void bewegeVorwaerts() {
		umgebungsWahrnehmungsVerhalten.wahrnehmungsVerhalten();

	}

	/**
	 * Hauptmethode - Objekt von Roboter wird erstellet und m�gliche Methoden
	 * aufgerufen.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		AutonomerRoboter roboter = new AutonomerRoboter(new AufKettenRollen(),
				new UltraschallWahrnehmung());

		roboter.nimmUmgebungWahr();
		roboter.bewegeVorwaerts();
		roboter.setBewegungsVerhalten(new AufRaedernRollen());
		roboter.setUmgebungsWahrnehmungsVerhalten(new LaserScannerWahrnehmung());
		roboter.nimmUmgebungWahr();
		roboter.bewegeVorwaerts();

	}

}