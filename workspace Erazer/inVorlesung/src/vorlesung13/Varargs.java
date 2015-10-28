package vorlesung13;

public class Varargs {
	public static void main(String[] args) {
		 
	ausgabeVokale(zaehleVokale());
	
	}
	
	public static int zaehleVokale(char... zeichen) {
		
		//String[] array = {"S", "m", "a", "r", "t"};
		int anzahlVokale = 0;
		
		for(char buchstabe : zeichen) {
			if (buchstabe == 'a' || buchstabe == 'A') {
				anzahlVokale++;
			}
		}
		
		return anzahlVokale;
		
	}
	
	public static void ausgabeVokale(int anzahlVokale) {
		System.out.format("%4d" , anzahlVokale);
	}

}