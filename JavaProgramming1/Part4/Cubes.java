
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        String input = scanner.nextLine();
        while (!input.contains("end")) {
                System.out.println(String.format("%d", (Integer.valueOf(input) * Integer.valueOf(input) * Integer.valueOf(input) )));
                input = scanner.nextLine();
            }
    }
}
