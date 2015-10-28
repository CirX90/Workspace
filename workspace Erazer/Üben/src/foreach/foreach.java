package foreach;

import java.util.ArrayList;
import java.util.List;

public class foreach {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int index = 0; index < 100; index++) {
			list.add(index);
		}

		for (int stelle : list) {
			System.out.println(stelle);

		}
		
		System.out.println("\n" + "Die Größe der Liste ist: " + list.size()
				+ " Stellen.");
		System.out.println(list.contains(98));
	}

}
