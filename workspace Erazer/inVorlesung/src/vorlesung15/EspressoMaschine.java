package vorlesung15;

public class EspressoMaschine extends KaffeeMaschine {
	public void kaffeeMachen(int mengeKaffee) {

		System.out.format("Besserer Kaffee %d \n", mengeKaffee);

	}

	public void kaffeeMachen(int mengeKaffee, int mengeMilch) {

		System.out.format("Lecker Cappuccino %d, %d \n", mengeKaffee,
				mengeMilch);

	}

	public static void main(String[] args) {

		EspressoMaschine maschine = new EspressoMaschine();

		maschine.kaffeeMachen(200, 50);
		maschine.kaffeeMachen(500);

		KaffeeMaschine maschineAlt = new KaffeeMaschine();

		maschineAlt.kaffeeMachen(500);
	}
}