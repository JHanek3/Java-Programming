

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int arg) {
        int i = 1;
        while (arg >= i) {
            System.out.println(arg);
            arg--;
        }
    }

}
