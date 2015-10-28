package alteKlausurAuswerten;

public abstract class Tier {
	protected String name = "Tier";
	protected int alter;

	public Tier(String name) {
		this.name = name;
		System.out.println(name + " erzeugt.");
	}

	public Tier() {
		System.out.println("Tier erzeugt.");
	}

	public Tier(String name, int alter) {
		this.name = name;
		this.alter = alter;
		System.out.println(name + " wurde erstellt. Er ist " + alter
				+ " Jahr(e) alt.");
	}

	public void macheLaut() {
		System.out.println(name + "-Laut!");
	}

}