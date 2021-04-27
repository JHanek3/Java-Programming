
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputs = 0;
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value != 0) {
                numInputs +=1;
            } else {
                break;
            }
        }
        System.out.println(String.format("Number of numbers: %d", numInputs));
    }
}
