package Part9;
import java.util.ArrayList;

public class Box01 implements Packable {
    private double maximumCapacity;
    // private double weight;
    private ArrayList<Packable> contents;

    public Box01(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        // this.weight = 0;
        this.contents = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        for (Packable content: contents) {
            weight += content.weight();
        }
        return weight;
    }

    public void add(Packable packable) {
        if (weight() + packable.weight() <= this.maximumCapacity) {
            this.contents.add(packable);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.contents.size() + " items, total weight " + weight() + " kg";
    }
    
}
