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
	
	public Pruefungsleistung(String modulname, int note) {
		this.modulname = modulname;
		this.note = note;
	}
	
	public String getModulname() {
		return modulname;
	}
	
	public int getNote() {
		return note;
	}

}