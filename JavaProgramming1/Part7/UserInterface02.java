import java.util.Scanner;
import java.util.*;

public class UserInterface02 {
    private RecipeList recipeList;
    private Scanner scanner;

    public UserInterface02 (RecipeList recipeList, Scanner scanner) {
        this.recipeList = recipeList;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Commands");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {

                System.out.println("");
                recipeList.printRecipes();
            
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                System.out.println("");
                recipeList.printRecipe(name);
                
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int timeInput = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                recipeList.printCookingTime(timeInput);

            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("");
                recipeList.printIngredient(ingredient);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}


