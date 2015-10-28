package drauflos;

import java.util.*;

public class Bmi {
	public static void main(String[] args) {
		
		double gewicht;
		double groesse;
		double bmi;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihr Gewicht in kg an.");
		gewicht = scanner.nextDouble();
		System.out.println("Bitte geben Sie Ihre Größe in m an.");
		groesse = scanner.nextDouble();
		scanner.close();
		
		bmi = gewicht / (groesse * groesse);
		
		if (bmi < 18.5) {
			System.out.println("Ihr Body-Mass-Index lautet: " + (int)bmi + ". Damit sind Sie untergewichtig!");
		}
		
		else if (bmi <= 25 && bmi >= 18.5) {
			System.out.println("Ihr Body-Mass-Index lautet: " + (int)bmi + ". Damit sind Sie normalgewichtig!");	
		}
		
		else {
			System.out.println("Ihr Body-Mass-Index lautet: " + (int)bmi + ". Damit sind Sie übergewichtig!");
		}
		
	}

}