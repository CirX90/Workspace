package drauflos;

public class Lotto {

	public static void main(String[] args) {

			int zahl;
			
			System.out.print("Die 6 Lottzahlen aus 49 lauten wie folgt: ");
			
			for (int anzahl = 1; anzahl <= 6; anzahl++) {
				zahl = (int) (Math.random() * 49 +1);
				System.out.print(zahl + " ");
			}
			
	}
	
}