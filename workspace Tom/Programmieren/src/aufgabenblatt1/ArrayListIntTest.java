package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListIntTest {
	
	@Test
	public <T> void testeErsteZahlInt1() {
		int element = 5;
		ArrayList list = new ArrayList<T>(0);
		IntCheck check = new IntCheck();
		list.hinzufuegen(element);
		assertEquals(true, check.pruefe(list));
		
	}

}