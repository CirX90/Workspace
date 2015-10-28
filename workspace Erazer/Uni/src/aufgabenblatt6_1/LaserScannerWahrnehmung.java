package aufgabenblatt6_1;

/**
 * Klasse dient der Repräsentation einer Fähigkeit des Roboters.
 * 
 * @author Tom Hertel
 *
 */

public class LaserScannerWahrnehmung implements IWahrnehmungsVerhalten {

	/**
	 * Implementierte Methode wird mit Inhalt aus dieser Klasse überschrieben.
	 * Dient der Textausgabe eines Umgebungswahrnehmungsverhaltens.
	 */

	@Override
	public void wahrnehmungsVerhalten() {
		System.out.println("Die Umgebung wurde gescannt und analysiert."
				+ " Keine Lebenszeichen entdeckt.");

	}

}