package aufgabenblatt3_1;

public class Ausdruecke {
	public static void main(String[] args) {

		double radius = 1.6;
		double umfang = 2 * Math.PI * radius;
		double seitenl�nge = 0.25;
		double fl�cheninhalt = seitenl�nge * seitenl�nge;				
		boolean vergleich = umfang > 1.5 && fl�cheninhalt < 0.5;
		
		System.out
				.println("Umfang des Kreises mit Radius 1,6 ist gr��er als 1,5 und der "
						+ "Fl�cheninhalt des Quadrats, mit Seitenl�nge 0,4, "
						+ "ist kleiner als 0,5 ist "
						+ vergleich + ".");
	}

}