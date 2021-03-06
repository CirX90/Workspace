/**
 * Praktikum TI-PM2, WS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Lenard Lange 	 (lenard.lange@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.1
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RechnerTest {

	/**
	 * Diese Testmethode testet eine Rechnung aus Division.
	 */

	@Test
	public void testDivision() {
		Rechner rechner = new Rechner();
		double a = 2.0;
		double x = 5.0;
		double EPSILON = 10e-5;

		assertEquals(rechner.berechne(Operation.DIVISION, a, x), 0.4, EPSILON);

	}

	/**
	 * Diese Testmethode testet eine Rechnung aus Division durch 0 und erwartet
	 * eine Exception.
	 */

	@Test(expected = IllegalArgumentException.class)
	public void testDivisionDurchNull() {
		Rechner rechner = new Rechner();
		double a = 2.0;
		double x = 0;

		rechner.berechne(Operation.DIVISION, a, x);

	}

	/**
	 * Diese Testmethode testet eine Rechnung aus Multiplikation.
	 */

	@Test
	public void testMultiplikation() {
		Rechner rechner = new Rechner();
		double a = 2.0;
		double x = 5.0;
		double EPSILON = 10e-5;

		assertEquals(rechner.berechne(Operation.MULTIPLIKATION, a, x), 10.0,
				EPSILON);

	}

	/**
	 * Diese Testmethode testet eine Rechnung aus Subtraktion.
	 */

	@Test
	public void testSubtraktion() {
		Rechner rechner = new Rechner();
		double a = 2.3;
		double x = 5.4;
		double EPSILON = 10e-5;

		assertEquals(rechner.berechne(Operation.SUBTRAKTION, a, x), -3.1,
				EPSILON);

	}

	/**
	 * Diese Testmethode testet eine Rechnung aus Addition.
	 */

	@Test
	public void testAddition() {
		Rechner rechner = new Rechner();
		double a = 2.0;
		double x = 3.0;
		double EPSILON = 10e-5;

		assertEquals(rechner.berechne(Operation.ADDITION, a, x), 5.0, EPSILON);

	}

	/**
	 * Diese Testmethode testet eine verkettete Rechnung aus Multiplikation und
	 * Addition.
	 */

	@Test
	public void testVerkettet() {
		Rechner rechner = new Rechner();
		double a = 2.0;
		double x = 3.0;
		double b = 4.0;
		double y = a * x + b;
		double EPSILON = 10e-5;

		assertEquals(
				rechner.berechne(Operation.ADDITION,
						rechner.berechne(Operation.MULTIPLIKATION, a, x), b),
				y, EPSILON);
	}

}
