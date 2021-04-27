
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> stats = new ArrayList<String>();

        System.out.print("File: ");
        String file = scan.nextLine();
        
        try (Scanner scanner1 = new Scanner(Paths.get(file))) {
            while (scanner1.hasNextLine()) {
                String row = scanner1.nextLine();
                stats.add(row);
            }
             
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int win = 0;
        int lose = 0;
        for (int i = 0; i < stats.size(); i++) {
            String line = stats.get(i);
            String[] split = line.split(",");
            if (split[0].contains(team) || split[1].contains(team)) {
                games++;
                if (split[0].contains(team) && Integer.valueOf(split[2]) > Integer.valueOf(split[3])) {
                    win++;
                } else if (split[1].contains(team) && Integer.valueOf(split[3]) > Integer.valueOf(split[2])) {
                    win++;
                } else {
                    lose++;
                }
            }
        }
        System.out.println(String.format("Games: %d", games));
        System.out.println(String.format("Wins: %d", win));
        System.out.println(String.format("Losses: %d", lose));
    }

}
