package aufgabenblatt1;

public class Pruefungsleistung implements Comparable<Pruefungsleistung> {
	
	/**
	  * Name des Moduls.
	  */
	
	private String modulname = "";
	
	/**
	  * Note des Studenten.
	  */

	private int note;

	@Override 
	public int compareTo(Pruefungsleistung andereLeistung) {
		return getModulname().compareTo(andereLeistung.getModulname());
	}
	
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