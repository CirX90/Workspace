package helden;

public class HeldApp {
	public static void main(String[] args) {

		Held jan = new Held("jan", 100, 90, 75);
		Held tom = new Held("tom", 100, 85, 85);
		
		String a = "Der Held Jan schlägt den Helden Tom "
				+ "und fügt ihm kritisch ";
		String b = " Schaden zu. AUTSCH!";
		System.out.print(a);
		System.out.print(jan.schlagen(tom));
		System.out.println(b);
		
		System.out.println(jan.begruessen("jan"));
		System.out.println(tom.begruessen("tom"));
		
		System.out.println(HeldApp.kampfDerHelden(jan, tom));

	}
	
	public static String kampfDerHelden(Held angreifer, Held verteidiger) {
		// Name der Helden speichern
		String nameAngreifer = angreifer.getName();
		String nameVerteidiger = verteidiger.getName();
		
		// Text, der den Kampf dokumentiert
		String kampfgeschehen = nameAngreifer + " greift " + nameVerteidiger +
				" an! \n\n";
		
		kampfgeschehen += angreifer.begruessen("jan") + "\n" +
						  verteidiger.begruessen("tom") + "\n\n";
		
		while(angreifer.getLebenspunkte() > 0 && verteidiger.getLebenspunkte() > 0) {
			
		}
		
		
		
		
		return kampfgeschehen;
	}

}