package eachArray;

import java.util.Scanner;

public class Lebewesen {
	public static void main(String[] args) {

		Lebewesen[] l = new Lebewesen[10];
		// Scanner scanner = new Scanner(System.in);
		// String eingabe = "";
		// for (int i = 0; i < l.length; i++) {
		// System.out
		// .println("Welches Lebewesen soll erschaffen werden? mensch/hund.");
		// eingabe = scanner.nextLine();
		// if (eingabe.equals("mensch")) {
		// l[i] = new Mensch();
		// } else if (eingabe.equals("hund")) {
		// l[i] = new Hund();
		// }
		// }
		// scanner.close();

		for (int i = 0; i < l.length; i++) {
			int zahl = (int) (Math.random() * 2);
			System.out.println(zahl);
			if (zahl == 0) {
				l[i] = new Mensch();
			} else if (zahl == 1) {
				l[i] = new Hund();
			}

		}

		for (int j = 0; j < l.length; j++) {
			if (l[j] instanceof Mensch) {
				System.out.println("An Stelle " + j + " Mensch");
			} else if (l[j] instanceof Hund) {
				System.out.println("An Stelle " + j + " Hund");
			}
		}
	}
}