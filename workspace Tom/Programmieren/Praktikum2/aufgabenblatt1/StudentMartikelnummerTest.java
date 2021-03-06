package aufgabenblatt1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentMartikelnummerTest {
	
	/**
	 * Testmethode zum Überprüfen der Sortierung nach Matrikelnummer.
	 */

	@Test
	public void testeSortierungMatrikelnummer1() {
		Student student = new Student();
	    student.eintragHinzufuegen(111111, "Zidane", "Zizu");
	    student.eintragHinzufuegen(222222, "Lahm", "Philipp");
	    student.eintragHinzufuegen(555555, "Arnold", "Maximilian");
	    student.sortierenMatrikelnummer();
	    
	    String sortiert = "/ Matrikelnummer: 111111, Nachname: Zidane, Vorname: Zizu / "
	    		+ ", / Matrikelnummer: 222222, Nachname: Lahm, Vorname: Philipp / "
	    		+ ", / Matrikelnummer: 555555, Nachname: Arnold, Vorname: Maximilian / ";
	    
	    assertEquals(student.toString(), sortiert);
	}
	
	/**
	 * Testmethode zum Überprüfen der Sortierung nach Matrikelnummer.
	 */
	
	@Test
	public void testeSortierungMatrikelnummer2() {
		Student student = new Student();
	    student.eintragHinzufuegen(123456, "Zidane", "Zizu");
	    student.eintragHinzufuegen(234567, "Lahm", "Philipp");
	    student.eintragHinzufuegen(567890, "Arnold", "Maximilian");
	    student.sortierenMatrikelnummer();
	    
	    String sortiert = "/ Matrikelnummer: 123456, Nachname: Zidane, Vorname: Zizu / "
	    		+ ", / Matrikelnummer: 234567, Nachname: Lahm, Vorname: Philipp / "
	    		+ ", / Matrikelnummer: 567890, Nachname: Arnold, Vorname: Maximilian / ";
	    
	    assertEquals(student.toString(), sortiert);
	}
	
	/**
	 * Testmethode zum Überprüfen der Sortierung nach Matrikelnummer.
	 */
	
	@Test
	public void testeSortierungMatrikelnummer3() {
		Student student = new Student();
	    student.eintragHinzufuegen(987763, "Zidane", "Zizu");
	    student.eintragHinzufuegen(985512, "Lahm", "Philipp");
	    student.eintragHinzufuegen(985511, "Arnold", "Maximilian");
	    student.sortierenMatrikelnummer();
	    
	    String sortiert = "/ Matrikelnummer: 985511, Nachname: Arnold, Vorname: Maximilian / "
	    		+ ", / Matrikelnummer: 985512, Nachname: Lahm, Vorname: Philipp / "
	    		+ ", / Matrikelnummer: 987763, Nachname: Zidane, Vorname: Zizu / ";
	    
	    assertEquals(student.toString(), sortiert);
	}
}