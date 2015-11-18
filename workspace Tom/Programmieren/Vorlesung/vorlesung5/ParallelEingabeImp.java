package vorlesung5;

import java.util.Scanner;

public class ParallelEingabeImp implements Runnable {

	Scanner scanner = new Scanner(System.in);
	public String ausgabe = "";

	@Override
	public void run() {
		
		System.err.println("Bitte Eingabe tätigen.");

		ausgabe = scanner.nextLine();

		System.err.println(ausgabe);

		scanner.close();

	}

	public static void main(String[] args) {
		
		ParallelEingabeImp parallel = new ParallelEingabeImp();
		parallel.run();

	}

}