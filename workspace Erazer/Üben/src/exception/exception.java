package exception;

public class exception {

	public static void main(String[] args) {
		double[] array = {1.0, 2.0, 3.0};
		
		try{
			System.out.println(array[5]);
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.toString());
		}
	}

}
