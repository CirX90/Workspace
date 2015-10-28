package helden;

public class Held {

	private String name;
	private int lebenspunkte;
	private int staerke;
	private int geschicklichkeit;

	public Held(String name, int lebenspunkte, int staerke, int geschicklichkeit) {
		this.name = name;
		this.lebenspunkte = lebenspunkte;
		this.staerke = staerke;
		this.geschicklichkeit = geschicklichkeit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLebenspunkte() {
		return lebenspunkte;
	}

	public void setLebenspunkte(int lebenspunkte) {
		this.lebenspunkte = lebenspunkte;
	}

	public int getStaerke() {
		return staerke;
	}

	public void setStaerke(int staerke) {
		this.staerke = staerke;
	}

	public int getGeschicklichkeit() {
		return geschicklichkeit;
	}

	public void setGeschicklichkeit(int geschicklichkeit) {
		this.geschicklichkeit = geschicklichkeit;
	}

	public String begruessen(String sprecher) {
		if (sprecher.equals("jan")) {
			String begruessen = "Hallo, ich bin Jan"
					+ " und ich werde dich vernichten!";
			return begruessen;
		}
		String begruessen = "Hallo, ich bin Tom"
				+ " und ich erwarte einen ehrenhaften Kampf!";
		return begruessen;
	}

	public int schlagen(Held andererHeld) {
		int schaden = 0;
		if (lebenspunkte > 0) {
			schaden = (int) (staerke * (1 - andererHeld.geschicklichkeit / 100) * Math
					.random());
		return schaden;
		}else{
		return schaden;
		}
	}

}