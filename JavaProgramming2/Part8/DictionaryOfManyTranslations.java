import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        // an empty list added to the new word
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        //retrieve the list containting the translated words, and add to it
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else {
            return new ArrayList<String>();
        }
    }

    public void remove(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.get(word).clear();
        }
    }
}
