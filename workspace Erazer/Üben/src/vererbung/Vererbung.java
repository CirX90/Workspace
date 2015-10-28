package vererbung;

public class Vererbung extends Superklasse implements Interface {

	private final int a = super.getA();
	private final int b = 8;

	// public int getA() {
	// return super.getA();
	// }

	@Override
	public int getB() {
		return b;
	}

	public static void main(String[] args) {
		Vererbung erb = new Vererbung();
		System.out.println(erb.a);
		System.out.println(erb.b);

	}

}