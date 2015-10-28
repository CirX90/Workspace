/**
 * Prof. Philipp Jenke
 * Hochschule f�r Angewandte Wissenschaften (HAW), Hamburg
 */
package Point;

/**
 * Repr�sentierung eines dreidimensionalen Punktes. Ein Punkt beinhaltet drei
 * Koordinaten: x, y, z.
 */
public class Point {
	/**
	 * Koordinaten des Punktes.
	 */
	private double x, y, z;

	/**
	 * Default constructor.
	 * 
	 * @param x
	 *            Initialisierungswert f�r die Koordinate x.
	 * @param y
	 *            Initialisierungswert f�r die Koordinate y.
	 * @param z
	 *            Initialisierungswert f�r die Koordinate z.
	 */
	public Point(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}
	
	@Override
	public boolean equals(Object anderesObject) {
		if (!(anderesObject instanceof Point)) {
			return false;
		}
		Point andererPunkt = (Point) anderesObject;
		return (x == andererPunkt.x) && (y ==
				andererPunkt.y && z == andererPunkt.z);
		
	}

	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
	}
}