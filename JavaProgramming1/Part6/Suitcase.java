import java.util.ArrayList;

public class Suitcase {
    private int currentWeight = 0;
    private int maxWeight;
    private ArrayList<Item> elements;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.elements = new ArrayList<>();
    }

    public int getWeight() {
        return this.currentWeight;
    }

    public ArrayList<Item> getItems() {
        return this.elements;
    }

    public void addItem(Item item) {
        if (this.elements.size() == 0) {
            this.elements.add(item);
            this.currentWeight += item.getWeight();
        } else if (this.currentWeight + item.getWeight()  <= this.maxWeight) {
            this.elements.add(item);
            this.currentWeight += item.getWeight();
        }
    }

    public void printItems() {
        for (Item element: elements) {
            System.out.println(String.format("%s (%d kg)", element.getName(), element.getWeight()));
        }
    }

    public Item heaviestItem() {
        if (elements.isEmpty()) {
            return null;
        }

        Item heaviestObj = this.elements.get(0);
        int heaviestInt = this.elements.get(0).getWeight();
        for (Item element: elements) {
            if (element.getWeight() > heaviestInt) {
                heaviestObj = element;
                heaviestInt = element.getWeight();
            }
        }
        return heaviestObj;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item element:elements) {
            totalWeight += element.getWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        if (this.elements.size() == 0) {
            return "no items (0 kg)";
        } else if (this.elements.size() == 1) {
            return String.format("%d item (%d kg)", this.elements.size(), this.currentWeight);
        } else {
            return String.format("%d items (%d kg)", this.elements.size(), this.currentWeight);
        }
    }


}
