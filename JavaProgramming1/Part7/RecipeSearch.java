
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class RecipeSearch {

    public static void main(String[] args) throws IOException{
        RecipeList list = new RecipeList();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        String file = "C:\\Users\\Jon\\Desktop\\helsinki\\java\\JavaProgramming1\\Part7\\" + fileName;
        
        FileWriter fw = new FileWriter(file, true);
        fw.append(System.lineSeparator());
        fw.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String curLine;
        String name = "";
        int cookingTime = 0;
        ArrayList<String> ingredients = new ArrayList<String>();

        while ((curLine = bufferedReader.readLine()) != null){
            //process the line as required


            if (curLine.equals("")) {
                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                // System.out.println(ingredients.toString());
                // System.out.println(recipe);
                list.add(recipe);
                name = "";
                cookingTime = 0;
                ingredients.clear();
            } else {
                if (Character.isUpperCase(curLine.charAt(0))) {
                    name = curLine;
                    // System.out.println(name);
                } else if (Character.isDigit(curLine.charAt(0))) {
                    cookingTime = Integer.valueOf(curLine);
                    // System.out.println(cookingTime);
                } else {
                    // System.out.println(curLine);
                    ingredients.add(curLine);
                }
            }
        }
        bufferedReader.close();
        System.out.println("");        
        UserInterface02 ui = new UserInterface02(list, scanner);
        ui.start();

    }
}

// import java.util.Scanner;
// import java.util.ArrayList;
// import java.io.*;
// import java.nio.file.Paths;

// public class RecipeSearch {

//     public static void main(String[] args) {
//         RecipeList list = new RecipeList();
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("File to read: ");
//         String fileName = scanner.nextLine();
        
//         String name = "";
//         int cookingTime = 0;
//         ArrayList<String> ingredients = new ArrayList<String>();
        
//         try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
//             while (fileScanner.hasNextLine()) {
//                 String row = scanner.nextLine();
                
//                 if (row.equals("")) {
//                     Recipe recipe = new Recipe(name, cookingTime, ingredients);
//                     // System.out.println(ingredients.toString());
//                     // System.out.println(recipe);
//                     list.add(recipe);
//                     name = "";
//                     cookingTime = 0;
//                     ingredients.clear();
//                 } else {
//                     if (Character.isUpperCase(row.charAt(0))) {
//                         name = row;
//                         // System.out.println(name);
//                     } else if (Character.isDigit(row.charAt(0))) {
//                         cookingTime = Integer.valueOf(row);
//                         // System.out.println(cookingTime);
//                     } else {
//                     // System.out.println(curLine);
//                     ingredients.add(row);
//                 }
//             }
//             }
//         } catch (Exception e) {
//             System.out.println("Error: " + e.getMessage());
//         }

//         System.out.println("");        
//         UserInterface ui = new UserInterface(list, scanner);
//         ui.start();

//     }
// }