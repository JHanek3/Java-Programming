import java.util.*;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        
        // Why doesnt this work???, i just receive a blank arrayList []
        // this.ingredient = ingredients
        this.ingredients = new ArrayList<String>();
        for (String ingredient: ingredients) {
            this.ingredients.add(ingredient);
        }
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    @Override
    public String toString() {
        return String.format("%s, cooking time: %d", this.name, this.cookingTime);
    }
}
