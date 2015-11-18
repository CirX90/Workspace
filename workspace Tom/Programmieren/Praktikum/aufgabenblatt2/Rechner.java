package aufgabenblatt2;

import java.util.HashMap;
import java.util.Map;

public class Rechner {

	double zahl1 = 1.0;
	double zahl2 = 2.0;

	private enum Operation {
		ADDITION, SUBTRAKTION, MULTIPLIKATION, DIVISION
	}

	static Map<Operation, DoubleDoubleZuDouble> map = new HashMap<Operation, DoubleDoubleZuDouble>();

	// BinaryOperator<Double> addiere = (n1, n2) -> n1 + n2;
	// BinaryOperator<Double> subtrahiere = (n1, n2) -> n1 - n2;
	// BinaryOperator<Double> multipliziere = (n1, n2) -> n1 * n2;
	// BinaryOperator<Double> dividiere = (n1, n2) -> n1 / n2;

	private DoubleDoubleZuDouble addiere = (zahl1, zahl2) -> {
		return zahl1 + zahl2;
	};

	private DoubleDoubleZuDouble subtrahiere = (zahl1, zahl2) -> {
		return zahl1 - zahl2;
	};

	private DoubleDoubleZuDouble multipliziere = (zahl1, zahl2) -> {
		return zahl1 * zahl2;
	};

	private DoubleDoubleZuDouble dividiere = (zahl1, zahl2) -> {
		return zahl1 / zahl2;
	};

	public double berechne(Operation rechenart, double zahl1, double zahl2) {

		if (rechenart == Operation.ADDITION) {
			return addiere.werteAus(zahl1, zahl2);
		}

		else if (rechenart == Operation.SUBTRAKTION) {
			return subtrahiere.werteAus(zahl1, zahl2);
		}

		else if (rechenart == Operation.MULTIPLIKATION) {
			return multipliziere.werteAus(zahl1, zahl2);
		}

		else if (rechenart == Operation.DIVISION) {
			return dividiere.werteAus(zahl1, zahl2);
		} else {

			return 0.0;
		}

	}

	public static void main(String[] args) {
		Rechner rechner = new Rechner();
//		System.out.println(rechner.berechne(Operation.DIVISION, rechner.zahl1,
//				rechner.zahl2));

		map.put(Operation.ADDITION, rechner.addiere);
		map.put(Operation.SUBTRAKTION, rechner.subtrahiere);
		map.put(Operation.MULTIPLIKATION, rechner.multipliziere);
		map.put(Operation.DIVISION, rechner.dividiere);

//		System.out.println(rechner.berechne(Operation.ADDITION, rechner.zahl1,
//				rechner.zahl2));
//
//		System.out.println(map.get(rechner.addiere));
		
		double erg = rechner.berechne(Operation.MULTIPLIKATION, 1.0, 2.0);
		erg = rechner.berechne(Operation.ADDITION, erg, 3.0);
		System.out.println(erg);

		// String value = map.get(Operation.ADDIEREN);
		// System.out.println(value);
	}

}
