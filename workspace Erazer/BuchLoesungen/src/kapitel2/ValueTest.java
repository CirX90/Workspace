package kapitel2;

public class ValueTest {
	public static void main(String[] args) {
		int a = 1, b = 7;
		System.out.println("a) Ausdruck: " + --a + "\ta: " + a + "\tb: " + b);

		a = 1;
		b = 7;
		System.out.println("b) Ausdruck: " + a-- + "\ta: " + a + "\tb: " + b);

		a = 1;
		b = 7;
		System.out.println("c) Ausdruck: " + (a++ + b) + "\ta: " + a + "\tb: "
				+ b);

		a = 1;
		b = 7;
		System.out.println("d) Ausdruck: " + (b = ++a) + "\ta: " + a + "\tb: "
				+ b);

		a = 1;
		b = 7;
		System.out.println("e) Ausdruck: " + (a = b++) + "\ta: " + a + "\tb: "
				+ b);

		a = 1;
		b = 7;
		System.out.println("f) Ausdruck: " + (-(a--) - -(--b)) + "\ta: " + a
				+ "\tb: " + b);

		a = 1;
		b = 7;
		System.out.println("g) Ausdruck: " + (a++ + ++a + a++) + "\ta: " + a
				+ "\tb: " + b);
				
	}
}
