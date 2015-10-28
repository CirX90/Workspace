/**
 * Laborprüung TI-Programmiertechnik.
 * Sommersemester 2015
 * Hochschule für Angewandte Wissenschaften, Hamburg
 */

package DarthVader;

public class DarthVader extends SpielFigur{
	
	SpielFigur[] gegner = new DarthVader[0];

	public DarthVader() {
		super("Darth Vader");
	}
	
	private int getAussagenIndex() {
		int zufallsZahl = (int) (Math.random() * 3);
		
		if (zufallsZahl == 1) {
			zufallsZahl = 2;
		}
		
		else if (zufallsZahl == 2) {
			zufallsZahl = 5;
		}
		
		return zufallsZahl;
	}

	@Override
	public String sprechen() {
		return SpielFigur.AUSSAGEN.get(getAussagenIndex());
	}
	
	public void gegnerHinzufuegen(SpielFigur neuerGegner) {
		SpielFigur[] naechsterGegner = new DarthVader[gegner.length + 1];
		
		for(int index = 0; index < gegner.length; index++) {
			naechsterGegner[index] = gegner[index];
		}
		
		naechsterGegner[gegner.length] = neuerGegner;
		gegner = naechsterGegner;
	}
	
}