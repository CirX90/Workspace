package aufgabenblatt3_3;

import java.util.Scanner;

public class Prim {

	public static void main(String[] args) {

		// Scanner wird eingefügt und durch die Eingabe des Anwenders wird
		// bestimmt von welcher Zahl n die Primfaktoren bestimmt werden sollen.
		Scanner scan = new Scanner(System.in);
		System.out.print("Geben Sie eine positive natürliche Zahl ein: ");
		int prim = scan.nextInt();
		scan.close();

		// Augabe des Ergebnis auf der Konsole.
		System.out.print("Die Primfaktoren von " + prim + " sind: ");

		// Primfaktoren werden bestimmt und einzeln auf der Konsole ausgegeben.
		for (int teiler = 2; teiler <= prim; teiler++) {
			if (prim % teiler == 0) {
				System.out.print(teiler + " ");
				prim /= teiler;
				teiler = 1;
			}
		}
	}
}

// Bsp. 2: teiler = 2; teiler(2) <= prim(2); 
// falls Rest von prim(2) / teiler(2) = 0 = true
// print teiler 2
// prim = 1
// teiler = 1
// teiler(1)+1
//von vorne teiler = 2; teiler <= prim(1) !!! FALSE