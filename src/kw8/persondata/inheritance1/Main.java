package kw8.persondata.inheritance1;

public class Main {

    public static void main (String[] args){

        Person ec = new EmployedCustomer("Meier", "Fritz", "Bergweg 9", "Exemplikon", "8015", "Informatik", 120000, 140000);
        Person c = new Customer("Muster", "Hans", "Bergweg 9", "Exemplikon", "8015", 284295);
        Person s = new Supplier("Müller", "Paula", "Lange Strasse 525", "Strasswil", "4711", 5);
        Person e = new Employee("Huber", "Urs", "Hinterm Berg 98", "Waldbach", "2113", "Buchhaltung", 87654);



        System.out.println(c.toString());

    }

}
