import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> container;

    public StorageFacility() {
        this.container = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.container.putIfAbsent(unit, new ArrayList<>());
        this.container.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.container.containsKey(storageUnit)) {
            return this.container.get(storageUnit);
        } else {
            return new ArrayList<String>();
        }
    }

    public void remove(String storageUnit, String item) {
        if (this.container.containsKey(storageUnit)) {
            this.container.get(storageUnit).remove(item);
        }
        if (this.container.get(storageUnit).size() == 0) {
            this.container.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> allUnits = new ArrayList<>();
        for (String storageUnit: this.container.keySet()) {
            allUnits.add(storageUnit);
        }
        return allUnits;   
    }
}
