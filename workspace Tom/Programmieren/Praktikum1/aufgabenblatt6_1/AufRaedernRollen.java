package aufgabenblatt6_1;

/**
 * Klasse dient der Repr�sentation einer F�higkeit des Roboters.
 * 
 * @author Tom Hertel
 *
 */

public class AufRaedernRollen implements IBewegungsVerhalten {

	/**
	 * Implementierte Methode wird mit Inhalt aus dieser Klasse �berschrieben.
	 * Dient der Textausgabe eines Bewegungsverhaltens.
	 */

	@Override
	public void bewegungsVerhalten() {
		System.out.println("Swusch! Ich rolle! Dies ist eine kleine Fahrt f�r"
				+ " einen Roboter... aber eine gewaltige Reise"
				+ " f�r die Robotik.");
	}

}