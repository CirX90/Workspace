package dasRatespiel;

public class Spieler {
	
	public int raten() {
		int zufallsZahlSpieler = (int) (Math.random() * 6);
		return zufallsZahlSpieler;
	}

}
