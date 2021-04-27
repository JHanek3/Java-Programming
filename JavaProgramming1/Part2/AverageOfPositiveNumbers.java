
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputs = 0;
        int sum = 0;
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value > 0) {
                sum += value;
                numInputs += 1;
            } else if (value == 0) {
                break;
            } else {
                continue;
            }
        }
        if (numInputs > 0) {
            System.out.println((1.0 * sum / numInputs));
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
