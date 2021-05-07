import java.util.Scanner;

public class UserInterface000 {
    private TodoList00 tasks;
    private Scanner scanner;

    public UserInterface000(TodoList00 tasks, Scanner scanner) {
        this.tasks = tasks;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                tasks.add(task);
            } else if (command.equals("list")) {
                tasks.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int removed = Integer.valueOf(scanner.nextLine());
                tasks.remove(removed);
            }
        }
    }
}