package objektorientiert;

import javax.swing.*;

public class StudentenVerwaltung {
	
	public static Student_b erfasseStudent () {

		//Daten einlesen und speichern
		int alter = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie Ihr Alter ein:"));
		
		String name = JOptionPane.showInputDialog("Bitte geben Sie den Nachnamen ein");
		String vorname = JOptionPane.showInputDialog("Bitte geben Sie den Vornamen ein");
		
		//Student erzeugen und zurückgeben
		return new Student_b(alter, name, vorname);
		
	}
	
	public static Student_b[] erfasseStudenten(int n) {
		
		Student_b[] studenten = new Student_b[n];
		
		// Die einzelnen Studenten per Eingabedialog erassen und in dem Array speichern
		for(int i = 0; i < studenten.length; i++) {
			studenten[i] = erfasseStudent();
		}
		
		return studenten;
	}
	
	public static String toString(Student_b student) {
		String text = "Alter: " + student.alter + "\n" + "Name: " + student.name + "\n"
					+ "Vorname: " + student.vorname;
		return text;
	}
	
	public static void main (String[] args) {
		// Anzahl Studenten, die erfasst werden sollen, festlegen
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Wie viele Studenten möchten Sie erfassen?"));

		// Studenten erfassen
	Student_b[] studenten = erfasseStudenten(anzahl);
	
	// Studenten ausgeben
	for(int i = 0; i < studenten.length; i++) {
		System.out.println(toString(studenten[i]) + "\n");
		
		}
	
	}
	
}