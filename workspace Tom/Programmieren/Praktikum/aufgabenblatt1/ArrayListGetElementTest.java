package aufgabenblatt1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayListGetElementTest {

	/**
	 * Es wird getestet ob der richtige Inhalt an der gewünschten Indexstelle
	 * ausgegeben wird.
	 */

	@Test
	public <T> void testeElemente1() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		assertEquals(5, list.get(0));
	}
	
	/**
	 * Es wird getestet ob der richtige Inhalt an der gewünschten Indexstelle
	 * ausgegeben wird.
	 */

	@Test
	public <T> void testeElemente2() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		assertEquals(4, list.get(1));
	}
	
	/**
	 * Es wird getestet ob der richtige Inhalt an der gewünschten Indexstelle
	 * ausgegeben wird.
	 */

	@Test
	public <T> void testeElemente3() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		assertEquals(3, list.get(2));
	}

}