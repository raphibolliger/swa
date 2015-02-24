/*
 * Created on 09.02.2015
 */
package kw8.persondata.inheritance1;

/**
 * @author Wolfgang Weck
 */
public class Supplier extends Person {
	private int qualityRating;

	public Supplier(String name, String firstName, String address, String town,
			String postcode, int qualityRating) {
		super(name, firstName, address, town, postcode);
		this.qualityRating = qualityRating;
	}

	public int getQualityRating() {
		return qualityRating;
	}

	public void setQualityRating(int qualityRating) {
		if (qualityRating != this.qualityRating) {
			this.qualityRating = qualityRating;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", " + '"' + qualityRating + '"';
	}
}
