package aufgabenblatt3_1;

public class Ausdruecke {
	public static void main(String[] args) {

		double radius = 1.6;
		double umfang = 2 * Math.PI * radius;
		double seitenlänge = 0.25;
		double flächeninhalt = seitenlänge * seitenlänge;				
		boolean vergleich = umfang > 1.5 && flächeninhalt < 0.5;
		
		System.out
				.println("Umfang des Kreises mit Radius 1,6 ist größer als 1,5 und der "
						+ "Flächeninhalt des Quadrats, mit Seitenlänge 0,4, "
						+ "ist kleiner als 0,5 ist "
						+ vergleich + ".");
	}

}