
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();
        
        while (true) {
            System.out.println(String.format("First: %s", containerOne));
            System.out.println(String.format("Second: %s", containerTwo));

            String input = scan.nextLine();
            String command = "";
            int value = 0;

            if (!input.equals("quit")) {
                String[] splitStr = input.split(" ", 2);
                command = splitStr[0];
                value = Integer.valueOf(splitStr[1]);
            }

            if (input.equals("quit")) {
                break;

            } else if (command.equals("add")) {
                containerOne.add(value);
                
            } else if (command.equals("move")) {
                if (value > containerOne.contains()) {
                    containerTwo.add(containerOne.contains());
                    
                } else {
                    
                    containerTwo.add(value);
                }
                containerOne.remove(value);

            } else if (command.equals("remove")) {
                containerTwo.remove(value);
            }
        }
    }

}
