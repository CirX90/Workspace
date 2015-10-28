package vorlesung13;

public class Arrays {
	public static void main(String[] args) {
		
		String[] aS = {"Affe", "Elefant", "Katze"};
		
		// Anzahl 3  ABER
		// Reihenfolge beginnt bei 0
		// 0 = Affe, 1 = Elefant, 2 = Katze
		System.out.println(aS[1] + "\n");
		System.out.println(aS.length + "\n");
		
		for(int i = 0; i < aS.length; i++){
			System.out.println(aS[i]);
			}
	}

}