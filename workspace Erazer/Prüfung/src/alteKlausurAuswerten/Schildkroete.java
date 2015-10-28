package alteKlausurAuswerten;

public class Schildkroete implements ILebewesen {
	
	private final int maxAlter = 150;
	
	private final String name = "Schildi";
	
	private final String rasse = "Schildkroete";

	@Override
	public int getMaxAlter() {
		return maxAlter;
	}
	
	public String toString() {
		return String.format ("Name: %s , Max. Alter: %s", name, maxAlter + " Jahre");
	}

	@Override
	public String getName() {
		return name;
	}

	public String getRasse() {
		return rasse;
	}

}