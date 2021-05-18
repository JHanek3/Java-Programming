package Part10;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Data> fin = new ArrayList<>();
        try {
            Files.lines(Paths.get("C:/Users/Jon/Desktop/helsinki/java/JavaProgramming2/Part10/literacy.csv"))
                .map(row -> row.split(","))
                .map(parts -> new Data(parts[3].trim(), Integer.valueOf(parts[4].trim()), parts[2].trim().split(" ")[0], Float.valueOf(parts[5])))
                .forEach(data -> fin.add(data));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // System.out.println(fin);
        Collections.sort(fin);
        for (Data data: fin) {
            System.out.println(data);
        }
    }
}

