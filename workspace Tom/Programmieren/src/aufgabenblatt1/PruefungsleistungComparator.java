package aufgabenblatt1;

import java.util.Comparator;

public class PruefungsleistungComparator implements Comparator<Pruefungsleistung> {

	@Override
	public int compare(Pruefungsleistung leistung1, Pruefungsleistung leistung2) {
		return leistung1.compareTo(leistung2);
	}

}