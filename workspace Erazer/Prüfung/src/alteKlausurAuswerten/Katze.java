package alteKlausurAuswerten;

public class Katze extends Tier{
	
	public Katze() {
		this.name = "Katze";
		System.out.println("Niedliche " + name + " erzeugt.");
	}
	
	public void macheLaut() {
		System.out.println("Miau, Miau!");
	}

}