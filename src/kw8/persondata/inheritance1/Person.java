/*
 * Created on 09.02.2015
 */
package kw8.persondata.inheritance1;

/**
 * @author Wolfgang Weck
 */
public class Person {
	private String name, firstName, address, town, postcode;

	public Person(String name, String firstName, String address, String town,
			String postcode) {
		this.name = name;
		this.firstName = firstName;
		this.address = address;
		this.town = town;
		this.postcode = postcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.equals(this.name)) {
			this.name = name;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (!firstName.equals(this.firstName)) {
			this.firstName = firstName;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String streetName) {
		if (!streetName.equals(this.address)) {
			this.address = streetName;
		}
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		if (!town.equals(this.town)) {
			this.town = town;
		}
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		if (!postcode.equals(this.postcode)) {
			this.postcode = postcode;
		}
	}

	@Override
	public String toString() {
		return '"' + this.getClass().getName() + '"' + ": " + '"' + name + '"'
				+ ", " + '"' + firstName + '"' + ", " + '"' + address + '"' + ", "
				+ '"' + town + '"' + ", " + '"' + postcode + '"';
	}
}