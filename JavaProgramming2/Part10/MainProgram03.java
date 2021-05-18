package Part10;

import java.util.Scanner;

public class MainProgram03 {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scanner = new Scanner(System.in);
        Checker check = new Checker();

        // System.out.print("Enter a string: ");
        // String input = scanner.nextLine();
        // check.isDayOfWeek(input);
        // check.allVowels(input);
        String input = "00:00:00";
        String input01 = "09:30:59";
        String input02 = "14:25:30";
        String input03 = "33:33:33";
        String input04 = "23:61:23";
        check.timeOfDay(input);
        check.timeOfDay(input01);
        check.timeOfDay(input02);
        check.timeOfDay(input03);
        check.timeOfDay(input04);
        scanner.close();


    }

    
}

