package grundlagen;

import java.util.Scanner;

public class If_else {
	public static void main(String [] args) {
		
		int meineZahl = (int) (Math.random() * 10 + 1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ich denke an eine Zahl von 1 bis 10, errate welche es ist!");
		int errateneZahl = scanner.nextInt();
		scanner.close();
		
		if (meineZahl == errateneZahl - 1 || meineZahl == errateneZahl + 1)
				System.out.println("Knapp daneben!");
		else if (meineZahl == errateneZahl)
			System.out.println("Richtig! Sehr gut! :)");
		else
			System.out.println("Weit daneben!");		
	}
}