package Part10;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


public class MainProgram02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BookInput> books = new ArrayList<>();
        
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                System.out.print("Input the age recommendation: ");
                int age = Integer.valueOf(scanner.nextLine());
                books.add(new BookInput(input, age));
            }
        }

        // books.add(new BookInput("The Ringing Lullaby Book", 0));
        // books.add(new BookInput("The Exiting Transpotation Vehicles", 0));
        // books.add(new BookInput("The Snowy Forest Calls", 12));
        // books.add(new BookInput("Litmanen 10", 10));
        System.out.println("");
        System.out.println(String.format("%d books in total.", books.size()));
        System.out.println("");
        
        Comparator<BookInput> comparator = Comparator
            .comparing(BookInput::getAgeRange)
            .thenComparing(BookInput::getTitle);
        
        Collections.sort(books, comparator);

        System.out.println("Books: ");
        for (BookInput book: books) {
            System.out.println(book);
        }
        scanner.close();
    }
}
