package Klassen;

public class Tutorial {

	public static void main(String[] args) {

		// Werte den VAriablen aus dem Konstruktor beifügen
		Haus haus1 = new Haus(20, 3, 35, "Gelb");
		Haus haus2 = new Haus(25, 4, 40, "Orange");

		// Ausgabe
		System.out.println("Haus 1 ist " + haus1.farbe + " und hat ein"
				+ " Volumen von: " + haus1.breite * haus1.hoehe * haus1.tiefe
				+ "m²");
		
		System.out.println("Haus 2 ist " + haus2.farbe + " und hat ein"
				+ " Volumen von: " + haus2.breite * haus2.hoehe * haus2.tiefe
				+ "m²");
	}

}