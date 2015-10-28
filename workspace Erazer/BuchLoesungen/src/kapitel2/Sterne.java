package kapitel2;

public class Sterne {
	public static void main(String[] args) {
		int zeile, spalte;
		
		for (zeile = 1; zeile <= 10; zeile++) {
			for (spalte = 1; spalte <= zeile; spalte++) {
				System.out.print('*');
			}
			
			System.out.println();
		}
	}
}
