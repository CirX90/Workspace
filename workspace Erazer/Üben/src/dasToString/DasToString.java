package dasToString;

public class DasToString {

	public final String name = "Harald";
	public final int alter = 53;
	public double gewicht = 93.6;

	public String toString() {
		return String.format("Name: %s, Alter: %s, Gewicht: %s", name, alter
				+ " Jahre", gewicht + "kg");
	}

	public static void main(String[] args) {
		DasToString test = new DasToString();
		System.out.println(test.toString());

	}

}
