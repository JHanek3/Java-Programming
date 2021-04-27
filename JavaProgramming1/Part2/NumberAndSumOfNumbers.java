
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputs = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value != 0) {
                sum += value;
                numInputs += 1;
            } else {
                break;
            }
        }
        System.out.println(String.format("Number of numbers: %d\nSum of the numbers: %d", numInputs, sum));
    }
}
