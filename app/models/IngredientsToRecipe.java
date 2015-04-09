package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 4/8/2015.
 */
public class IngredientsToRecipe {


  public static ArrayList<Recipe> getRecipesFromIngredients(ArrayList<TimedIngredient> ingredientList) {
    List<Recipe> listFromRecipeDB = RecipeDB.getRecipe();
    ArrayList<Recipe> returnRecipeList = new ArrayList<Recipe>();

    for (Recipe recipe : listFromRecipeDB) {
      ArrayList<Ingredient> recipeIngredientList = recipe.getIngredientList();
      for (int i = 0; i < recipeIngredientList.size(); i++) {
        boolean addToReturnRecipeList = false;
        for (int j = 0; j < ingredientList.size(); j++) {
          if (recipeIngredientList.get(i).getName().equals(ingredientList.get(j).getName())) {
            addToReturnRecipeList = true;
            break;
          }
        }
        if (!addToReturnRecipeList) {
          //Does not have required ingredient to make a given recipe, go to next recipe
          break;
        }
      }
      returnRecipeList.add(recipe);
    }

    return returnRecipeList;
  }
}
