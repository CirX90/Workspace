/**
 * Prof. Philipp Jenke
 * Hochschule f�r Angewandte Wissenschaften (HAW), Hamburg
 */
package DvD;

import java.util.Arrays;

/**
 * Eine DvdCollection erlaubt die Aufbewahrung einer Reihe von DVDs. Es k�nnen
 * DVDs eingef�gt und und aus der Sammlung entfernt werden.
 * 
 * @author Philipp Jenke
 * 
 */
public class DvdCollection {

	/**
	 * Die DVDs werden in einem Array abgelegt. Ist das Array voll, so wird ein
	 * gr��eres Array angelegt.
	 */
	private Dvd[] collection = new Dvd[1];

	/**
	 * In dieser Objektvariable wird die Anzahl der DVDs in der Sammlung
	 * abgelegt.
	 */
	private int numberOfDvds = 0;

	/**
	 * Hinzuf�gen einer DVD. Eine DVD wird nur dann zugef�gt, wenn es nicht eine
	 * gleiche DVD bereits in der Sammlung gibt. Ist das Array voll mit DVDs,
	 * wird ein neues, doppelt so gro�es Array angelegt.
	 * 
	 * @param dvd
	 *            DVD, die in die Sammlung eingef�gt werden soll.
	 */
	public void addDvd(Dvd dvd) {

		// Zun�chts wird gepr�ft, ob die DVD ein g�ltiges Objekt ist und ob die
		// DVD nicht bereits in der Sammlung exitiert.
		if (dvd != null && !existsInCollection(dvd)) {

			// Anlegen eines neuen Arrays, falls notwendig.
			if (numberOfDvds == collection.length) {
				// Anlegen eines neuen Arrays mit der doppelten L�nge
				Dvd[] newCollection = new Dvd[collection.length * 2];
				// Kopiern der Eintr�ge aus dem alten Array in das neue.
				System.arraycopy(collection, 0, newCollection, 0,
						collection.length);
				// Setzen der Referenz auf das neue Array
				collection = newCollection;
			}

			// Ablegen der neuen DVD.
			collection[numberOfDvds] = dvd;
			numberOfDvds++;
		}
	}

	/**
	 * Entfernen einer DVD aus der Sammlung. Wird die DVD in der Sammlung
	 * gefunden, dann wird sie entfernt und zur�ckgeliefert. Dazu wird die
	 * letzte DVD an die Stele der entfernten DVD gesetzt und der Eintrag der
	 * der alten letzten DVD auf null gesetzt. Findet sich die DVD nicht in der
	 * Sammlung, dann liefert die Methode null zur�ck.
	 * 
	 * @param dvd
	 *            DVD, die aus der Sammlung entfernt werden soll.
	 * 
	 * @return DVD-Object, das entfernt wurde, null falls das Entfernen
	 *         fehlgeschlagen ist.
	 */
	public Dvd removeDvd(final Dvd dvd) {
		Dvd removedDvd = null;
		if (dvd != null) {
			for (int i = 0; i < numberOfDvds; i++) {
				if (collection[i].equals(dvd)) {
					removedDvd = collection[i];
					int indexOfLastDvd = numberOfDvds;
					collection[i] = collection[indexOfLastDvd];
					collection[indexOfLastDvd] = null;
					numberOfDvds--;
					break;
				}
			}
		}
		return removedDvd;
	}

	/**
	 * Pr�fung, ob eine DVD bereits in der Sammlung vorkommt; Liefert true
	 * zur�ck, falls ja, ansonsten false.
	 * 
	 * @param dvd
	 *            DVD von der gepr�ft wird, ob sie in der Sammlung vorkommt.
	 * 
	 * @return Liefert true, falls die DVD in der Sammlung vorkommt, ansonsten
	 *         false.
	 */
	public boolean existsInCollection(final Dvd dvd) {
		for (int i = 0; i < numberOfDvds; i++) {
			if (collection[i].equals(dvd)) {
				return true;
			}
		}
		return false;
	}

	public int getNumberOfDvds() {
		return numberOfDvds;
	}

	/**
	 * Liefert die DVD an einer bestimmten Positon (index) in der Sammlung
	 * zur�ck. Die Methode liefert null, falls der index negativ oder gr��er dem
	 * maximalen Index ist. Der maximale Index ist um 1 kleiner als die Anzahl
	 * der Dvds.
	 * 
	 * @param index
	 *            Index der DVD in der Sammlung, die zur�ckgegeben werden soll.
	 * 
	 * @return DVD an der Position index, null, falls der Index ung�ltig ist.
	 */
	public Dvd getDvd(int index) {
		if (index < 0 || index > numberOfDvds - 2) {
			return null;
		}
		return collection[index];
	}

	@Override
	public String toString() {
		String result = "\n*** DVD collection *** \n";
		for (int i = 0; i < numberOfDvds; i++) {
			Dvd dvd = getDvd(i);
			result += " - " + dvd + "\n";
		}
		return result;
	}

	/**
	 * Ausgabe der Sammlung auf der Konsole.
	 */
	public void print() {
		System.out.println(this);
	}

	/**
	 * Liefert ein sortiertes Array der DVD-Sammlung zur�ck. Die Arrayl�nge
	 * entspricht der Anzahl der DVDs.
	 * 
	 * @return Array, das alle Elemente der Sammlung in sortierter Reihenfolge
	 *         beinhaltet.
	 */
	public Dvd[] sort() {
		Dvd[] sortedCollection = new Dvd[numberOfDvds];
		System.arraycopy(collection, 0, sortedCollection, 0, numberOfDvds);
		Arrays.sort(sortedCollection);
		return sortedCollection;
	}
}
