package Part9;

public class Main0002 {
    public static void main(String[] args) {
        // here you can write code to test your classes
        // ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        // juice.addToWarehouse(1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // System.out.println(juice);           // balance = 988.7, space left 11.3

        // ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        // juice.addToWarehouse(1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // juice.addToWarehouse(1.0);
        // System.out.println(juice);           // Juice: balance = 989.7, space left 10.299999999999955

        // the usual:
        // ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // juice.addToWarehouse(1.0);
        // System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

        // // etc

        // // however, history() still doesn't work properly:
        // System.out.println(juice.history()); // [1000.0]
        // so we only get the initial state of the history set by the constructor... 
        // ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        // juice.takeFromWarehouse(11.3);
        // juice.addToWarehouse(1.0);
        // //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        // juice.printAnalysis();
        ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee",10,5); 
        pwh.takeFromWarehouse(7);
        pwh.printAnalysis();
    }
}
