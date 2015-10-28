package objektorientiert;

public class Student_b {
	
	int alter;
	String name;
	String vorname;
	Adresse_b adresse;
	
	// Konstruktor nutzen um Codeschreiberei zu minimieren
	
	public Student_b(int alter, String name, String vorname, String ort, String strasse,
					 String hausnummer, String plz) {
		
		this.alter = alter;
		this.name = name;
		this.vorname = vorname;
		this.adresse = new Adresse_b (ort, strasse, hausnummer, plz);
		
		System.out.println("Es wurde ein Student erstellt!");
	} 
	
	public Student_b(int alter, String name, String vorname) {

		this.alter = alter;
		this.name = name;
		this.vorname = vorname;

		System.out.println("Es wurde ein Student erstellt!");
	}
		
}