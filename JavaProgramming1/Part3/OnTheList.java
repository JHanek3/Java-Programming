
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.print("Search for? ");
        String name = scanner.nextLine();
        if (list.contains(name)) {
            System.out.println(String.format("%s was found!", name));
        } else {
            System.out.println(String.format("%s was not found!", name));
        }

    }
}
