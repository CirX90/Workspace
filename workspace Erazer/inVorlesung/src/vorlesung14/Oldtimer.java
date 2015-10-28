package vorlesung14;

public class Oldtimer implements Vermoegenswert {

	private int alter;
	
	private int gefahreneKm;
	
	public Oldtimer(int alter, int gefahreneKm) {
		
		this.alter = alter;
		this.gefahreneKm = gefahreneKm;
	}
	
		@Override
		public String getName() {
			return "Oldtimer";
		}
			
		@Override
		public double getEuroWert() {
			return alter * gefahreneKm;
	}
		
		@Override
		public Risiko getRisiko() {
			return Risiko.MITTEL;
	}
}