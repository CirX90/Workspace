package aufgabenblatt6_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogikGatterTest {

	/**
	 * Logisches Und, Wert nur true wenn beide Konstante true sind.
	 */

	@Test
	public void und1() {
		LogikGatter konstante1 = new Konstante(true);
		LogikGatter konstante2 = new Konstante(true);
		LogikGatter und1 = new Und(konstante1, konstante2);
		assertEquals(und1.auswerten(), true);
	}

	/**
	 * Logisches Und, Wert nur true wenn beide Konstante true sind.
	 */

	@Test
	public void und2() {
		LogikGatter konstante1 = new Konstante(true);
		LogikGatter konstante2 = new Konstante(false);
		LogikGatter und2 = new Und(konstante1, konstante2);
		assertEquals(und2.auswerten(), false);
	}

	/**
	 * Logisches Und, Wert nur true wenn beide Konstante true sind.
	 */

	@Test
	public void und3() {
		LogikGatter konstante1 = new Konstante(false);
		LogikGatter konstante2 = new Konstante(true);
		LogikGatter und3 = new Und(konstante1, konstante2);
		assertEquals(und3.auswerten(), false);
	}

	/**
	 * Logisches Und, Wert nur true wenn beide Konstante true sind.
	 */

	@Test
	public void und4() {
		LogikGatter konstante1 = new Konstante(false);
		LogikGatter konstante2 = new Konstante(false);
		LogikGatter und4 = new Und(konstante1, konstante2);
		assertEquals(und4.auswerten(), false);
	}

	/**
	 * Falls eine oder beide Konstanten Inhalt null haben, wird eine Exception
	 * erwartet.
	 */

	@Test(expected = IllegalArgumentException.class)
	public void und5() {
		LogikGatter konstante1 = new Konstante(false);
		LogikGatter und5 = new Oder(konstante1, null);
		assertEquals(und5.auswerten(), null);
	}

	/**
	 * Testet die Anzahl der Eingänge. Erwarte 2.
	 */

	@Test
	public void und6() {
		LogikGatter konstante1 = new Konstante(true);
		LogikGatter konstante2 = new Konstante(true);
		LogikGatter und6 = new Und(konstante1, konstante2);
		int eingaenge = 2;
		assertEquals(und6.getAnzahlEingaenge(), eingaenge);
	}

	/**
	 * Logisches Oder, Wert nur true wenn eine oder beide Konstante true sind.
	 */

	@Test
	public void oder1() {
		LogikGatter konstante1 = new Konstante(true);
		LogikGatter konstante2 = new Konstante(true);
		LogikGatter oder1 = new Oder(konstante1, konstante2);
		assertEquals(oder1.auswerten(), true);
	}

	/**
	 * Logisches Oder, Wert nur true wenn eine oder beide Konstante true sind.
	 */

	@Test
	public void oder2() {
		LogikGatter konstante1 = new Konstante(true);
		LogikGatter konstante2 = new Konstante(false);
		LogikGatter oder2 = new Oder(konstante1, konstante2);
		assertEquals(oder2.auswerten(), true);
	}

	/**
	 * Logisches Oder, Wert nur true wenn eine oder beide Konstante true sind.
	 */

	@Test
	public void oder3() {
		LogikGatter konstante1 = new Konstante(false);
		LogikGatter konstante2 = new Konstante(true);
		LogikGatter oder3 = new Oder(konstante1, konstante2);
		assertEquals(oder3.auswerten(), true);
	}

	/**
	 * Logisches Oder, Wert nur true wenn eine oder beide Konstante true sind.
	 */

	@Test
	public void oder4() {
		LogikGatter konstante1 = new Konstante(false);
		LogikGatter konstante2 = new Konstante(false);
		LogikGatter oder4 = new Oder(konstante1, konstante2);
		assertEquals(oder4.auswerten(), false);
	}

	/**
	 * Falls eine oder beide Konstanten Inhalt null haben, wird eine Exception
	 * erwartet.
	 */

	@Test(expected = IllegalArgumentException.class)
	public void oder5() {
		LogikGatter konstante1 = new Konstante(false);
		LogikGatter oder5 = new Oder(konstante1, null);
		assertEquals(oder5.auswerten(), null);
	}

	/**
	 * Testet die Anzahl der Eingänge. Erwarte 2.
	 */

	@Test
	public void oder6() {
		LogikGatter konstante1 = new Konstante(true);
		LogikGatter konstante2 = new Konstante(true);
		LogikGatter oder6 = new Oder(konstante1, konstante2);
		int eingaenge = 2;
		assertEquals(oder6.getAnzahlEingaenge(), eingaenge);
	}

	/**
	 * Logische Negation, Wert nur true wenn Konstante false ist.
	 */

	@Test
	public void negation1() {
		LogikGatter konstante1 = new Konstante(false);
		LogikGatter negation1 = new Negation(konstante1);
		assertEquals(negation1.auswerten(), true);
	}

	/**
	 * Logische Negation, Wert nur true wenn Konstante false ist.
	 */

	@Test
	public void negation2() {
		LogikGatter konstante1 = new Konstante(true);
		LogikGatter negation2 = new Negation(konstante1);
		assertEquals(negation2.auswerten(), false);
	}

	/**
	 * Wert bei keinem Eingang false.
	 */

	@Test
	public void negation3() {
		LogikGatter negation1 = new Negation();
		assertEquals(negation1.auswerten(), false);
	}

	/**
	 * Wert bei mehr als einem Eingang false.
	 */

	@Test
	public void negation4() {
		LogikGatter konstante1 = new Konstante(true);
		LogikGatter konstante2 = new Konstante(true);
		LogikGatter negation1 = new Negation(konstante1, konstante2);
		assertEquals(negation1.auswerten(), false);
	}

	/**
	 * Testet die Anzahl der Eingänge. Erwarte 1.
	 */

	@Test
	public void negation5() {
		LogikGatter konstante1 = new Konstante(true);
		LogikGatter negation5 = new Negation(konstante1);
		int eingaenge = 1;
		assertEquals(negation5.getAnzahlEingaenge(), eingaenge);
	}

	/**
	 * Testet die Anzahl der Eingänge. Erwarte 0.
	 */

	@Test
	public void konstante1() {
		LogikGatter konstante1 = new Konstante(true);
		int eingaenge = 0;
		assertEquals(konstante1.getAnzahlEingaenge(), eingaenge);
	}

	/**
	 * Test Beispielschaltung1 Konstante 1 true, Konstante 2 true -> erwartet
	 * Wert false.
	 */

	@Test
	public void testBeispielschaltung1() {

		LogikGatter konstante1 = new Konstante(true);
		LogikGatter konstante2 = new Konstante(true);

		Und und1 = new Und(konstante1, konstante2);
		Oder oder1 = new Oder(konstante1, konstante2);

		Negation negation1 = new Negation(und1);
		Oder oder2 = new Oder(und1, oder1);

		Und und2 = new Und(negation1, oder2);

		assertEquals(und1.auswerten(), true);
		assertEquals(oder1.auswerten(), true);
		assertEquals(negation1.auswerten(), false);
		assertEquals(oder2.auswerten(), true);
		assertEquals(und2.auswerten(), false);
	}

	/**
	 * Test Beispielschaltung2 Konstante 1 true, Konstante 2 false -> erwartet
	 * Wert true.
	 */

	@Test
	public void testBeispielschaltung2() {

		LogikGatter konstante1 = new Konstante(true);
		LogikGatter konstante2 = new Konstante(false);

		Und und1 = new Und(konstante1, konstante2);
		Oder oder1 = new Oder(konstante1, konstante2);

		Negation negation1 = new Negation(und1);
		Oder oder2 = new Oder(und1, oder1);

		Und und2 = new Und(negation1, oder2);

		assertEquals(und1.auswerten(), false);
		assertEquals(oder1.auswerten(), true);
		assertEquals(negation1.auswerten(), true);
		assertEquals(oder2.auswerten(), true);
		assertEquals(und2.auswerten(), true);
	}

	/**
	 * Test Beispielschaltung3 Konstante 1 false, Konstante 2 true -> erwartet
	 * Wert true.
	 */

	@Test
	public void testBeispielschaltung3() {

		LogikGatter konstante1 = new Konstante(false);
		LogikGatter konstante2 = new Konstante(true);

		Und und1 = new Und(konstante1, konstante2);
		Oder oder1 = new Oder(konstante1, konstante2);

		Negation negation1 = new Negation(und1);
		Oder oder2 = new Oder(und1, oder1);

		Und und2 = new Und(negation1, oder2);

		assertEquals(und1.auswerten(), false);
		assertEquals(oder1.auswerten(), true);
		assertEquals(negation1.auswerten(), true);
		assertEquals(oder2.auswerten(), true);
		assertEquals(und2.auswerten(), true);
	}

	/**
	 * Test Beispielschaltung4 Konstante 1 false, Konstante 2 false -> erwartet
	 * Wert false.
	 */

	@Test
	public void testBeispielschaltung4() {

		LogikGatter konstante1 = new Konstante(false);
		LogikGatter konstante2 = new Konstante(false);

		Und und1 = new Und(konstante1, konstante2);
		Oder oder1 = new Oder(konstante1, konstante2);

		Negation negation1 = new Negation(und1);
		Oder oder2 = new Oder(und1, oder1);

		Und und2 = new Und(negation1, oder2);

		assertEquals(und1.auswerten(), false);
		assertEquals(oder1.auswerten(), false);
		assertEquals(negation1.auswerten(), true);
		assertEquals(oder2.auswerten(), false);
		assertEquals(und2.auswerten(), false);
	}

	/**
	 * Test Beispielschaltung5 mit null Konstanten -> erwartet Exception mit
	 * Wert null.
	 */

	@Test(expected = IllegalArgumentException.class)
	public void testBeispielschaltung5() {

		LogikGatter konstante1 = new Konstante(false);
		LogikGatter konstante2 = new Konstante(false);

		Und und1 = new Und(null, konstante2);
		Oder oder1 = new Oder(konstante1, null);

		Negation negation1 = new Negation(und1);
		Oder oder2 = new Oder(und1, oder1);

		Und und2 = new Und(negation1, oder2);

		assertEquals(und1.auswerten(), null);
		assertEquals(oder1.auswerten(), null);
		assertEquals(negation1.auswerten(), null);
		assertEquals(oder2.auswerten(), null);
		assertEquals(und2.auswerten(), null);
	}

}