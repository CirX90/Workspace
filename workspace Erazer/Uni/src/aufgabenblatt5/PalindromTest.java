package aufgabenblatt5;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromTest {

	@Test
	public void test() {

		Palindrom palindrom = new Palindrom();

		// erster Test ob es ein Palindrom ist!
		String eingabe1 = "Lagerregal";
		boolean output1 = palindrom.isPalindrom(eingabe1);
		assertEquals(true, output1);

		// zweiter Test der zeigen soll, dass nur Palindrome funktionieren.
		String eingabe2 = "holzfuß";
		boolean output2 = palindrom.isPalindrom(eingabe2);
		assertEquals(false, output2);

		// dritter Test, längstes Palindrom herausfiltern.
		String eingabe3 = "Lagerregalseite";
		String output3 = palindrom.getLaengstesPalindrom(eingabe3);
		assertEquals("Lagerregal", output3);
		
		// vierter Test, längstes Palindrom herausfiltern.
		String eingabe4 = "Holzlagerregal";
		String output4 = palindrom.getLaengstesPalindrom(eingabe4);
		assertEquals("lagerregal", output4);
				
		// fünfter Test, längstes Palindrom herausfiltern. 
		// Ausgabe wieder mit Großbuchstabe.
		String eingabe5 = "Anna";
		String output5 = palindrom.getLaengstesPalindrom(eingabe5);
		assertEquals("Anna", output5);
		
		// sechster Test, längstes Palindrom herausfiltern. 
		// Ausgabe wieder mit Großbuchstabe.
		String eingabe6 = "AnA";
		String output6 = palindrom.getLaengstesPalindrom(eingabe6);
		assertEquals("AnA", output6);
		
		// siebter Test, ob das Programm bei Stringinhalt null abstürzt.
		String eingabe7 = null;
		assertEquals(palindrom.getLaengstesPalindrom(eingabe7), "Kein Inhalt entdeckt"); 
		
		// achter Test, längstes Palindrom herausfiltern.
		String eingabe8 = "abcdefghijklmnHOLZLAGERREGALSEITEopqrstuvwxyz";
		String output8 = palindrom.getLaengstesPalindrom(eingabe8);
		assertEquals("LAGERREGAL", output8);

	}

}