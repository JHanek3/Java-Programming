
import java.util.Scanner;

public class Main000 {

    public static void main(String[] args) {

        // TodoList list = new TodoList();
        // list.add("read the course material");
        // list.add("watch the latest fool us");
        // list.add("take it easy");

        // list.print();
        // list.remove(2);

        // System.out.println();
        // list.print();
        // TodoList list = new TodoList();
        // list.add("read the course material");
        // list.add("watch the latest fool us");
        // list.add("take it easy");
        // list.print();
        // list.remove(2);
        // list.print();
        // list.add("buy rasins");
        // list.print();
        // list.remove(1);
        // list.remove(1);
        // list.print();
        // Here you can try out the combined functionality of your classes
        TodoList00 list = new TodoList00();
        Scanner scanner = new Scanner(System.in);

        UserInterface000 ui = new UserInterface000(list, scanner);
        ui.start();

    }
}