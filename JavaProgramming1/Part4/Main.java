import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication Year: ");
            int year = Integer.valueOf(scanner.nextLine());

            bookCollection.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        
        for (Book book: bookCollection ) {
            if (info.equals("everything")) {
                System.out.println(book);
            }
            if (info.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }

}
