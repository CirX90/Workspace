package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListIntTest {
	
	/**
	 * Es wird getestet ob die erste Zahl in der Liste ein Integer Wert ist.
	 * Erwarte true.
	 */
	
	@Test
	public <T> void testeErsteZahlInt1() {
		int element = 5;
		ArrayList list = new ArrayList<T>(1);
		IntCheck check = new IntCheck();
		list.hinzufuegen(element);
		assertEquals(true, check.pruefe(list));
		
	}
	
	/**
	 * Es wird getestet ob die erste Zahl in der Liste ein Integer Wert ist.
	 * Erwarte false.
	 */
	
	@Test
	public <T> void testeErsteZahlInt2() {
		String element1 = "Hallo";
		int element2 = 5;
		ArrayList list = new ArrayList<T>(2);
		IntCheck check = new IntCheck();
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		assertEquals(false, check.pruefe(list));
		
	}
	
	/**
	 * Es wird getestet ob die erste Zahl in der Liste ein Integer Wert ist.
	 * Erwarte true.
	 */
	
	@Test
	public <T> void testeErsteZahlInt3() {
		int element1 = 4;
		int element2 = 5;
		int element3 = 6;
		ArrayList list = new ArrayList<T>(3);
		IntCheck check = new IntCheck();
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		assertEquals(true, check.pruefe(list));
		
	}

}