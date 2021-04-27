import java.util.Scanner;

public class TextUI {
    private SimpleDictionary wordSet;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.wordSet = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.contains("end")) {
                break;

            } else if (command.contains("add")) {

                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                wordSet.add(word, translation);

            }   else if (command.contains("search")) {
                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();

                if (wordSet.translate(toBeTranslated) != null) {
                    System.out.println(String.format("Translation: %s", wordSet.translate(toBeTranslated)));
                } else {
                    System.out.println(String.format("Word %s was not found", toBeTranslated));
                }

            } else {
                System.out.println("Unknown command");
            }
        
        }
        System.out.println("Bye bye!");

    }
    
}
