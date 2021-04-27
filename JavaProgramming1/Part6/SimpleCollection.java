
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        int length = this.elements.get(0).length();
        String longest = this.elements.get(0);

        for (String item: this.elements) {
            if (item.length() > length) {
                length = item.length();
                longest = item;
            }
        }
        return longest;
    }

    @Override
    public String toString() {
        if (elements.size() == 0) {
            return String.format("The collection %s is empty", this.name);
        } else {
            int collectionLength = elements.size();
            String output2 = "";
            for (String element: elements) {
                output2 += "\n" + element;
            }
            if (collectionLength == 1) {
                String output1 = String.format("The collection %s has %d element:", this.name, collectionLength);
                return output1 + output2;
            } else {
                String output1 = String.format("The collection %s has %d elements:", this.name, collectionLength);
                return output1 + output2;
            }
        }
    }
    
}
