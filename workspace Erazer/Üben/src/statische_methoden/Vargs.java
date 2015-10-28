package statische_methoden;

import javax.swing.*;

public class Vargs {
	
	public static void berechneArithmetischesMittel(double... zahlen) {
		
		double summe = 0.0;
		
		for(double zahl : zahlen) {
			summe += zahl;
		}
		
		JOptionPane.showMessageDialog(null, summe / zahlen.length);
	}
	
	public static void zaehle(int von, int bis) {
		String ausgabe = "";
		
		for(int i = von; i <= bis; i++) {
			if (i < bis) {
				ausgabe += i + ", ";
			} else {
				ausgabe += i;
			}
		}
		
		JOptionPane.showMessageDialog(null, ausgabe);
	}
	
	public static void main(String[] args) {
		
		double[] kommazahlen =  {1.3, 5, 8.9, 0.5, 100.8};
		
		berechneArithmetischesMittel(kommazahlen);
		berechneArithmetischesMittel(1, 5, 1.3);
		berechneArithmetischesMittel();

	}

}