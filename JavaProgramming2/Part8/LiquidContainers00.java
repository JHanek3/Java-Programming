
import java.util.Scanner;

public class LiquidContainers00 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int liquid1 = 0;
        int liquid2 = 0;

        while (true) {
            System.out.println(String.format("First: %d/100", liquid1));
            System.out.println(String.format("Second: %d/100", liquid2));


            String input = scan.nextLine();
            String[] splited = input.split(" ");

            if (input.equals("quit")) {
                
                break;
            
            } else if (splited[0].equals("add")) {
                
                int value = Integer.valueOf(splited[1]);
                if (value > 0) {
                    if (value + liquid1 > 100) {
                        liquid1 = 100;
                    } else {
                        liquid1 += value;
                    }
                }
               
            } else if (splited[0].equals("move")) {

                int value = Integer.valueOf(splited[1]);
                if (value > 0) {
                    if (value <= liquid1) {
                        liquid1 -= value;
                        if (value + liquid2 > 100) {
                            liquid2 = 100;
                        } else {
                            liquid2 += value;
                        }
                    } else {
                        if (liquid1 + liquid2 > 100) {
                            liquid2 = 100;
                        } else {
                            liquid2 += liquid1;
                        }
                        liquid1 = 0;
                    }
                }
            } else if (splited[0].equals("remove")) {

                int value = Integer.valueOf(splited[1]);
                if (value > 0) {
                    if (value <= liquid2) {
                        liquid2 -= value;
                    } else {
                        liquid2 = 0;
                    }
                }
            }
        }
        scan.close();
    }

}
