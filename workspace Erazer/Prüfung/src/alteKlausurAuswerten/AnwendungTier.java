package alteKlausurAuswerten;

public class AnwendungTier {
	public static void main(String[] args) {
		
		Tier hund = new Hund();
		hund.macheLaut();
		System.out.println();
		Tier katze = new Katze();
		katze.macheLaut();
	}

}