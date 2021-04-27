import java.util.Scanner;

public class UserInterface3 {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface3(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            if (command.contains("X")) {
                break;
            } else if (command.contains("1")) {
                
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);

            } else if (command.contains("2")) {

                System.out.println(jokeManager.drawJoke());
            
            } else if (command.contains("3")) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
