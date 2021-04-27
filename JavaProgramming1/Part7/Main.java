import java.util.*;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        // int[] array = {3, 1, 5, 99, 3, 12};
        // sort(array);
        // String[] array1 = {"b", "c", "a", "z", "j"};
        // sort(array1);
        // ArrayList<Integer> array2 = new ArrayList<Integer>();
        // array2.add(1);
        // array2.add(4);
        // array2.add(3);
        // sortIntegers(array2);
        // ArrayList<String> array3 = new ArrayList<String>();
        // array3.add("c");
        // array3.add("b");
        // array3.add("a");
        // sortStrings(array3);
        int[] t = {2, 1, 3, 0};
        sort(t);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        // System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
        // System.out.println(stringList);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        // System.out.println(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
        // System.out.println(strings);
    }

}
