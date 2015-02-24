/*
 * Created on 09.02.2015
 */
package kw8.persondata.inheritance1;

/**
 * @author Wolfgang Weck
 */
public class Customer extends Person {
	private int yearlyTurnover;

	public Customer(String name, String firstName, String address, String town,
			String postcode, int yearlyTurnover) {
		super(name, firstName, address, town, postcode);
		this.yearlyTurnover = yearlyTurnover;
	}

	public int getYearlyTurnover() {
		return yearlyTurnover;
	}

	public void setYearlyTurnover(int yearlyTurnover) {
		if (yearlyTurnover != this.yearlyTurnover) {
			this.yearlyTurnover = yearlyTurnover;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", " + '"' + yearlyTurnover + '"';
	}
}