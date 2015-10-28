package Equals;

public class equals {
	public static void main(String[] args) {
		Mensch m1 = new Mensch(70, "Karl");
		Mensch m2 = new Mensch(70, "Karl");
		
		System.out.println(m1.equals(m2));
		System.out.println(m1 == m2);
	}

}
