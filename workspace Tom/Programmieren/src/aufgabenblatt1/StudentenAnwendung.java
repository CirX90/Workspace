package aufgabenblatt1;

public class StudentenAnwendung {
	
	public static void main(String[] args) {
		
		System.out.println("---");
	    Student student = new Student();
	    student.eintragHinzufuegen(666666, "Scholl", "Mehmet");
	    student.eintragHinzufuegen(777777, "H��ler", "Ikke");
	    student.eintragHinzufuegen(111111, "Zidane", "Zizu");
	    student.eintragHinzufuegen(222222, "Lahm", "Philipp");
	    student.eintragHinzufuegen(555555, "Arnold", "Maximilian");
	    
	    System.out.println(student);
//	    student.vornameSortieren();
	    student.sortieren();
	    System.out.println("Sortiert:");
	    System.out.println(student);
	}

}