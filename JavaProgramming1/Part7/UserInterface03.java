import java.util.Scanner;
import java.util.*;

public class UserInterface03 {
    private Birds birdList;
    private Scanner scanner;

    public UserInterface03 (Birds birdList, Scanner scanner) {
        this.birdList = birdList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.contains("Quit")) {
                break;
            } else if (command.contains("Add")) {

                System.out.print("Name: ");
                String birdName = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String birdNameLatin = scanner.nextLine();

                Bird bird = new Bird(birdName, birdNameLatin);
                birdList.add(bird);
            
            } else if (command.contains("Observation")) {
                
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                birdList.observedList(birdName);
                
            } else if (command.contains("All")) {

                birdList.printBirds();
            
            } else if (command.contains("One")) {
                
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                birdList.printBird(birdName);



            } else {
                System.out.println("Unknown command");
            }
        }
    }
}



