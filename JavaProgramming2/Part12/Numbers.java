import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("How many numbers should be printed?");
        int input = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            System.out.println(randomGenerator.nextInt(11));
        } 
    }

}
