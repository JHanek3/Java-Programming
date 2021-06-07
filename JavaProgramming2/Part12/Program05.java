import java.util.ArrayList;
public class Program05 {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(5));
        int[][] test1 = {
            {8,1,6},
            {3,5,7},
            {4,9,2},
        };
        int[][] test2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.println(sumsOfRows(test1));
        System.out.println(sumsOfColumns(test1));
        System.out.println(sumsOfDiagonals(test1));
        System.out.println(sumsOfRows(test2));
        System.out.println(sumsOfColumns(test2));
        System.out.println(sumsOfDiagonals(test2));
        
        
        
    }
    public static ArrayList<Integer> sumsOfRows(int[][] array) {
        ArrayList<Integer> sumOfRows = new ArrayList<>();
        for (int row = 0; row < array.length; row++) {
            int sum = 0;
            for (int col = 0; col < array[row].length; col++) {
                sum += array[row][col];
            }
        sumOfRows.add(sum);
        }
        return sumOfRows;
    }
    
    public static ArrayList<Integer> sumsOfColumns(int[][] array) {
        ArrayList<Integer> sumOfColumns = new ArrayList<>();
        for (int col = 0; col < array.length; col++) {
            int sum = 0;
            for (int row = 0; row < array[col].length; row++) {
                sum+= array[row][col];
            }
            sumOfColumns.add(sum);
        }
        return sumOfColumns;
    }
    
    public static ArrayList<Integer> sumsOfDiagonals(int[][] array) {
        ArrayList<Integer> sumOfDiagonals = new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i][i];
        }
        for (int i = array.length; i > 0; i--) {
            sum2 += array[Math.abs(i - array.length)][i - 1]; 
        }
        sumOfDiagonals.add(sum1);
        sumOfDiagonals.add(sum2);
        return sumOfDiagonals;
    }
}
