
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = Integer.valueOf(scanner.nextLine());
        int value2 = Integer.valueOf(scanner.nextLine());
        if (value1 > value2) {
            System.out.println(String.format("%d is greater than %d.", value1, value2));
        } else if (value1 < value2) {
            System.out.println(String.format("%d is smaller than %d.", value1, value2));
        } else {
            System.out.println(String.format("%d is equal to %d.", value1, value2));
        }
    }
}
