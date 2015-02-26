/*
 * Created on 15.02.2015
 */
package kw8.persondata.inheritance1;

/**
 * @author Wolfgang Weck
 */
public class Operations {
	public static void main(String[] args) {
		Customer c = new Customer("Muster", "Hans", "Bergweg 9", "Exemplikon", "8015", 284295);
		Supplier s = new Supplier("Müller", "Paula", "Lange Strasse 525", "Strasswil", "4711", 5);
		Employee e = new Employee("Huber", "Urs", "Hinterm Berg 98", "Waldbach", "2113", "Buchhaltung", 87654);
		c.setName("Meier");
		s.setFirstName("Kurt");
		e.setPostcode("5210");
		System.out.println(c);
		System.out.println(s);
		System.out.println(e);
	}
}