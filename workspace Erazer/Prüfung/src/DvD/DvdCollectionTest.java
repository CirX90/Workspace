/**
 * Prof. Philipp Jenke
 * Hochschule f�r Angewandte Wissenschaften (HAW), Hamburg
 */
package DvD;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Testklasse f�r die Klasse DVDCollection.
 * 
 * @author Philipp Jenke
 * 
 */
public class DvdCollectionTest {

	@Test
	/**
	 * Test der des Konstruktors Dvd. Um den Code kompakt zu halten, wurde diese
	 * Methode ausnahmsweise mit in diese Testklasse integriert.
	 */
	public void testDvd() {
		String title = "Test Title";
		int length = 203;
		int year = 1999;
		Dvd dvd = new Dvd(title, year, length);
		assertEquals("invalid title", title, dvd.getTitle());
		assertEquals("invalid length", length, dvd.getLength());
		assertEquals("invalid year", year, dvd.getYear());
	}

	@Test
	/**
	 * Test der Methode Dvd - equals. Um den Code kompakt zu halten, wurde diese
	 * Methode ausnahmsweise mit in diese Testklasse integriert.
	 */
	public void testDvdEquals() {
		Dvd dvd1 = new Dvd("Arielle", 1992, 112);
		Dvd dvd2 = new Dvd("Stirb Langsam 2", 1996, 94);
		Dvd dvd3 = new Dvd("Der Herr der Ringe", 2002, 167);
		Dvd dvd4 = new Dvd("Stirb Langsam 2", 1996, 94);

		assertEquals("incorrent equals result 1", dvd1, dvd1);
		assertEquals("incorrent equals result 2", dvd2, dvd4);
		assertFalse("incorrent equals result 3", dvd1.equals(dvd3));
	}

	@Test
	/**
	 * Test der Methode DVDCollection - existsInCollection.
	 */
	public void testExistsInCollection() {
		Dvd dvd1 = new Dvd("Arielle", 1992, 112);
		Dvd dvd2 = new Dvd("Stirb Langsam 2", 1996, 94);
		Dvd dvd3 = new Dvd("Der Herr der Ringe", 2002, 167);
		Dvd dvd4 = new Dvd("Stirb Langsam 2", 1996, 94);
		DvdCollection collection = new DvdCollection();
		collection.addDvd(dvd1);
		collection.addDvd(dvd2);
		collection.addDvd(dvd3);
		collection.addDvd(dvd4);
		assertTrue("Dvd is missing the collection",
				collection.existsInCollection(dvd1));
		assertTrue("Dvd is missing the collection",
				collection.existsInCollection(dvd2));
		assertTrue("Dvd is missing the collection",
				collection.existsInCollection(dvd3));
		assertTrue("Dvd is missing the collection",
				collection.existsInCollection(dvd4));
		assertFalse("Dvd should not be in the collection",
				collection.existsInCollection(new Dvd("Dogma", 2001, 162)));
	}

	@Test
	/**
	 * Test der Methode DvdCollection - addDvd.
	 */
	public void testAddDvd() {
		Dvd dvd1 = new Dvd("Arielle", 1992, 112);
		Dvd dvd2 = new Dvd("Stirb Langsam 2", 1996, 94);
		Dvd dvd3 = new Dvd("Der Herr der Ringe", 2002, 167);
		Dvd dvd4 = new Dvd("Stirb Langsam 2", 1996, 94);
		DvdCollection collection = new DvdCollection();
		collection.addDvd(dvd1);
		assertEquals("incorrent number of DVDs", collection.getNumberOfDvds(),
				1);
		collection.addDvd(dvd2);
		assertEquals("incorrent number of DVDs", collection.getNumberOfDvds(),
				2);
		collection.addDvd(dvd3);
		assertEquals("incorrent number of DVDs", collection.getNumberOfDvds(),
				3);
		collection.addDvd(dvd4);
		assertEquals("incorrent number of DVDs", collection.getNumberOfDvds(),
				3);
	}

	@Test
	/**
	 * Test der Methode DvdCollection - removeDvd()
	 */
	public void testRemoveDvd() {
		Dvd dvd1 = new Dvd("Arielle", 1992, 112);
		Dvd dvd2 = new Dvd("Stirb Langsam 2", 1996, 94);
		Dvd dvd3 = new Dvd("Der Herr der Ringe", 2002, 167);
		Dvd dvd4 = new Dvd("Stirb Langsam 2", 1996, 94);

		DvdCollection collection = new DvdCollection();
		Dvd removedDvd = collection.removeDvd(dvd1);
		// Remove DVD from empty collection
		assertEquals("incorrent number of DVDs", collection.getNumberOfDvds(),
				0);
		assertNull("incorrent return value", removedDvd);

		// Remove existing DVD same object
		collection.addDvd(dvd1);
		collection.addDvd(dvd2);
		collection.addDvd(dvd3);
		removedDvd = collection.removeDvd(dvd1);
		assertEquals("incorrent number of DVDs", collection.getNumberOfDvds(),
				2);
		assertEquals("incorrent return value", removedDvd, dvd1);

		// Remove DVD, different object but same in equals()-sense.
		removedDvd = collection.removeDvd(dvd4);
		assertEquals("incorrent number of DVDs", collection.getNumberOfDvds(),
				1);
		assertEquals("incorrent return value", removedDvd, dvd4);
	}

	@Test
	/**
	 * Test der Methode DVDCollection - getDvd.
	 */
	public void testGetDvd() {
		Dvd dvd1 = new Dvd("Arielle", 1992, 112);
		Dvd dvd2 = new Dvd("Stirb Langsam 2", 1996, 94);
		Dvd dvd3 = new Dvd("Der Herr der Ringe", 2002, 167);
		Dvd dvd4 = new Dvd("Stirb Langsam 2", 1996, 94);
		DvdCollection collection = new DvdCollection();
		collection.addDvd(dvd1);
		collection.addDvd(dvd2);
		collection.addDvd(dvd3);
		collection.addDvd(dvd4);
		assertEquals("Wrong getDvd result", collection.getDvd(0), dvd1);
		assertEquals("Wrong getDvd result", collection.getDvd(1), dvd2);
		assertEquals("Wrong getDvd result", collection.getDvd(2), dvd3);
		assertEquals("Wrong getDvd result", collection.getDvd(1), dvd4);
	}
}
