package aufgabenblatt1;

import java.util.*;

public class Student implements Comparable<Student> {
	
	/**
	 * Vorname des Studenten.
	 */

	public String vorname = "";
	
	/**
	 * Nachname des Studenten.
	 */
	
	public String nachname = "";
	
	/**
	 * Matrikelnummer des Studenten.
	 */
	
	public String matrikelnummer = "";
	
	/**
	 * Liste mit Pr�fungsleistungen.
	 */
	
	private List<Pruefungsleistung> leistung = new LinkedList<Pruefungsleistung>();
	
	/**
	 * Konstruktor.
	 * @param vorname
	 * @param nachname
	 * @param matrikelnummer
	 */
	
	public Student(String vorname, String nachname, String matrikelnummer) {
		this.nachname = nachname;
		this.vorname = vorname;
		this.matrikelnummer = matrikelnummer;
		
	}
	
	/**
	 * Getter
	 * @return matrikelnummer
	 */
	
	public String getMatrikelnummer() {
		return matrikelnummer;
	}
		
	/**
	 *  Methode zum Vergleichen von Matrikelnummern.
	 */

	@Override
	public int compareTo(Student andereNummer) {
		return getMatrikelnummer().compareTo(andereNummer.getMatrikelnummer());
	}
	
}