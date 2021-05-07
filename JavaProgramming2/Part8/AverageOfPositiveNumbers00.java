
import java.util.Scanner;

public class AverageOfPositiveNumbers00 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        double sum = 0;

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("0")) {
                break;
            } else {
                if (Integer.valueOf(command) > 0) {
                    sum += Integer.valueOf(command);
                    numbers++;
                }
            }
        }
        if (sum > 0) {
            double average = sum * 1.0 / numbers;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
