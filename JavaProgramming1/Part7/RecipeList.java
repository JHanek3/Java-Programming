import java.util.*;

public class RecipeList {
    private ArrayList<Recipe> recipeList;

    public RecipeList() {
        this.recipeList = new ArrayList<Recipe>();
    }

    public void add(Recipe recipe) {
        recipeList.add(recipe);
    }

    public void printRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe: recipeList) {
            System.out.println(recipe);
        }
    }

    public void printRecipe(String name) {
        System.out.println("Recipes:");
        for (Recipe recipe: recipeList) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void printCookingTime(int max) {
        System.out.println("Recipes:");
        for (Recipe recipe: recipeList) {
            if (recipe.getCookingTime() <= max) {
                System.out.println(recipe);
            }
        }
    }

    public void printIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe: recipeList) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
