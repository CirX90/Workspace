package alteKlausurAuswerten;

public class Hund extends Tier{
	
	public Hund() {
		super("Hund");
	}
	
	@Override
	public void macheLaut() {
		super.macheLaut();
		System.out.println("Wuff, Wuff!");
	}

}