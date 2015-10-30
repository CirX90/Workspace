package vorlesung5;

public class ThreadSchlafen extends Thread {

	@Override
	public void run() {
		int i = 0;
		while (!isInterrupted() ^ i>=10) {
			System.err.println(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println("My Thread wurde durch Interrupt geweckt!");
				interrupt();
			}
		}
		System.err.println("My Thread wird beendet!");

	}

	public static void main(String[] args) {
		
		ThreadSchlafen schlafen = new ThreadSchlafen();
		schlafen.start();

	}

}