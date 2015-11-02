package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testeSortierungMatrikelnummer() {

		Student eintrag1 = new Student();
		eintrag1.eintragHinzufuegen(333333,"Kie�ling","Stefan");
		eintrag1.eintragHinzufuegen(111111,"Lahm","Philipp");
		eintrag1.eintragHinzufuegen(222222,"Zizu","Zidane");
		eintrag1.sortierenMatrikelnummer();

		final String sortiert = "Philipp Lahm 111111 |,Zidane Zizu 222222 |,Stefan Kie�ling 333333 |";

		assertEquals(eintrag1.toString(), sortiert);

	}

	@Test
	public void testeSortierungMatrikelnummer2() {
		Student eintrag2 = new Student();
		eintrag2.eintragHinzufuegen(2345123, "Stefan", "Kie�ling");
		eintrag2.eintragHinzufuegen(1231443, "Philipp", "Lahm");
		eintrag2.eintragHinzufuegen(8576677, "Zidane", "Zizu");
		eintrag2.sortierenMatrikelnummer();

		final String sortiert = "Lahm Philipp 1231443 |,Kie�ling Stefan 2345123 |,Zizu Zidane 8576677 |";

		assertEquals(eintrag2.toString(), sortiert);

	}

	@Test
	public void testeSortierungMatrikelnummer3() {
		Student eintrag3 = new Student();
		eintrag3.eintragHinzufuegen(11234, "Stefan", "Kie�ling");
		eintrag3.eintragHinzufuegen(111234, "Philipp", "Lahm");
		eintrag3.eintragHinzufuegen(1234, "Zidane", "Zizu");
		eintrag3.sortierenMatrikelnummer();

		final String sortiert = "Zizu Zidane 1234 |,Kie�ling Stefan 11234 |,Lahm Philipp 111234 |";

		assertEquals(eintrag3.toString(), sortiert);

	}
}