package statische_methoden;

import javax.swing.*;

public class Erste {
	
	
	public static void zaehleBisZehn() {
		String ausgabe = "";
		
		for(int i = 1; i <= 10; i++) {
			if (i < 10) {
				ausgabe += i + ", ";
			} else {
				ausgabe += i;
			}
		}
		
		JOptionPane.showMessageDialog(null, ausgabe);
	}
	
	
	public static void main(String[] args) {
		zaehleBisZehn();
		
	}

}