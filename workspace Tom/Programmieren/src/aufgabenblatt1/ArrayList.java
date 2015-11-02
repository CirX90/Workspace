package aufgabenblatt1;

public class ArrayList<T> {

	/**
	 * Deklaration einer Ganzzahl Variabel.
	 */

	int anzahlElemente;

	/**
	 * Deklaration eines Object Arrays.
	 */

	private Object[] elemente;

	/**
	 * Konstruktor.
	 * 
	 * @param groesse
	 */

	public ArrayList(int groesse) {
		elemente = new Object[groesse];
		anzahlElemente = 0;
	}

	/**
	 * Hinzufuegen von Elementen in die Liste.
	 * 
	 * @param element
	 */

	public void hinzufuegen(T element) {
		Object[] neuElementeArray = new Object[elemente.length + 1];
		for (int i = 0; i < elemente.length; i++) {
			neuElementeArray[i] = elemente[i];
		}

		anzahlElemente = neuElementeArray.length;
		neuElementeArray[elemente.length] = element;
		elemente = neuElementeArray;

	}

	/**
	 * Getter
	 * 
	 * @param index
	 * @return wenn nichts gefunden wird soll er Null zurueckgeben, ansonsten
	 *         gibt er das Element an dem angegebenen Index zurueck.
	 * 
	 */
	public T get(int index) {
		if (index < anzahlElemente && index >= 0) {
			return (T) elemente[index];
		} else {

			return null;
		}
	}

	/**
	 * Element aus der Liste entfernen
	 * 
	 * @param element
	 *            welches entfernt werden soll
	 */
	public void entfernen(T element) {
		if (anzahlElemente != 0) {

			for (int i = 0; i < anzahlElemente; i++) {
				if (elemente[i].equals(element)) {
					elemente[i] = null;
				}
			}
		}
	}

	/**
	 * An bestimmten Index, das Element entfernen
	 * 
	 * @param index
	 */
	public void entferneElementAnIndex(int index) {

		try {
			elemente[index] = null;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Ungültiger Index");

		}

	}

	/**
	 * 
	 * Getter Ausgabe der Anzahl
	 * 
	 * @return anzahlElemente
	 */

	public int getAnzahlElemente() {
		return anzahlElemente;
	}

	/**
	 * ToString Methode
	 * 
	 */

	public String toString() {
		String ausgabe = "";
		for (int i = 0; i < anzahlElemente; i++) {
			ausgabe += elemente[i];
		}
		return ausgabe;

	}

	public T getKleinstesElement() {
		Object ergebnis = elemente[0];
		// Die Elemente werden miteinander verglichen und das Kleinste wird
		// zurückgegeben
		int i = 0;
		while (i < elemente.length) {
			if (elemente[i] instanceof Integer
					&& (Integer) elemente[i] < (Integer) elemente[i]) {
				ergebnis = elemente[i];
			}
			i++;
		}
		return (T) ergebnis;
	}

	/**
	 * Gibt das kleinste Element wieder.
	 * 
	 * @return (T) ergebnis
	 */

	public <T extends Comparable<T>> T getKleinstesElementNEU() {
		T ergebnis = (T) elemente[0];
		// Die Elemente werden miteinander verglichen und das Kleinste wird
		// zurückgegeben
		int i = 0;
		while (i < elemente.length) {
			T original = (T) elemente[i];
			if (original.compareTo(ergebnis) == -1) {
				ergebnis = (T) elemente[i];
			}
			i++;
		}
		return (T) ergebnis;

	}

	/**
	 * Wenn Zahlen enthalten sind, dann werden diese zusammengerechnet,
	 * ansonsten wird 0 zurueckgegeben.
	 * 
	 * @return result
	 */

	public int summenRechner() {

		int result = 0;

		if (!(elemente[0] instanceof Integer)) {
			// System.out.println("Ist kein Integer");
			return 0;
		}

		for (int i = 0; i < anzahlElemente; i++) {
			result += (int) elemente[i];
		}

		return result;
	}
}