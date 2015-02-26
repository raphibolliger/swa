package kw8.persondata.myinheritance;

import kw8.persondata.myinheritance.interfaces.ISupplier;

public class Supplier extends Person implements ISupplier {

    private int qualityRating;

    public Supplier(String name, String firstName, String address, String town, String postcode, int qualityRating) {
        super(name, firstName, address, town, postcode);
        this.qualityRating = qualityRating;
    }

    @Override
    public int getQualityRating() {
        return qualityRating;
    }

    @Override
    public void setQualityRating(int qualityRating) {
        this.qualityRating = qualityRating;
    }
}
