import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Suitcase> elements;


    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.elements = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.elements.size() == 0) {
            this.elements.add(suitcase);
            this.currentWeight += suitcase.getWeight();
        } else if (this.currentWeight + suitcase.getWeight() <= this.maxWeight) {
            this.elements.add(suitcase);
            this.currentWeight += suitcase.getWeight();
        }
    }

    public void printItems() {
        for (Suitcase element: elements) {
            element.printItems();
        }
    }

    @Override
    public String toString() {
        return String.format("%d suitcases (%d kg)", this.elements.size(), this.currentWeight);
    }

}
