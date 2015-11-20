package sandbox;

import java.util.Scanner;

/**
 * Eingabe einer Zeichenkette in einem parallelen Thread.
 */
class AnwenderEingabeRunnable implements Runnable {

  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);
    System.err.print("Bitte Text eingeben: ");
    String eingabe = scanner.nextLine();
    System.err.println("Eingabe: " + eingabe);
    scanner.close();
    System.err.println("run() zuende.");
  }

  public static void main(String[] args) {
    Thread eingabeThread = new Thread(new AnwenderEingabeRunnable());
    Thread eingabeThread2 = new Thread(new AnwenderEingabeRunnable());
    eingabeThread.start();
    eingabeThread2.start();
    System.err.println("main() zuende.");
  }
}