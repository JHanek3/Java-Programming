
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int value1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int value2 = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        for (int i = value1; i <= value2; i++) {
            sum += i;
        }
        
        System.out.println(String.format("The sum is %d", sum));
    }
}
