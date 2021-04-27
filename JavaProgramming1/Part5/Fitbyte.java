public class Fitbyte {
    private int age;
    private int rhr;

    public Fitbyte(int age, int rhr) {
        this.age = age;
        this.rhr = rhr;
    }

    double targetHeartRate(double percentageOfMaximum) {
        return ((maximumHeartRate() - this.rhr) * (percentageOfMaximum) + this.rhr);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * age);
    }
    
}
