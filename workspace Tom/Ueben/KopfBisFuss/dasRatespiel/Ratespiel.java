package dasRatespiel;

public class Ratespiel {

	Spieler s1 = new Spieler();
	Spieler s2 = new Spieler();
	Spieler s3 = new Spieler();

	boolean s1Status = false;
	boolean s2Status = false;
	boolean s3Status = false;

	int zufallsZahlSpiel = (int) (Math.random() * 6);

	public void starteSpiel() {

		while (s1Status == false && s2Status == false && s3Status == false) {

			if (zufallsZahlSpiel == s1.raten()) {
				System.out.println("Spieler 1 hat die Zufallszahl " + zufallsZahlSpiel + " richtig erraten!");
				s1Status = true;

			}

			if (zufallsZahlSpiel == s2.raten()) {
				System.out.println("Spieler 2 hat die Zufallszahl " + zufallsZahlSpiel + " richtig erraten!");
				s2Status = true;
			}

			if (zufallsZahlSpiel == s3.raten()) {
				System.out.println("Spieler 3 hat die Zufallszahl " + zufallsZahlSpiel + " richtig erraten!");
				s3Status = true;
			}

			if (s1Status || s2Status || s3Status == false) {

				System.out.println("Kein Spieler hat die Zufallszahl " + zufallsZahlSpiel + " erraten!"
						+ " Die Runde muss wiederholt werden.");

			}

		}

	}

}
