package kw8.persondata.myinheritance;

import kw8.persondata.myinheritance.interfaces.IEmployee;

public class Employee extends Person implements IEmployee {

    private String department;
    private int yearlySalary;

    public Employee(String name, String firstName, String address, String town, String postcode, String department, int yearlySalary) {
        super(name, firstName, address, town, postcode);
        this.department = department;
        this.yearlySalary = yearlySalary;
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
