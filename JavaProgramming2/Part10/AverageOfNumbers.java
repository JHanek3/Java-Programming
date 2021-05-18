package Part10;


import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myCollection = new ArrayList<>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            myCollection.add(input);
        }

        //process the average
        double average = myCollection.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();
        
        System.out.println("average of the numbers: " + average);
        
        scanner.close();
    }
}

