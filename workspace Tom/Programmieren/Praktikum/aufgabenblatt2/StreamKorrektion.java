/**
 * Praktikum TI-PM2, WS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Lenard Lange 	 (lenard.lange@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.2
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamKorrektion {

	public List<String> stringVerarbeiter(String[] stringArray) {

		return Arrays.stream(stringArray).filter(str -> str != null)
				.map(str -> str.trim()).map(str -> str.toUpperCase())
				.map(str -> str.replaceAll("�", "AE"))
				.map(str -> str.replaceAll("�", "OE"))
				.map(str -> str.replaceAll("�", "UE"))
				.map(str -> str.replaceAll("�", "SS"))
				.map(str -> str.length() > 8 ? str.substring(0, 8) : str)
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		StreamKorrektion stream = new StreamKorrektion();
		String[] stringArray = { "Eingabe ", "�u�eres ", null, "Stra�en-Feger",
				" ein Haus" };
		System.out.println(stream.stringVerarbeiter(stringArray));

	}
}