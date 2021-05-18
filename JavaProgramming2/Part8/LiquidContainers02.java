
import java.util.Scanner;

public class LiquidContainers02 {

    public static void main(String[] args) {
        // Container container = new Container();
        // System.out.println(container);

        // container.add(50);
        // System.out.println(container);
        // System.out.println(container.contains());

        // container.remove(60);
        // System.out.println(container);

        // container.add(200);
        // System.out.println(container);
        Scanner scan = new Scanner(System.in);

        Container01 container1 = new Container01();
        Container01 container2 = new Container01();

        while (true) {
            System.out.println(String.format("First: %s", container1.toString()));
            System.out.println(String.format("Second: %s", container2.toString()));            

            String input = scan.nextLine();
            String[] splited = input.split(" ");

            if (input.equals("quit")) {
                break;
            
            } else if (splited[0].equals("add")) {
                container1.add(Integer.valueOf(splited[1]));
            
            } else if (splited[0].equals("move")) {
                if (container1.contains() > 0) {
                    if (container1.contains() < Integer.valueOf(splited[1])) {
                        container2.add(container1.contains());
                        container1.remove(Integer.valueOf(splited[1]));
                    } else {
                        container1.remove(Integer.valueOf(splited[1]));
                        container2.add(Integer.valueOf(splited[1]));
                    }
                }
                // container1.remove(Integer.valueOf(splited[1]));
                // container2.add(Integer.valueOf(splited[1]));
            
            } else if (splited[0].equals("remove")) {
                container2.remove(Integer.valueOf(splited[1]));
            }

        }
        scan.close();
    }

}
