package grundlagen;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Zahl 1 eingeben.");
		int zahl1 = scanner.nextInt();
		System.out.println("Zahl 2 eingeben.");
		int zahl2 = scanner.nextInt();
		System.out.println("Zahl 3 eingeben.");
		int zahl3 = scanner.nextInt();
		scanner.close();

		int groessteZahl = zahl1;
		if (zahl2 > groessteZahl) {
			groessteZahl = zahl2;
		}
		if (zahl3 > groessteZahl) {
			groessteZahl = zahl3;
		}

		System.out.println("Die gr��te Zahl von " + zahl1 + " und " + zahl2
				+ " und " + zahl3 + " ist die " + groessteZahl);
	}
}