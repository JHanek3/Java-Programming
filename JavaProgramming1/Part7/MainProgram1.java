
import java.util.Scanner;

public class MainProgram1 {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Birds list = new Birds();
        Scanner scanner = new Scanner(System.in);
        UserInterface03 ui = new UserInterface03(list, scanner);
        ui.start();
        // Birds list = new Birds();
        // Bird myBird = new Bird("Crow", "Corvus Corvus");
        // list.add(myBird);
        // Bird myBird1 = new Bird("Hawk", "Dorkus Dorkus");
        // list.add(myBird1);
        // list.observedList(myBird1.getName());
        // list.observedList("Lion");
        // list.observedList(myBird1.getName());
        // list.printBirds();
        // list.printBird(myBird1.getName());
        // Bird myBird2 = new Bird("Phoenix", "Fire Bird");
        // list.add(myBird2);
        // list.observedList(myBird2.getName());
        // list.printBirds();
    }

}
