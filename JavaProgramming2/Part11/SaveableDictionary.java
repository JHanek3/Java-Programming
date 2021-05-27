import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.nio.file.Paths;
 import java.io.*; 

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private HashMap<String, String> backwards;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.backwards = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
                this.dictionary = new HashMap<>();
                this.backwards = new HashMap<>();
                while (fileReader.hasNextLine()) {
                    String line = fileReader.nextLine();
                    String[] parts = line.split(":");
                    this.dictionary.put(parts[0], parts[1]);
                    this.backwards.put(parts[1], parts[0]);
    
                }
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }

    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(file));
            this.dictionary.forEach((k,v) -> writer.write(String.format("%s:%s\n", k, v)));
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;

    }


    public void add(String words, String translation) {
        if (!(this.dictionary.containsKey(words))) {
            this.dictionary.put(words, translation);
            this.backwards.put(translation, words);
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else if (this.backwards.containsKey(word)) {
            return this.backwards.get(word);
        } else {
            return null;
        }
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.backwards.remove(this.dictionary.get(word));
            this.dictionary.remove(word);
        }

        if (this.backwards.containsKey(word)) {
            this.dictionary.remove(this.backwards.get(word));
            this.backwards.remove(word);
        }
    }
}
