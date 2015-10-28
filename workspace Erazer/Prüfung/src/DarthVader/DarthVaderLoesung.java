/**
 * Laborprüung TI-Programmiertechnik.
 * Sommersemester 2015
 * Hochschule für Angewandte Wissenschaften, Hamburg
 */
package DarthVader;

/**
 * Darth Vader ist eine spezielle SpielFigur.
 * 
 * @author Philipp Jenke
 *
 */
public class DarthVaderLoesung extends SpielFigur {

	public int zahl;
	
	public SpielFigur[] gegner = new DarthVaderLoesung[0];

	/**
	 * Implementieren Sie in DarthVader einen Defaultkonstruktor ohne Parameter.
	 * Darin rufen Sie den Konstruktor von SpielFigur mit dem Namen
	 * "Darth Vader" auf.
	 */

	public DarthVaderLoesung() {
		super("Darth Vader");
	}

	/**
	 * Schreiben Sie eine private, parameterlose Methode getAussagenIndex() mit
	 * Rückgabetyp int. { In der Methode berechnen Sie eine Zufallszahl
	 * zwischen 0 und 2. { Abhängig von der Zufallszahl liefert die Methode
	 * eine weitere Zahl zurück: 0 = 0, 1 = 2, 2 = 5. { Beispiel:
	 * getAussagenIndex() = 2
	 * 
	 * @return zahl
	 */

	private int getAussagenIndex() {

		zahl = (int) (Math.random() * 3);

		if (zahl == 1) {
			zahl = 2;

		} else if (zahl == 2) {
			zahl = 5;

		}
		return zahl;
	}

	@Override
	public String sprechen() {
		
		int zufallsZahl = getAussagenIndex();
		
		return SpielFigur.AUSSAGEN.get(zufallsZahl);
	}
	
	public void gegnerHinzufuegen(SpielFigur neuerGegner) {
		SpielFigur[] gegner2 = new SpielFigur[this.gegner.length+1];
		for (int i = 0; i < gegner.length; i++) {
			gegner2[i] = gegner[i];
		}
		gegner2[gegner.length] = neuerGegner;
		this.gegner = gegner2;
			
	}

}