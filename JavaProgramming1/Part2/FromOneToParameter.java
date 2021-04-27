

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int args) {
        int i = 1;
        while (i <= args) {
            System.out.println(i);
            i++;
        }
    }

}
