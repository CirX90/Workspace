package objektorientiert;

public class StudentenTest_b {
	public static void main(String[] args) {
		
		// Deutlich verk�rzte Form, gerade bei noch mehr Beispielen
		Student_b student1 = new Student_b(24, "Hertel", "Tom-Henrik", "Hamburg", "Berner Heerweg", "136A", "22159" );
		
		Student_b student2 = new Student_b(21, "Mustermann", "Max", "Rostock", "Bertolt-Brecht-Stra�e", "17", "18106");
		
		System.out.println(student1.vorname + " " + student1.name + "(" + student1.alter + ")");
		System.out.println(student2.vorname + " " + student2.name + "(" + student2.alter + ")");
		System.out.println(student1.adresse.strasse);
	}
	
}