package grundlagen;

import java.time.LocalTime;     // import aktuelle Zeit

public class Zeitausgabe {
	
	public static int aufrufZaehler = 0;
	
	public static void gibAus() {
		aufrufZaehler++;
		LocalTime zeit = LocalTime.now();
		
		System.out.println(aufrufZaehler + ": " + zeit);	
	}
		public static void main(String [] args) {
	
	Zeitausgabe.gibAus();
	Zeitausgabe.gibAus();
	Zeitausgabe.gibAus();
	
	}
}