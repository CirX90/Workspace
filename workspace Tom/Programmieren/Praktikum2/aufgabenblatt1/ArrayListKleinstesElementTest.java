package aufgabenblatt1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayListKleinstesElementTest {
	
	/**
	 * Es wird getestet ob das kleinste Element herausgesucht wird.
	 */

	@Test
	public <T> void testeGetKleinstesElement1() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(3);
		IntCheck check = new IntCheck();
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		assertEquals(3, list.getKleinstesElement());
	}
	
	/**
	 * Es wird getestet ob das kleinste Element herausgesucht wird.
	 */
	
	@Test
	public <T> void testeGetKleinstesElement2() {
		int element1 = 1;
		int element2 = 2;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(3);
		IntCheck check = new IntCheck();
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		assertEquals(1, list.getKleinstesElement());
	}
	
	/**
	 * Es wird getestet ob das kleinste Element herausgesucht wird.
	 */
	
	@Test
	public <T> void testeGetKleinstesElement3() {
		int element1 = 4567;
		int element2 = 2315;
		int element3 = 9874;
		ArrayList list = new ArrayList<T>(3);
		IntCheck check = new IntCheck();
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		assertEquals(2315, list.getKleinstesElement());
	}

}