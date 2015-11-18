package aufgabenblatt2;

import java.util.Scanner;

public class NullEntfernen {

	Scanner scannerArrayGroesse = new Scanner(System.in);
	Scanner scannerStringEingabe = new Scanner(System.in);

	private int anzahl;
	int nullZaehler = 0;
	String[] eingabe;

	String[] nullEntferner;

	public String[] getEingabe() {
		return eingabe;
	}

	public void setEingabe(String[] eingabe) {
		this.eingabe = eingabe;
	}

	public void eingeben() {

		System.out.println("Bitte Anzahl der Strings angeben.");

		anzahl = scannerArrayGroesse.nextInt();
		eingabe = new String[anzahl];

		for (int index = 0; index < eingabe.length; index++) {
			
			System.out.println("Bitte die zu korrigierenden Strings eingeben.");
			
			eingabe[index] = scannerStringEingabe.nextLine();
			
		}
		
		scannerArrayGroesse.close();
		scannerStringEingabe.close();

		setEingabe(eingabe);

		for (int index = 0; index < eingabe.length; index++) {

			if (eingabe[index] == null) {
				nullZaehler++;
			}
		}
	}

	public void entfernen(String[] eingabe) {
		if (eingabe.length != 0) {

			for (int index = 0; index < eingabe.length - 1; index++) {

				if (eingabe[index] == null) {
					for (int j = index; j < eingabe.length - 1; j++) {
						eingabe[j] = eingabe[j + 1];
					}
				}
			}
		}

		if (eingabe[0] == null) {
			entfernen(eingabe);
		}

		nullEntferner = new String[eingabe.length - nullZaehler];

		System.arraycopy(eingabe, 0, nullEntferner, 0,
				eingabe.length - nullZaehler);
		eingabe = nullEntferner;
		setEingabe(eingabe);
	}

	public void ausgeben(String[] eingabe) {
		for (int j = 0; j < eingabe.length; j++) {
			System.out.println(eingabe[j]);

		}
	}

	public static void main(String[] args) {
		NullEntfernen nulle = new NullEntfernen();

		nulle.eingeben();
		nulle.entfernen(nulle.eingabe);
		nulle.ausgeben(nulle.eingabe);

	}

}