
import java.util.HashMap;

public class Program001 {

    public static void printValues(HashMap<String, Book000> hashmap) {
        for (Book000 book: hashmap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book000> hashmap, String text) {
        for (Book000 book: hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book000> hashmap = new HashMap<>();
        hashmap.put("sense", new Book000("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book000("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

}
