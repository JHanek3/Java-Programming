
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
        
            String[] parts = input.split(",");
            if (oldest < Integer.valueOf(parts[1])) {
                oldest = Integer.valueOf(parts[1]);
                name = parts[0];
            }
        }
        System.out.println(String.format("Name of the oldest: %s" , name));
    }
}
        
