
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();
        // register.addGradeBasedOnPoints(93);
        // register.addGradeBasedOnPoints(91);
        // register.addGradeBasedOnPoints(92);
        // register.addGradeBasedOnPoints(88);

        // System.out.println(register.averageOfGrades());

        // register.addGradeBasedOnPoints(93);
        // register.addGradeBasedOnPoints(91);
        // register.addGradeBasedOnPoints(92);

        // System.out.println(register.averageOfPoints());
        UserInterface2 ui = new UserInterface2(register, scanner);
        ui.start();
    }
}
