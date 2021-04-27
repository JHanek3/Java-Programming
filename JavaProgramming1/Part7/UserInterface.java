import java.util.Scanner;

public class UserInterface {
    private Points points;
    private Scanner scanner;

    public UserInterface(Points points, Scanner scanner) {
        this.points = points;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            } else {
                if (number > 0 && number <= 100) {
                    points.addPoints(number);
                }
            }

        }
        System.out.println(points.getAverage());
        System.out.println(points.getPassingAverage());
        System.out.println(points.getPassPercentage());
        points.getGradeDistribution();
    }
}
