package kw8.persondata.myinheritance;

import kw8.persondata.myinheritance.interfaces.ICustomer;

public class Customer extends Person implements ICustomer {

    private int yearlyTurnover;

    public Customer(String name, String firstName, String address, String town, String postcode, int yearlyTurnover) {
        super(name, firstName, address, town, postcode);
        this.yearlyTurnover = yearlyTurnover;
    }

    @Override
    public int getYearlyTurnover() {
        return yearlyTurnover;
    }

    @Override
    public void setYearlyTurnover(int yearlyTurnover) {
        this.yearlyTurnover = yearlyTurnover;
    }
}
