package grundlagen;

import java.util.Scanner;

public class Playground {
	
	String[] teilStringArray_li;
	String[] teilStringArray_re;
	String[] teilStringArray_mi;

	public String[] getTeilStringArray_li() {
		return teilStringArray_li;
	}

	public void setTeilStringArray_li(String[] teilStringArray_li) {
		this.teilStringArray_li = teilStringArray_li;
	}

	public String[] getTeilStringArray_re() {
		return teilStringArray_re;
	}

	public void setTeilStringArray_re(String[] teilStringArray_re) {
		this.teilStringArray_re = teilStringArray_re;
	}

	public String[] getTeilStringArray_mi() {
		return teilStringArray_mi;
	}

	public void setTeilStringArray_mi(String[] teilStringArray_mi) {
		this.teilStringArray_mi = teilStringArray_mi;
	}

	public boolean isPalindrom(String eingabe) {

		int vorne = 0;
		int laenge = eingabe.length();
		int abzug = 1;
		int hinten = eingabe.length();

		while (vorne < laenge) {

			if (eingabe.charAt(vorne) == eingabe.charAt(hinten - abzug)) {

				vorne++;
				abzug++;

			}

			else if (eingabe.charAt(vorne) != eingabe.charAt(hinten - abzug)) {

				vorne++;
				abzug++;

				return false;

			}

		}

		return true;

	}

	/**
	 * String substring(int start) liefert einen String, der alle Zeichen des
	 * Strings, für den die Methode aufgerufen wurde, ab der Position start
	 * enthält.
	 * 
	 * String substring(int start, int end) liefert einen String, der alle
	 * Zeichen ab der Position start bis end - 1 enthält. Die Länge ist also end
	 * - start.
	 * 
	 * String trim() schneidet alle zusammenhängenden Leer- und Steuerzeichen
	 * (das sind die Zeichen kleiner oder gleich '\u0020') am Anfang und Ende
	 * der Zeichenkette ab.
	 */

	public void testStrings(String eingabe) {

		int vorne = 0;
		int laenge = eingabe.length();
		int hinten = eingabe.length();
		int arrayIndex = 0;
		String teilString;
		String[] teilStringArray_mi = new String[eingabe.length() - 1];

		while (laenge >= 3) {

			teilString = eingabe.substring(vorne, hinten);
			laenge -= 2;
			hinten--;
			vorne++;

			// Teilstring komplett Palindrom?
			if (isPalindrom(teilString) == true) {

				teilStringArray_mi[arrayIndex] = teilString;
				arrayIndex++;

			}

		}

		// returned alle Teilstrings die ein Palindrom sind
		setTeilStringArray_mi(teilStringArray_mi);

	}

	public String check(String eingabe, String eingabe2) {

		int vorne = 0;
		int laenge = eingabe.length();
		int abzug = 1;
		int hinten = eingabe.length();

		char[] buchstabeArray = new char[eingabe.length()];
		String pali = "";

		// Charindex des Wortes beginnt bei 0, aber Länge startet mit 1
		while (vorne < laenge) {

			if (eingabe.charAt(vorne) == eingabe.charAt(hinten - abzug)) {

				buchstabeArray[vorne] = eingabe.charAt(vorne);

				vorne++;
				abzug++;

			}

			else if (eingabe.charAt(vorne) != eingabe.charAt(hinten - abzug)) {

				abzug++;
				laenge--;

			}

		}

		for (int j = 0; j < buchstabeArray.length; j++) {

			// String Palindrom wird gebildet mit dem Inhalt der Arrays
			pali += buchstabeArray[j];

		}

		return pali;
	}

	public String verarbeite(String teilStringArray[]) {

		int i = 0;
		String laengstesPali = "";
		String pali1;
		String pali2;

		while (i <= teilStringArray.length) {
			
			if (teilStringArray[i+1] == null) {
				
				laengstesPali = teilStringArray[0];
				 break;
			}

			//if (teilStringArray[i+1] != null && teilStringArray[i] != null) {
			else {
				
					pali1 = teilStringArray[i];
					pali2 = teilStringArray[i + 1];
					i++;

				// Solange der String nicht den Inhalt null hat
				//if (pali2 != null) {

				if (pali1.length() > pali2.length()) {
					laengstesPali = pali1;

				}

				else if (pali1.length() < pali2.length()) {
					laengstesPali = pali2;

				}

			}

		}

		
		return laengstesPali;

	}

	public void ausgabe(String laengstesPali) {
		System.out.println(laengstesPali);
	}

	public static void main(String[] args) {

		Playground palindrom = new Playground();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Wort für Palindromprüfung eingeben.");
		String eingabe = scanner.nextLine();
		eingabe = eingabe.toLowerCase().replace(" ", "");
		scanner.close();

		palindrom.testStrings(eingabe);
		// palindrom.ausgabe(palindrom.verarbeite(palindrom.testStrings(eingabe)));

	}

}