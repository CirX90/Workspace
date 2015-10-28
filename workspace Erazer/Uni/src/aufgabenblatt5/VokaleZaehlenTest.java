package aufgabenblatt5;

import static org.junit.Assert.*;

import org.junit.Test;

public class VokaleZaehlenTest {

	@Test
	public void test() {

		VokaleZaehlen vokale = new VokaleZaehlen();

		// Erster Test!
		String eingabe = "One ring to rule them all, One ring to find them";
		vokale.setEingabe(eingabe);
		vokale.filterGross();
		vokale.filterKlein();
		assertEquals(vokale.getAnzahl_grossbuchstaben(), 2);
		assertEquals(vokale.getAnzahl_kleinbuchstaben(), 12);

		// Zweiter Test!
		String eingabe2 = "AEIOUaeiou";
		vokale.setEingabe(eingabe2);
		vokale.filterGross();
		vokale.filterKlein();
		assertEquals(vokale.getAnzahl_grossbuchstaben(), 5);
		assertEquals(vokale.getAnzahl_kleinbuchstaben(), 5);

		// Dritter Test!
		String eingabe3 = "";
		vokale.setEingabe(eingabe3);
		vokale.filterGross();
		vokale.filterKlein();
		assertEquals(vokale.getAnzahl_grossbuchstaben(), 0);
		assertEquals(vokale.getAnzahl_kleinbuchstaben(), 0);
		
		// Vierter Test!
		String eingabe4 = "NULL";
		vokale.setEingabe(eingabe4);
		vokale.filterGross();
		vokale.filterKlein();
		assertEquals(vokale.getAnzahl_grossbuchstaben(), 1);
		assertEquals(vokale.getAnzahl_kleinbuchstaben(), 0);
		
		// Fünfter Test
		String eingabe5 = null;
		vokale.setEingabe(eingabe5);
		assertEquals(vokale.getEingabe(), null);

	}

}