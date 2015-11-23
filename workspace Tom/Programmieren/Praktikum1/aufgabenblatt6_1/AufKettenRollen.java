package aufgabenblatt6_1;

/**
 * Klasse dient der Repräsentation einer Fähigkeit des Roboters.
 * 
 * @author Tom Hertel
 *
 */

public class AufKettenRollen implements IBewegungsVerhalten {

	/**
	 * Implementierte Methode wird mit Inhalt aus dieser Klasse überschrieben.
	 * Dient der Textausgabe eines Bewegungsverhaltens.
	 */

	@Override
	public void bewegungsVerhalten() {
		System.out.println("Knirsch. Die Ketten drehen sich... und drehen sich"
				+ "... und drehen sich... aber weiter komme ich"
				+ " trotzdem nich!");

	}

}