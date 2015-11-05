package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListElementeEntfernenTest {

	/**
	 * Es wird getestet ob ein Element, welches nach Elementnamen gesucht wurde,
	 * aus der Liste gelöscht wird.
	 */

	@Test
	public <T> void testeElementEntfernen1() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(0);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.entfernen(3);
		assertEquals(null, list.get(2));
	}

	/**
	 * Es wird getestet ob ein Element, welches nach Elementnamen gesucht wurde,
	 * aus der Liste gelöscht wird.
	 */

	@Test
	public <T> void testeElementEntfernen2() {
		int element1 = 6547;
		int element2 = 21354;
		int element3 = 54334;
		ArrayList list = new ArrayList<T>(0);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.entfernen(54334);
		assertEquals(null, list.get(2));
	}

	/**
	 * Es wird getestet ob ein Element, welches nach Indexstelle gesucht wurde,
	 * aus der Liste gelöscht wird.
	 */

	@Test
	public <T> void testeElementEntfernen3() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(0);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.entferneElementAnIndex(1);;
		assertEquals(null, list.get(1));
	}
	
	/**
	 * Es wird getestet ob ein Element, welches nach Indexstelle gesucht wurde,
	 * aus der Liste gelöscht wird.
	 */

	@Test
	public <T> void testeElementEntfernen4() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(0);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.entferneElementAnIndex(0);;
		assertEquals(null, list.get(0));
	}

}