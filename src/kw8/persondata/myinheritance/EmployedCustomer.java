package kw8.persondata.myinheritance;

import kw8.persondata.myinheritance.interfaces.ICustomer;
import kw8.persondata.myinheritance.interfaces.IEmployee;

public class EmployedCustomer extends Person implements ICustomer, IEmployee {

    private int yearlyTurnover;
    private String department;
    private int yearlySalary;

    public EmployedCustomer(String name, String firstName, String address, String town, String postcode, int yearlyTurnover, String department, int yearlySalary) {
        super(name, firstName, address, town, postcode);
        this.yearlyTurnover = yearlyTurnover;
        this.department = department;
        this.yearlySalary = yearlySalary;
    }

    @Override
    public int getYearlyTurnover() {
        return yearlyTurnover;
    }

    @Override
    public void setYearlyTurnover(int yearlyTurnover) {
        this.yearlyTurnover = yearlyTurnover;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int getYearlySalary() {
        return yearlySalary;
    }

    @Override
    public void setYearlySalary(int yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
}
