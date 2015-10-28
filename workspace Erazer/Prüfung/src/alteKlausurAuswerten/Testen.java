package alteKlausurAuswerten;

public class Testen {
	public static void main(String[] args) {
		
	int[] rationalArray = {1,2,3};
	
	int[] rationalArrayKopie = new int[rationalArray.length];
	
	for(int index = 0; index < rationalArray.length; index++) {
		rationalArrayKopie[index] = rationalArray[index];
		System.out.println(rationalArrayKopie[index]);
	}
	
		
	}

}