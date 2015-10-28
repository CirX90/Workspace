package kapitel2;

public class Bits {
	public static void main(String[] args) {
		int zahl = 4711;

		for (int i = 31; i >= 0; --i) {
			if ((zahl & (1 << i)) != 0)
				System.out.print('1');
			else
				System.out.print('0');
			if (i % 8 == 0)
				System.out.print(' ');
		}

		System.out.println();
	}
}