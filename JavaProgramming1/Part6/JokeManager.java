import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        int min = 0;
        int max = this.jokes.size();
        int randomNum = ThreadLocalRandom.current().nextInt(min, max);
        return this.jokes.get(randomNum);
    }

    public void printJokes() {
        for (String joke: jokes) {
            System.out.println(joke);
        }
    }
}
