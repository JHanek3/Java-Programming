
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int containerOne = 0;
        int containerTwo = 0;
        String maxLiter = "/100";
        while (true) {
            System.out.println(String.format("First: %d%s", containerOne, maxLiter));
            System.out.println(String.format("Second: %d%s", containerTwo, maxLiter));

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
                
                if (value > 0) {
                    if (value + containerOne >= 100) {
                        containerOne = 100;
                    } else {
                        containerOne += value;
                    }
                }
            } else if (command.equals("move")) {
                
                
                if (value > 0) {
                    if (value > containerOne) {
        
                        containerTwo += containerOne;
                        containerOne = 0;                    
                    } else {
                    
                        containerOne -= value;
                        containerTwo += value;
                    }

                    if (containerTwo > 100) {                    
                        containerTwo = 100;
                    }
                }
            } else if (command.equals("remove")) {

                if (value > 0) {
                    containerTwo -= value;
                    if (containerTwo < 0) {
                        containerTwo = 0;
                    }
                }
            }
        }
    }

}
