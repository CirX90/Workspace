package array;

public class array_frisch {
	public static void main(String[] args) {
		
		int wert = 5;
		
		//array initialisieren + Namen + 8 = Größe
		int[] array = new int[8];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = wert;
			
			wert += 5;
			
			System.out.println(array[i]);
		}
		
		System.out.println("Beendet.");
	}

}