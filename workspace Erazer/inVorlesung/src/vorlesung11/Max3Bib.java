package vorlesung11;

import java.util.Scanner;

public class Max3Bib {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zahl1");
		int zahl1 = scanner.nextInt();
		System.out.println("Zahl2");
		int zahl2 = scanner.nextInt();
		System.out.println("Zahl3");
		int zahl3 = scanner.nextInt();
		System.out.println("Zahl4");
		int zahl4 = scanner.nextInt();
		scanner.close();
		
		int zahl = Math.max(zahl1, Math.max(zahl2, Math.max(zahl3, zahl4)));
		
		System.out.println("Größte Zahl: " + zahl);
	}
}
