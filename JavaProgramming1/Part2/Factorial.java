
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int value = Integer.valueOf(scanner.next());
        int prod = 1;
        for (int i = 1; i <= value; i++) {
            prod *= i;
        }
        System.out.println(String.format("Factorial %d", prod));


    }
}
