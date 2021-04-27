import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value != 0) {
                sum += value;
            } else {
                break;
            }
        }
        System.out.println(String.format("Sum of the numbers: %d", sum));
    }
    
}
