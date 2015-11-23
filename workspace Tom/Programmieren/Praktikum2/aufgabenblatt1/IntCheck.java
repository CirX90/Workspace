package aufgabenblatt1;

public class IntCheck {
	
	/**
	 * Methode prüft ob das erste Element des Arrays ein eine Zahl (rechenbar) ist.
	 * 
	 * @param ArrayListe<T> elemente
	 * 
	 * @return false wenn nicht
	 * @return true wenn es so sein sollte
	 */
	
	public static <T> boolean pruefe(ArrayList<T> elemente) {
		if (elemente.get(0) instanceof Number) {
			return true;
		} else
			return false;
	}

}