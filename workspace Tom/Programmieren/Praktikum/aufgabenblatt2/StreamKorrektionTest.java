/**
 * Praktikum TI-PM2, WS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Lenard Lange 	 (lenard.lange@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.2
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class StreamKorrektionTest {

	@Test
	public void test() {
		StreamKorrektion stream = new StreamKorrektion();
		String[] eingabe = {"Eingabe ", "�u�eres ", null, "Strassen-Feger", " ein Haus" };
//		List<String> str2 = { EINGABE, AEUSSERE, STRASSEN, EIN HAUS };
//		List<String> str = stream.stringVerarbeiter(eingabe);
//		assertEquals(str, korrektur);
	}

}
