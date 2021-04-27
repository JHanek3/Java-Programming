
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int longest = 0;
        String name = "";
        int sum = 0;
        int count = 0;
        
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
        
            String[] parts = input.split(",");
            if (longest < parts[0].length()) {
                longest = parts[0].length();
                name = parts[0];
            }
            sum += Integer.valueOf(parts[1]);
            count += 1;
        }
        System.out.println(String.format("Longest name: %s" , name));
        System.out.println("Average of birth years: " + (1.0 * sum / count));
    }
}
