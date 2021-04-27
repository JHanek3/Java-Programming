import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface00 ui = new UserInterface00(list, scanner);
        ui.start();

    }
}

