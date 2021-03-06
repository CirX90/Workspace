package aufgabenblatt1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayHinzufuegenTest {

	/**
	 * Es wird getestet ob Elemente richtig in das Array hinzugefuegt werden.
	 */

	@Test
	public <T> void testeElementHinzufuegen1() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		String test = "543";
		assertEquals(test, list.toString());
	}

	/**
	 * Es wird getestet ob Elemente richtig in das Array hinzugefuegt werden.
	 */

	@Test
	public <T> void testeElementHinzufuegen2() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(9);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		String test = "543543543";
		assertEquals(test, list.toString());
	}

	/**
	 * Es wird getestet ob Elemente richtig in das Array hinzugefuegt werden und
	 * der String mit Faktor zwei vergroessert wird wenn er voll ist.
	 */

	@Test
	public <T> void testeElementHinzufuegen3() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(5);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		String test = "543543543null";
		assertEquals(test, list.toString());
	}
	
	/**
	 * Es wird getestet ob Elemente richtig in das Array hinzugefuegt werden und
	 * der String mit Faktor zwei vergroessert wird wenn er voll ist.
	 */

	@Test
	public <T> void testeElementHinzufuegen4() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		String test = "543543543nullnullnull";
		assertEquals(test, list.toString());
	}

}