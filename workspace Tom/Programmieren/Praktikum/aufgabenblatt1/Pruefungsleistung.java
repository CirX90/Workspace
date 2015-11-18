package aufgabenblatt1;

public class Pruefungsleistung {
	
	/**
	  * Name des Moduls.
	  */
	
	private String modulname = "";
	
	/**
	  * Note des Studenten.
	  */

	private int note;
	
	/**
	 * Konstruktor.
	 * @param modulname
	 * @param note
	 */
	
	public Pruefungsleistung(String modulname, int note) {
		this.modulname = modulname;
		this.note = note;
	}
	
	/**
	 * Getter für Modulname.
	 * @return modulname
	 */
	
	public String getModulname() {
		return modulname;
	}
	
	/**
	 * Getter für Note.
	 * @return note
	 */
	
	public int getNote() {
		return note;
	}

}