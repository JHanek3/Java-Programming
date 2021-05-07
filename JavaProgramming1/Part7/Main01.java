
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        Points list = new Points();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}

// 83, 97, 61, 16, 8, 63, 45, 0, -1