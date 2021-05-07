import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleHash;

    public VehicleRegistry() {
        this.vehicleHash = new HashMap<LicensePlate, String>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicleHash.containsKey(licensePlate)) {
            return false;
        } else {
            vehicleHash.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate) {
        for (LicensePlate key: vehicleHash.keySet()) {
            if (key.equals(licensePlate)) {
                return vehicleHash.get(key);
            }
        }
        return null;
    }   

    public boolean remove(LicensePlate licensePlate) {
        for (LicensePlate key: vehicleHash.keySet()) {
            if (key.equals(licensePlate)) {
                vehicleHash.remove(key);
                return true;
            }
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate key: vehicleHash.keySet()) {
            System.out.println(key);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<String>();
        for (String owner: vehicleHash.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }

    
}
