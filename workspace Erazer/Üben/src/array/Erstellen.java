package array;

import java.util.*;

public class Erstellen {
	public static void main(String [] args) {
		
		//Arry erstellen + Platz für 3 verschiedene Elemente
		String [] namenArray = new String[3];
		
		//Strings in dem Array abspeichern
		namenArray[0] = "Peter";
		namenArray[1] = "Hans";
		namenArray[2] = "Klaus";
		
		//Ausgabe
		System.out.println(Arrays.toString(namenArray));
		
	}
}