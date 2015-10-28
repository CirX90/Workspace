package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {

		Collection<String> stadtteile = new LinkedList<String>(Arrays.asList(
				"Hafencity", "Wandsbek", "Altona"));

		for (String stadtteil : stadtteile) {
			System.out.println(stadtteil + " ");
		}

	}

}