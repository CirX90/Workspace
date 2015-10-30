package vorlesung5;

import java.util.Scanner;

public class Stopper extends Thread {
	
	int i = 0;
	
	//public String eingabe = "";
	
	@Override
	public void run() {
		
		while(!isInterrupted()) {
			i += 1e-5;
			
		}
		System.err.format("Zählerstand: %.2f", i);
		
	}

	public static void main(String[] args) {
		System.err.format("Bitte Zeichen eingeben und Enter drücken.");
		Scanner scanner = new Scanner(System.in);
		Stopper stopper = new Stopper();
		stopper.start();
		String eingabe = scanner.nextLine();
		stopper.interrupt();
		scanner.close();	

	}

}