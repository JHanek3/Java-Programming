public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object comparedObject) {
        // located in the same place, they are the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not typeOf simpledate, false
        if (!(comparedObject instanceof LicensePlate)) {
            return false;
        }

        // convert the object to a simple date object and compare the values
        // if the instance of variables are the same so are the objects
        LicensePlate comparedPlate = (LicensePlate) comparedObject;

        if (this.liNumber.equals(comparedPlate.liNumber) &&
            this.country.equals(comparedPlate.country)) {
                return true;
        } else {
            return false;
        }

    }

    public int hashCode() {
        if (this.liNumber == null) {
            return this.country.hashCode();
        }
        return this.liNumber.hashCode() + this.country.hashCode();
    }
    

}
