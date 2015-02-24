/*
 * Created on 09.02.2015
 */
package kw8.persondata.inheritance1;

/**
 * @author Wolfgang Weck
 */
public class Employee extends Person {
	private String department;
	private int yearlySalary;

	public Employee(String name, String firstName, String address, String town,
			String postcode, String department, int yearlySalary) {
		super(name, firstName, address, town, postcode);
		this.department = department;
		this.yearlySalary = yearlySalary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if (!department.equals(this.department)) {
			this.department = department;
		}
	}

	public int getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(int yearlySalary) {
		if (yearlySalary != this.yearlySalary) {
			this.yearlySalary = yearlySalary;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", " + '"' + department + '"' + ", " + '"'
				+ yearlySalary + '"';
	}
}