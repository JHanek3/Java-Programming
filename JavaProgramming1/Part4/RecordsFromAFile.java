
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name of the file: ");
        String file = scanner.nextLine();
        
        try (Scanner scanner1 = new Scanner(Paths.get(file))) {
            while (scanner1.hasNextLine()) {
                String row = scanner1.nextLine();
                String[] parts = row.split(",");
                System.out.println(String.format("%s, age: %d years", parts[0], Integer.valueOf(parts[1])));
            }
             
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
