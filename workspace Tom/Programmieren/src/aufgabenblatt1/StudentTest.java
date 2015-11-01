package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testeSortierungMatrikelnummer() {
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
	
	@Test
	public void testeSortierungMatrikelnummer2() {
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
}