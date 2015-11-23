/**
 * Praktikum TI-PM2, WS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Lenard Lange 	 (lenard.lange@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.2
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class StreamKorrektionTest {

	/**
	 * In Dieser Testmethode wird getestet ob ein StringArray richtig in einen
	 * Stream erzeugt wird, dieser soll nach Aufgabe durch mehrere Punkte
	 * gefiltert werden.
	 */

	@Test
	public void testStreamFilter1() {
		StreamKorrektion stream = new StreamKorrektion();
		String[] eingabe = { "Eingabe ", "Äußeres ", null, "Strassen-Feger",
				" ein Haus" };
		String[] korrekturString = { "EINGABE", "AEUSSERE", "STRASSEN",
				"EIN HAUS" };
		List<String> korrekturList = Arrays.stream(korrekturString)
				.collect(Collectors.toList());
		assertEquals(stream.stringVerarbeiter(eingabe), korrekturList);
	}
	
	/**
	 * In Dieser Testmethode wird getestet ob ein StringArray richtig in einen
	 * Stream erzeugt wird, dieser soll nach Aufgabe durch mehrere Punkte
	 * gefiltert werden.
	 */

	@Test
	public void testStreamFilter2() {
		StreamKorrektion stream = new StreamKorrektion();
		String[] eingabe = { "     der Baum   ", "ßßßß ", null, "ÖÄÜÜÄÖ", null,
				"Fachwortdesjahresüberbringer" };
		String[] korrekturString = { "DER BAUM", "SSSSSSSS", "OEAEUEUE",
				"FACHWORT" };
		List<String> korrekturList = Arrays.stream(korrekturString)
				.collect(Collectors.toList());
		assertEquals(stream.stringVerarbeiter(eingabe), korrekturList);
	}

}
