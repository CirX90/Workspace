package vorlesung5;

import java.util.Scanner;

public class ParalleleEingabErb extends Thread {

	Scanner scanner = new Scanner(System.in);
	public String ausgabe = "";

	@Override
	public void run() {

		ausgabe = scanner.nextLine();

		System.err.println(ausgabe);

		scanner.close();

	}

	public static void main(String[] args) {
		ParalleleEingabErb parallel = new ParalleleEingabErb();
		parallel.start();

	}

}