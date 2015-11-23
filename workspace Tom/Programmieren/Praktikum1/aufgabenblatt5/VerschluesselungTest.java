package aufgabenblatt5;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerschluesselungTest {

	@Test
	public void test() {

		Verschluesselung caesar = new Verschluesselung();

		// Erster Test
		String eingabe1 = "PHILIPP";
		caesar.setEingabe(eingabe1);
		String output1 = caesar.verschluesseln();
		assertEquals("TLMPMTT", output1);
		// entschluesseln
		String eingabe2 = "TLMPMTT";
		caesar.setEingabe(eingabe2);
		caesar.entschluesseln(eingabe2);
		String output2 = caesar.entschluesseln(eingabe2);
		assertEquals("PHILIPP", output2);

		// Zweiter Test 
		String eingabe3 = "HALLO";
		caesar.setEingabe(eingabe3);
		String output3 = caesar.verschluesseln();
		assertEquals("LEPPS", output3);
		// entschluesseln
		String eingabe4 = "LEPPS";
		caesar.setEingabe(eingabe4);
		String output4 = caesar.entschluesseln(eingabe4);
		assertEquals("HALLO", output4);

		// Dritter Test
		String eingabe5 = "KUGELSCHREIBERZUSAMMENBAUANLEITUNGSSERVICENUMMER";
		caesar.setEingabe(eingabe5);
		String output5 = caesar.verschluesseln();
		assertEquals("OYKIPWGLVIMFIVDYWEQQIRFEYERPIMXYRKWWIVZMGIRYQQIV",
				output5);
		// entschluesseln
		String eingabe6 = "OYKIPWGLVIMFIVDYWEQQIRFEYERPIMXYRKWWIVZMGIRYQQIV";
		caesar.setEingabe(eingabe6);
		String output6 = caesar.entschluesseln(eingabe6);
		assertEquals("KUGELSCHREIBERZUSAMMENBAUANLEITUNGSSERVICENUMMER",
				output6);
		
		// Vierter Test
		String eingabe7 = null;
		caesar.setEingabe(eingabe7);
		assertEquals(caesar.getEingabe(), null);
		
	}

}