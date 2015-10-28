package nutzbar;

import java.util.Scanner;

public class Zeitplaner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Minuten eingeben.");
		int zeit = scanner.nextInt();
		scanner.close();
		
		double pt = zeit * 0.4;
		double gt = zeit * 0.2;
		double et = zeit * 0.15;
		double ma = zeit * 0.25;
		double zeittest = et + gt + ma + pt;

		System.out.println("Deine " + (int)zeittest + " Minuten teilen sich in:\n"
				+ (int)pt + " Minuten Programmiertechnik \n"
				+ (int)gt + " Minuten Grundlagen Informatik \n"
				+ (int)et + " Minuten Elektrotechnik \n"
				+ (int)ma + " Minuten Mathematik \n");
		
	}

}