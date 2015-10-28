/**
 * Praktikum TI-PM2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 4
 * Verwendete Quellen: Wikipedia (Begriff: Fibonacci), Vorlesungsfolien
 */

package aufgabenblatt2_4;

import java.util.Scanner;

public class Fibonacci_Zahlen {

	public static void main(String[] args) {

		int fibonacciZahl0 = 0;
		int fibonacciZahl1 = 1;
		int ergebnis = 1;
		int rechenfaktor = 1;

		Scanner scanner = new Scanner(System.in);
		System.out
				.print("Bitte geben Sie eine gesuchte Stelle der Fibonaccizahlenfolge ein: ");
		int gesuchteStelle = scanner.nextInt();
		scanner.close();

		// Erhöhung von i um 1 solange bis die Bedingung erfüllt ist
		while (rechenfaktor < gesuchteStelle) {
			ergebnis = fibonacciZahl1 + fibonacciZahl0;
			fibonacciZahl0 = fibonacciZahl1;
			fibonacciZahl1 = ergebnis;
			rechenfaktor++;
		}
		System.out.println("Die " + gesuchteStelle
				+ ". Zahl der Fibonaccizahlenfolge lautet: " + ergebnis);
	}
}