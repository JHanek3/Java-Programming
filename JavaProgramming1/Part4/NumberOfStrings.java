
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<String>();
        
        String input = scanner.nextLine();
        while (!input.contains("end")) {
            strList.add(input);
            input = scanner.nextLine();
        }
        System.out.println(strList.size());

    }
}
