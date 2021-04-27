
import java.time.Year;
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int input = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;

        while (input != -1) {
            sum += input;
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            input = Integer.valueOf(scanner.nextLine());
            numbers++;

        }

        System.out.println("Thx! Bye!");
        System.out.println(String.format("Sum: %d", sum));
        System.out.println(String.format("Numbers: %d", numbers));
        System.out.println(String.format("Average: " + (1.0 * sum / numbers)));
        System.out.println(String.format("Even: %d", even));
        System.out.println(String.format("Odd: %d", odd));

    }
}
