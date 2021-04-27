import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = Integer.valueOf(scanner.nextLine());
        int value2 = Integer.valueOf(scanner.nextLine());
        System.out.println((int)(Math.sqrt(value1 + value2)));
    }
}
