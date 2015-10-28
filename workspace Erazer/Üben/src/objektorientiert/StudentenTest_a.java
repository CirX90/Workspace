package objektorientiert;

public class StudentenTest_a {
	public static void main(String[] args) {
			
		// lange Codeschreiberei Student1, Student2 ,3 .... -> siehe b
		Student_a student1 = new Student_a();
		student1.alter = 24;
		student1.name = "Hertel";
		student1.vorname = "Tom-Henrik";
		
		Student_a student2 = new Student_a();
		student2.alter = 21;
		student2.name = "Mustermann";
		student2.vorname = "Max";
		
		System.out.println(student1.vorname + " " + student1.name + "(" + student1.alter + ")");
		System.out.println(student2.vorname + " " + student2.name + "(" + student2.alter + ")");
	}
	
}