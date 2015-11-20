/**
 * Praktikum TI-PM2, WS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Lenard Lange 	 (lenard.lange@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.3
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt2;

public class Rennen extends Thread{
	
	public Rennen() {
		Thread Wagen1 = new Thread(new Rennen());
		Thread Wagen2 = new Thread(new Rennen());
		Thread Wagen3 = new Thread(new Rennen());
	}
	
	
	
	@Override
	public void run() {
		
		for(int i = 0; i <= 10; i++) {
		
		}
		
	}
	
	public static void main(String[] args) {
//		Thread wagen1 = new Thread(new Rennauto());
//		Thread wagen2 = new Thread(new Rennauto());
//		Thread wagen3 = new Thread(new Rennauto());
		
//		Thread wagen1 = new Thread(new Rennen());
//		Thread wagen2 = new Thread(new Rennen());
//		Thread wagen3 = new Thread(new Rennen());
		
//		wagen1.start();
//		wagen2.start();
//		wagen3.start();
		Thread rennen = new Thread(new Rennen());
		rennen.start();
	}

}