
import java.util.ArrayList;
import java.util.HashMap;


public class Main003 {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("Finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
        
        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
        System.out.println("----------------");
        VehicleRegistry test00 = new VehicleRegistry();
        test00.add(li1, "Arto");
        System.out.println(test00.get(li1));
        System.out.println("----------------");
        test00.add(li1, "Jürgen");
        System.out.println(test00.get(li1));
        System.out.println("----------------");
        test00.add(li3, "Jürgen");
        System.out.println(test00.get(li3));
        test00.remove(li3);
        System.out.println(test00.get(li3));
        System.out.println("----------------");
        test00.add(li3, "Jürgen");
        test00.printLicensePlates();
        System.out.println("----------------");
        test00.add(li2, "Jürgen");
        test00.printOwners();

        // test00.add(li1, "Jürgen");
        // System.out.println(test00.get(li1));

    }
}
