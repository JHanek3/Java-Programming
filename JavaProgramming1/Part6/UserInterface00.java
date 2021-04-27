import java.util.Scanner;

public class UserInterface00 {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface00(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.contains("stop")) {
                break;

            } else if (command.contains("add")) {
                
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
                
            } else if (command.contains("list")) {
                
                todoList.print();

            } else if (command.contains("remove")) {
                
                System.out.print("Which one is removed? ");
                int removedIndex = Integer.valueOf(scanner.nextLine());
                todoList.remove(removedIndex);
            
            } else {
                
                System.out.println("Unknown Commmand");
            }
        }
    }
}
