package kapitel2;

public class Verzinsung {
	public static void main(String[] args) {
		
		double kapital = 5000., zinsen = 7.5;

		kapital += kapital * zinsen / 100.;
		System.out.println("Guthaben nach einem Jahr: " + kapital);
	}
}
