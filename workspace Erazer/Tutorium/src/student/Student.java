package student;

public class Student {

	int matrikelnummer;
	String name;
	String vorname;
	Adresse adresse;

	public Student(int matrikelnummer, String name, String vorname, String ort,
			String strasse, String hausnummer, int postleitzahl) {
		
		System.out.println("Neuer Student erstellt.");
		
		this.matrikelnummer = matrikelnummer;
		this.name = name;
		this.vorname = vorname;
		this.adresse = new Adresse(ort, strasse, hausnummer, postleitzahl);

	}

}