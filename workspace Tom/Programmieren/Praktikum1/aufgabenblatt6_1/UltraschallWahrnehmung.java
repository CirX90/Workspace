package aufgabenblatt6_1;

/**
 * Klasse dient der Repr�sentation einer F�higkeit des Roboters.
 * 
 * @author Tom Hertel
 *
 */

public class UltraschallWahrnehmung implements IWahrnehmungsVerhalten {

	/**
	 * Implementierte Methode wird mit Inhalt aus dieser Klasse �berschrieben.
	 * Dient der Textausgabe eines Umgebungswahrnehmungsverhaltens.
	 */

	@Override
	public void wahrnehmungsVerhalten() {
		System.out
				.println("Bzzt. Ich habe ein 3D-Modell der Umgebung erstellt."
						+ " Oh, das ist dann wohl die Besenkammer.");

	}

}