package vorlesung10;

public class Element {
	
	private static int zaehler;
	
	public Element() {
		zaehler++;
		System.out.println("Anzahl Elemente " + zaehler);
		
	}
	
	public static void main(String[] args) {

		new Element();
		new Element();
		new Element();

	}

}