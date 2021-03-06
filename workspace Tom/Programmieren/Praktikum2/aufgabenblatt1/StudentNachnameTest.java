package aufgabenblatt1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentNachnameTest {

	/**
	 * Testmethode zum Überprüfen der Sortierung nach Nachname.
	 */

	@Test
	public void testeSortierungNachname1() {
		Student student = new Student();
		student.eintragHinzufuegen(111111, "Zidane", "Zizu");
		student.eintragHinzufuegen(222222, "Lahm", "Philipp");
		student.eintragHinzufuegen(555555, "Arnold", "Maximilian");
		student.sortierenNachname();

		String sortiert = "/ Matrikelnummer: 555555, Nachname: Arnold, Vorname: Maximilian / "
				+ ", / Matrikelnummer: 222222, Nachname: Lahm, Vorname: Philipp / "
				+ ", / Matrikelnummer: 111111, Nachname: Zidane, Vorname: Zizu / ";

		assertEquals(student.toString(), sortiert);
	}

	/**
	 * Testmethode zum Überprüfen der Sortierung nach Nachname. Da dieser gleich
	 * ist wird weiter nach Vorname sortiert.
	 */

	@Test
	public void testeSortierungNachname2() {
		Student student = new Student();
		student.eintragHinzufuegen(123456, "Beckham", "David");
		student.eintragHinzufuegen(234567, "Beckham", "Brooklyn");
		student.eintragHinzufuegen(567890, "Beckham", "Romeo");
		student.sortierenNachname();

		String sortiert = "/ Matrikelnummer: 234567, Nachname: Beckham, Vorname: Brooklyn / "
				+ ", / Matrikelnummer: 123456, Nachname: Beckham, Vorname: David / "
				+ ", / Matrikelnummer: 567890, Nachname: Beckham, Vorname: Romeo / ";

		assertEquals(student.toString(), sortiert);
	}

	/**
	 * Testmethode zum Überprüfen der Sortierung nach Nachname.
	 */

	@Test
	public void testeSortierungNachname3() {
		Student student = new Student();
		student.eintragHinzufuegen(987763, "Zwanziger", "Theo");
		student.eintragHinzufuegen(985512, "Niersbach", "Wolfgang");
		student.eintragHinzufuegen(985511, "Loew", "Joachim");
		student.sortierenNachname();

		String sortiert = "/ Matrikelnummer: 985511, Nachname: Loew, Vorname: Joachim / "
				+ ", / Matrikelnummer: 985512, Nachname: Niersbach, Vorname: Wolfgang / "
				+ ", / Matrikelnummer: 987763, Nachname: Zwanziger, Vorname: Theo / ";

		assertEquals(student.toString(), sortiert);
	}
}