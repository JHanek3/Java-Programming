import java.util.Arrays;
public class MainProgram {
    
    public static void main(String[] args) {
        // int[] numbers = {6, 5, 8, 7, 11};
        // System.out.println("Smallest: " + MainProgram.smallest(numbers));
        // System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        
        int[] numbers1 = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers1, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers1, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers1, 2));

        int[] numbers4 = {-1, 3, 1, 7, 4, 5, 2, 4, 3};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers4, 7));

        // int[] numbers2 = {3, 2, 5, 4, 8};

        // System.out.println(Arrays.toString(numbers2));

        // MainProgram.swap(numbers2, 1, 0);
        // System.out.println(Arrays.toString(numbers2));

        // MainProgram.swap(numbers2, 0, 3);
        // System.out.println(Arrays.toString(numbers2));

        // int[] numbers3 = {8, 3, 7, 9, 1, 2, 4};
        // MainProgram.sort(numbers3);

    }    
    
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number: array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int iterator = 0;
        int index = 0;

        for (int number: array) {
            if (number == smallest) {
                index =  iterator;
            }
            iterator++;

        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int[] smallerArray = new int[table.length - startIndex];
        int iterator = 0;
        for (int i = startIndex; i < table.length; i++) {
            smallerArray[iterator] = table[i];
            iterator++;
        }

        int smallestIndex = indexOfSmallest(smallerArray);

        return smallestIndex + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int holder = array[index1];
        array[index1] = array[index2];
        array[index2] = holder;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfSmallestFrom(array, i), i);
            System.out.println(Arrays.toString(array));
        }
    }
}
