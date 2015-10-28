package Rekursion;

public class Rekusrion {
	public static void main(String[] args) {
		int y = 5;
		int z = fakultaet(y);
		
		System.out.println(z);

	}

	public static int fakultaet(int x) {
		if (x == 1) {
			return 1;

		} else {
			return fakultaet(x - 1) * x;
		}
	}
}