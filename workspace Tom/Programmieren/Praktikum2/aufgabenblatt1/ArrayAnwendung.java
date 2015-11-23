package aufgabenblatt1;

public class ArrayAnwendung {

	public static <T> void main(String[] args) {
		
		int element1 = 5;
		int element2 = 4;
		int element3 = 3;
		
		ArrayList list = new ArrayList<T>(5);
		
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.hinzufuegen(element3);
		list.hinzufuegen(element1);
		list.hinzufuegen(element2);
		list.hinzufuegen(element3);
		list.hinzufuegen(element3);

		
		System.out.println(list.anzahlElemente);

		System.out.println(list.toString());
		
	}

}