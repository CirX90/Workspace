package kapitel2;

public class Uhrzeit {
	public static void main(String[] args) {

		int uhrzeit = 13;
		long stunden = 648684711;
		long spaeter = (uhrzeit + stunden) % 24;

		System.out.println("Jetzt ist es " + uhrzeit + " Uhr. In " + stunden
				+ " Stunden ist es " + spaeter + " Uhr.");
		
	}

}