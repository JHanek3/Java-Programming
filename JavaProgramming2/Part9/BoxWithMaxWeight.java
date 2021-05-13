package Part9;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();

    }

    public int getWeight() {
        int sum = 0;
        for (Item item: items) {
            sum += item.getWeight();
        }
        return sum;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + getWeight() <= capacity) {
            this.items.add(item);
        }
    }

    @Override 
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}