package array;

public class arrayVerlaengern {
	
	public int[] zahl = new int[3];
	
	public int[] verlaengern() {
		
		zahl[0] = 1;
		zahl[1] = 5;
		zahl[2] = 10;
		
		int[] zahl2 = new int[5];
		
		for (int index = 0; index < zahl.length; index++) {
			zahl2[index] = zahl[index];
		}
		
		for (int index = 3; index < zahl2.length; index++) {
			zahl2[index] = zahl[0] + zahl[1] + zahl[2];
			
			
		}
		
		zahl = zahl2;
		return zahl;
	}
	
	public void ausgabe(int[] zahl) {
		
		for (int index = 0; index < zahl.length; index++) {
			System.out.println(zahl[index]);
		}
	}
	
	public static void main(String[] args) {
		arrayVerlaengern main = new arrayVerlaengern();
		main.ausgabe(main.verlaengern());
		
	}

}