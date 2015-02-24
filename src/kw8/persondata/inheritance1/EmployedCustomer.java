/*
 * Created on Feb 15, 2015
 */
package kw8.persondata.inheritance1;

/**
 * @author Wolfgang Weck
 */
public class EmployedCustomer extends Employee {
	private int yearlyTurnover;

	public EmployedCustomer(String name, String firstName, String address,
			String town, String postcode, String department, int yearlySalary,
			int yearlyTurnover) {
		super(name, firstName, address, town, postcode, department, yearlySalary);
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