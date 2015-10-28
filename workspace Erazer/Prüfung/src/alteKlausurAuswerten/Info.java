package alteKlausurAuswerten;

public class Info {

	static Schildkroete schildi = new Schildkroete();

	public void status(Schildkroete schildi) {
		System.out.println(schildi.getMaxAlter());
		System.out.println(schildi.getName());
	}

	@Override
	public String toString() {
		return String.format("Tierart: %s, Name: %s, Alter: %s",
				schildi.getRasse(), schildi.getName(), schildi.getMaxAlter())
				+ " Jahre";
	}

	public static void main(String[] args) {
		Info info = new Info();
		info.status(schildi);

		System.out.println(info.toString());
	}

}