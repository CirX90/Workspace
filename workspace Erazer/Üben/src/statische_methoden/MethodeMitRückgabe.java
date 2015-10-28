package statische_methoden;

import javax.swing.JOptionPane;

import javax.swing.*;

public class MethodeMitRückgabe {

	public static double berechneArithmetischesMittel(double... zahlen) {
		
		double summe = 0.0;
		
		for(double zahl : zahlen) {
			summe += zahl;
		}
		
		return summe / zahlen.length;
	}
	
	public static void main(String[] args) {
		double[] kommazahlen =  {1.3, 5, 8.9, 0.5, 100.8};
		
		double mittelwert = berechneArithmetischesMittel(kommazahlen);
		
		System.out.println(mittelwert);
	
	}
}