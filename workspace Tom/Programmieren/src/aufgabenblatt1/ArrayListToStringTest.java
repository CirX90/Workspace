package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListToStringTest {

	/**
	 * Es wird getestet ob der Listeninhalt in einen String umgewandelt wird.
	 */

	@Test
	public <T> void testeToString1() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		String ergebnis = "543";
		assertEquals(ergebnis, list.toString());
	}
	
	/**
	 * Es wird getestet ob der Listeninhalt in einen String umgewandelt wird.
	 */

	@Test
	public <T> void testeToString2() {
		int element1 = 543;
		int element2 = 435;
		int element3 = 354;
		ArrayList list = new ArrayList<T>(3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		String ergebnis = "543435354";
		assertEquals(ergebnis, list.toString());
	}
}