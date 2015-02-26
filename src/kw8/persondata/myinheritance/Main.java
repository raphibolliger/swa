package kw8.persondata.myinheritance;

import kw8.persondata.myinheritance.interfaces.ICustomer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ICustomer> customers = new ArrayList<ICustomer>();

        Customer c1 = new Customer("Hans", "Müller", "Strasse 10", "Zürich", "8000", 230000);
        Customer c2 = new Customer("Meier", "Fritz", "Kirchweg 69", "Baden", "5400", 250000);

        EmployedCustomer ec1 = new EmployedCustomer("Bolliger", "Raphael", "Riedweg 10", "Seengen", "5707", 340000, "Informatik", 85000);
        EmployedCustomer ec2 = new EmployedCustomer("Sandmeier", "Barbara", "Hauptstrasse 23", "Wohlen", "5610", 90000, "Buchhaltung", 60000);

        customers.add(c1);
        customers.add(c2);
        customers.add(ec1);
        customers.add(ec2);

        double averageYearlyTurnover = 0;

        for (int i = 0; i < customers.size(); i++) {
            averageYearlyTurnover += customers.get(i).getYearlyTurnover();
        }

        System.out.println(averageYearlyTurnover/customers.size());

    }

}
