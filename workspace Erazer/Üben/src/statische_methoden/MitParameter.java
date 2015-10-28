package statische_methoden;

import javax.swing.*;

public class MitParameter {
	
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
		zaehle(1, 10);
		zaehle(-5, 6);

	}

}