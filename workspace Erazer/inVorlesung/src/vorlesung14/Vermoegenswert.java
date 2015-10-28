package vorlesung14;

public interface Vermoegenswert {
			
		enum Risiko {
			NIEDRIG, MITTEL, HOCH
		}
		
		public String getName();
		
		public double getEuroWert();
		
		public Risiko getRisiko();	
	
}