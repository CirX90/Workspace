package aufgabenblatt1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayListSummenRechnerTest {

	/**
	 * Es wird getestet ob der Summenrechner alle Integer-Werte der Liste
	 * zusammenrechnet.
	 */

	@Test
	public <T> void testeSummenRechner1() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		assertEquals(12, list.summenRechner());
	}

	/**
	 * Es wird getestet ob der Summenrechner alle Integer-Werte der Liste
	 * zusammenrechnet. Erwarte 0 weil nicht ausschlie�lich Integer-Werte
	 * enthalten sind.
	 */

	@Test
	public <T> void testeSummenRechner2() {
		String element1 = "Hallo";
		int element2 = 5;
		ArrayList list = new ArrayList<T>(2);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		assertEquals(0, list.summenRechner());

	}
	
	/**
	 * Es wird getestet ob der Summenrechner alle Integer-Werte der Liste
	 * zusammenrechnet.
	 */
	
	@Test
	public <T> void testeSummenRechner3() {
		int element1 = 645;
		int element2 = 4124;
		int element3 = 783;
		ArrayList list = new ArrayList<T>(3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		assertEquals(5552, list.summenRechner());
	}

}