package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListKleinstesElementTest {

	@Test
	public <T> void testeSummenRechner1() {
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		ArrayList list = new ArrayList<T>(0);
		IntCheck check = new IntCheck();
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		assertEquals(3, list.getKleinstesElementNEU());
	}

}