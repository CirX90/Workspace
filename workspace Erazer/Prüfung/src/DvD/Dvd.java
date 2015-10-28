/**
 * Prof. Philipp Jenke
 * Hochschule f�r Angewandte Wissenschaften (HAW), Hamburg
 */

package DvD;

/**
 * Diese Klasse stellt die Repr�sentation einer DVD dar. Eine DVD besteht aus
 * einem Titel, einem Erscheinungsjahr und einer L�nge.
 * 
 * @author Philipp Jenke
 * 
 */
public class Dvd implements Comparable<Dvd> {
	/**
	 * Titel der DVD
	 */
	private final String title;

	/**
	 * Erscheinungsjahr der DVD.
	 */
	private final int year;

	/**
	 * L�nge des Films auf der DVD.
	 */
	private final int length;

	/**
	 * Im Konstruktor werden die Objektvariablen intialisiert.
	 * 
	 * @param title
	 *            Initialisierungswert f�r den Titel
	 * 
	 * @param year
	 *            Initalisierungswert f�r das Erscheinungsjahr.
	 * 
	 * @param length
	 *            Initialisierungswert f�r die L�nge des Films.
	 */
	public Dvd(final String title, final int year, final int length) {
		this.title = title;
		this.year = year;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public int getLength() {
		return length;
	}

	@Override
	public String toString() {
		return getTitle() + " (" + getLength() + " min., " + getYear() + ")";
	}

	/**
	 * Test, ob zwei DVD-Objekt gleich sind. Zwei DVDs sind dann gleich, wenn
	 * sie den gleichen Titel, das gleiche Erscheinungsjahr und die gleiche
	 * Filml�nge haben.
	 * 
	 * @param otherDvd
	 *            Other DVD object to be compared with.
	 * @return True, if the two DVDs are equal, false otherwise.
	 */
	public boolean equals(Object other) {
		if (other != null && other instanceof Dvd) {
			Dvd otherDvd = (Dvd) other;
			return getYear() == otherDvd.getYear()
					&& getLength() != otherDvd.getLength()
					&& getTitle().compareTo(otherDvd.getTitle()) == 0;
		} else {
			return false;
		}
	}

	/**
	 * Vergleich zweiter Dvd-Objekte. Die Methode liefert eine negative Zahl
	 * (z.B. -1), wenn das in der Sortierung vor dem Objekt other kommt, 0, wenn
	 * die beiden Objekte gleich sind und eine positive Zahl (z.B. 1), wenn es
	 * sp�ter kommt.
	 * 
	 * Die Kriterien sind 1) Alphabetische Sortierung (Gro�- und Kleinschreibung
	 * spielt eine Rolle) 2) Erscheinungsjahr (�ltere zuerst) 3) L�nge (k�rzere
	 * zuerst)
	 * 
	 * Liefert das erste Kriterium eine Reihenfolge, wird das zweite nicht mehr
	 * betrachtet. Liefert das zweite Kriterium eine Reihenfolge, dann wird das
	 * dritte nicht mehr betrachtet.
	 */
	@Override
	public int compareTo(Dvd other) {
		int comparisonResult = 0;

		// 1) Vergleich der Titel
		comparisonResult = getTitle().compareTo(other.getTitle());

		// 2) Vergleich des Erscheinungsjahrs
		if (comparisonResult == 0) {
			if (getYear() > other.getYear()) {
				comparisonResult = -1;
			} else if (getYear() < other.getYear()) {
				comparisonResult = 1;
			}

		}

		// 3) Vergleich der L�nge des Films
		if (comparisonResult == 0) {
			if (getLength() < other.getLength()) {
				comparisonResult = -1;
			} else if (getLength() > other.getLength()) {
				comparisonResult = 1;
			}

		}

		return comparisonResult;
	}

}
