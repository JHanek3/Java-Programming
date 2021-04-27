
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> figures = new ArrayList<Archive>();
        ArrayList<Archive> noDuplicateFigures = new ArrayList<Archive>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            Archive figure = new Archive(identifier, name);
            if (!noDuplicateFigures.contains(figure)) {
                noDuplicateFigures.add(figure);
            }
            // figures.add(figure);
        }
        
        System.out.println("==Items==");
        for (Archive figure: noDuplicateFigures) {
            System.out.println(figure);
        }


    }
}
