package grundlagen;

import java.util.Scanner;

public class veränderte_Ausgabe {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Bitte Zahl zum Vergleich, gerade oder ungerade, angeben.");
	int zahl = scanner.nextInt();
	scanner.close();
	
	System.out.println((zahl%2 == 0)? "gerade" : "ungerade"); // Ausgabe bewerten lassen
	}
}