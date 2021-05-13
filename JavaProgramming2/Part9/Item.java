package Part9;


public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object comparedObject) {
        // located in same place?
        if (this == comparedObject) {
            return true;
        }

        // typeOf
        if (!(comparedObject instanceof Item)) {
            return false;
        }

        // convert object to an item
        Item comparedItem = (Item) comparedObject;

        if (this.name.equals(comparedItem.name)) {
                return true;
            } else {
                return false;
            }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}

