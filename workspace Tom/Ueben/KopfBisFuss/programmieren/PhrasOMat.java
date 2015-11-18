package programmieren;

public class PhrasOMat {
	public static void main(String[] args) {

		String[] wortListeEins = { "verlaessliche", "erfolgsorientierte", "clevere", "kundenorientierte",
				"pfadkritische", "dynamische", "konkurrenzfähige", "verteilte", "zielgerichtete" };

		String[] wortListeZwei = { "gepowerte", "haftende", "Mehrwert-", "zentrierte", "geclusterte", "proaktive",
				"Out-of-the-Box", "positionierte", "vernetzte", "fokussierte", "kraftvolle", "geordnete", "geteilte",
				"kooperative", "beschleunigte", "Multi-Tier-", "Enterprise-", "B2B-", "Frontend" };

		String[] wortListeDrei = { "Schicht", "Endstufe", "Loesung", "Architektur", "Kernkompetenz", "Strategie",
				"Kooperation", "Ausrichtung", "Raeumlichkeit", "Vision", "Dimension", "Mission" };

		int laengeEins = wortListeEins.length;
		int laengeZwei = wortListeZwei.length;
		int laengeDrei = wortListeDrei.length;

		int zufallEins = (int) (Math.random() * laengeEins);
		int zufallZwei = (int) (Math.random() * laengeZwei);
		int zufallDrei = (int) (Math.random() * laengeDrei);

		String phrase = wortListeEins[zufallEins] + " " + wortListeZwei[zufallZwei] + " " + wortListeDrei[zufallDrei];

		System.out.println("Es ist Zeit fuer eine " + phrase + ".");
	}
}