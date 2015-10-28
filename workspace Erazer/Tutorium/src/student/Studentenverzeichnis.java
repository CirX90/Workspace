package student;

public class Studentenverzeichnis {

	public String info(Student student) {
		String text = ("Name: " + student.name + ", " + student.vorname + ".\n"
				+ "Matrikelnummer: " + student.matrikelnummer + ".\n"
				+ "Wohnhaft in: " + student.adresse.strasse + " "
				+ student.adresse.hausnummer + ", "
				+ student.adresse.postleitzahl + " " + student.adresse.ort + ".");
		return text;
	}

	public static void main(String[] args) {

		Student student1 = new Student(1337, "Hertel", "Tom-Henrik", "Hamburg",
				"Berner Heerweg", "136A", 22159);

		Studentenverzeichnis neu = new Studentenverzeichnis();
		System.out.println(neu.info(student1));

	}

}