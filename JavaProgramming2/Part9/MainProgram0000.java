package Part9;
import java.util.ArrayList;
import java.util.List;


public class MainProgram0000 {

    public static void main(String[] args) {
        // test your method here

        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");
        System.out.println(returnSize(names));
    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    public static int returnSize(List<String> list) {
        return list.size();
    }
}

