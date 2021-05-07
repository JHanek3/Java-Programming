
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    public boolean equals(Object comparedObject) {
        // located in the same place, they are the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not typeOf simpledate, false
        if (!(comparedObject instanceof SimpleDate)) {
            return false;
        }

        // convert the object to a simple date object and compare the values
        // if the instance of variables are the same so are the objects
        SimpleDate comparedDate = (SimpleDate) comparedObject;

        if (this.day == comparedDate.day &&
            this.month == comparedDate.month &&
            this.year == comparedDate.year) {
                return true;
        } else {
            return false;
        }

    }

    // calculates a hash for the SimpleDate object, implement a calculation of the hash in a way that there are as few similar hashsed as possible for the years between 1900 and 2100
    public int hashCode() {
        return this.year + this.month + this.day;
    }

}
