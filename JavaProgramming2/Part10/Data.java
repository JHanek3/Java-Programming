package Part10;

public class Data implements Comparable<Data> {
    private String location;
    private Integer year;
    private String sex;
    private Float rate;

    public Data(String location, Integer year, String sex, Float rate){
        this.location = location;
        this.year = year;
        this.sex = sex;
        this.rate = rate;
    }

    public float getRate() {
        return this.rate;
    }

    @Override
    public String toString() {
        return String.format("%s (%d), %s, ", this.location, this.year, this.sex) + this.rate;
    }

    @Override
    public int compareTo(Data data) {
        if (this.rate == data.getRate()) {
            return 0;
        } else if (this.rate > data.getRate()) {
            return 1;
        } else {
            return -1;
        }
    }
}
