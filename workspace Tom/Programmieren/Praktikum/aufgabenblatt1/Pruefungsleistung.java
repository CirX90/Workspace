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
	 * Getter f�r Modulname.
	 * @return modulname
	 */
	
	public String getModulname() {
		return modulname;
	}
	
	/**
	 * Getter f�r Note.
	 * @return note
	 */
	
	public int getNote() {
		return note;
	}

}