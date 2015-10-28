package Klassen;

public class Autohaendler {
	
	public static void main(String[] args) {
		
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto2.setBreite(1);
		auto1.farbe = "Schwarz";
		
		System.out.println(auto2.getBreite());
		System.out.println("Das erste Auto hat die Farbe " + auto1.farbe + ".");
		
	}

}