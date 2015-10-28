package Klassen;

public class Fussgaenger {
	
	double groesse;
	int alter;
	String geschlecht;
	
	
		// Konstruktor
	public Fussgaenger(double groesse, int alter, String geschlecht) {
		
		this.groesse = groesse;
		this.alter = alter;
		this.geschlecht = geschlecht;
		
	}
	
	public static void main(String[] args) {
		
		// 
		Fussgaenger fuss1 = new Fussgaenger(2, 35, "Männlich");
		Fussgaenger fuss2 = new Fussgaenger(1.65, 42, "Weiblich");
		
		System.out.println(fuss1.groesse);
		System.out.println(fuss2.geschlecht);

		
	}

}
