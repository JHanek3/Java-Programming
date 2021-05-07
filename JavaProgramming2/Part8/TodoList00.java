import java.util.*;

public class TodoList00 {
    private ArrayList<String> tasks;
    
    public TodoList00() {
        this.tasks = new ArrayList<String>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        int iterator = 1;
        for (String task: tasks) {
            System.out.println(String.format("%d: %s", iterator, task));
            iterator++;
        }
    }

    public void remove(int number) {
        tasks.remove(number - 1);
    }

}
