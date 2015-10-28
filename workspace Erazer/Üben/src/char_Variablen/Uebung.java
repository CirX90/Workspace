package char_Variablen;

import java.util.Scanner;

public class Uebung {
	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Bitte Zeichen eingeben.");
	 
	 int index = scanner.nextInt();
	 scanner.close();
	 
	 if (index < 1 || index > 26) {
	 System.out.println("Ungültiger Index!");
	// return;
	 }
	 
	 // explizite Typkonvertierung von char zu int.
	 char zeichen = (char) (index + 96);
	 System.out.println("Zeichen an Stelle " + index + ": " +
	zeichen);
	 
	 // testen der Konvertierung von char zu int. IMPLIZIT!
	 int neu;
	 neu = zeichen;
	 System.out.println(neu);
	 
	 }
	 
}