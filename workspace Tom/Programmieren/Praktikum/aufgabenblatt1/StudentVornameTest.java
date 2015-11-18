package aufgabenblatt1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentVornameTest {

	/**
	 * Testmethode zum Überprüfen der Sortierung nach Vorname.
	 */

	@Test
	public void testeSortierungVorname1() {
		Student student = new Student();
		student.eintragHinzufuegen(111111, "Zidane", "Zizu");
		student.eintragHinzufuegen(222222, "Lahm", "Philipp");
		student.eintragHinzufuegen(555555, "Arnold", "Maximilian");
		student.sortierenVorname();

		String sortiert = "/ Matrikelnummer: 555555, Nachname: Arnold, Vorname: Maximilian / "
				+ ", / Matrikelnummer: 222222, Nachname: Lahm, Vorname: Philipp / "
				+ ", / Matrikelnummer: 111111, Nachname: Zidane, Vorname: Zizu / ";

		assertEquals(student.toString(), sortiert);
	}

	/**
	 * Testmethode zum Überprüfen der Sortierung nach Vorname. Da dieser gleich
	 * ist wird weiter nach Nachname sortiert.
	 */

	@Test
	public void testeSortierungVorname2() {
		Student student = new Student();
		student.eintragHinzufuegen(123456, "Alaba", "David");
		student.eintragHinzufuegen(234567, "Beckham", "David");
		student.eintragHinzufuegen(567890, "Odonkor", "David");
		student.sortierenVorname();

		String sortiert = "/ Matrikelnummer: 123456, Nachname: Alaba, Vorname: David / "
				+ ", / Matrikelnummer: 234567, Nachname: Beckham, Vorname: David / "
				+ ", / Matrikelnummer: 567890, Nachname: Odonkor, Vorname: David / ";

		assertEquals(student.toString(), sortiert);
	}

	/**
	 * Testmethode zum Überprüfen der Sortierung nach Vorname.
	 */

	@Test
	public void testeSortierungVorname3() {
		Student student = new Student();
		student.eintragHinzufuegen(987763, "Zwanziger", "Theo");
		student.eintragHinzufuegen(985512, "Niersbach", "Wolfgang");
		student.eintragHinzufuegen(985511, "Loew", "Joachim");
		student.sortierenVorname();

		String sortiert = "/ Matrikelnummer: 985511, Nachname: Loew, Vorname: Joachim / "
				+ ", / Matrikelnummer: 987763, Nachname: Zwanziger, Vorname: Theo / "
				+ ", / Matrikelnummer: 985512, Nachname: Niersbach, Vorname: Wolfgang / ";

		assertEquals(student.toString(), sortiert);
	}
}