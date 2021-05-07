import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList00 list = new TodoList00();
        Scanner scanner = new Scanner(System.in);

        UserInterface000 ui = new UserInterface000(list, scanner);
        ui.start();

    }
}

