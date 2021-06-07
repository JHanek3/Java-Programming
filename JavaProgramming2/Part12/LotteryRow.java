import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        this.random = new Random();
        this.numbers = new ArrayList<>();
        this.randomizeNumbers();
        
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        // Tests whether the number is already among the randomized numbers
        return this.numbers.contains(number);
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the randomization of the numbers by using the method containsNumber() here
        int iterator = 0;
        while (iterator < 7) {
            int drawnNumber = random.nextInt(40) + 1;
            if (!(containsNumber(drawnNumber))) {
                this.numbers.add(drawnNumber);
                iterator++;
            }
        }
    }

    public boolean equals(Object other) {
        return false;
    }
}
