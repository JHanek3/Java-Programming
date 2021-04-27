
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int value = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= value; i++) {
            sum += i;
        }
        System.out.println(String.format("The sum is %d", sum));
    }
}
