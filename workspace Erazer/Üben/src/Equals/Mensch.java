package Equals;

public class Mensch {

	int alter;
	String name;
	double gewicht;

	public Mensch(int alter, String name) {
		this.alter = alter;
		this.name = name;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Mensch)) {
			return false;
		}
		Mensch m = (Mensch)obj;
		if(this.alter != m.alter) {
			return false;
		}
		if (!(this.name.equals(m.name))) {
			return false;
		}
		
		return true;
	}
}