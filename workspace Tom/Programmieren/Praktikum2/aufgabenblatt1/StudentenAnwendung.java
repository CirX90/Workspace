package aufgabenblatt1;

/**
 * Klasse zur Steuerung der Anwendung.
 *
 */

public class StudentenAnwendung {
	
	/**
	 * Eintraege hinzugefuegt, mit Methoden sortiert und ausgegeben.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
	    Student student = new Student();
	    student.eintragHinzufuegen(222222, "Lahm", "Philipp");
	    student.eintragHinzufuegen(111111, "Zidane", "Zizu");
	    student.eintragHinzufuegen(555555, "Kie�ling", "Stefan");
	    
	    System.out.println("--------------------------------------------");
	    System.out.println(student);
	    System.out.println("--------------------------------------------");
	    student.sortierenMatrikelnummer();
	    System.out.println("Sortiert nach Matrikelnummer:");
	    System.out.println(student);
	    
	    System.out.println("--------------------------------------------");
	    student.sortierenNachname();
	    System.out.println("Sortiert nach Nachname:");
	    System.out.println(student);
	    
	    System.out.println("--------------------------------------------");
	    student.sortierenVorname();
	    System.out.println("Sortiert nach Vorname:");
	    System.out.println(student);
	}

}