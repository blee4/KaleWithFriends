package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Static class to find a list of recipes a user can cook given a list of ingredients that the users have.
 * <p/>
 * Created by Jack on 4/8/2015.
 */
public class IngredientsToRecipe {


  /**
   * Find list of recipes a user can cook given their ingredients.
   *
   * @param ingredientList The list of ingredients.
   * @return Recipes the user can cook.
   */
  public static ArrayList<Recipe> getRecipesFromIngredients(ArrayList<TimedIngredient> ingredientList) {
    List<Recipe> listFromRecipeDB = RecipeDB.getRecipe();
    ArrayList<Recipe> returnRecipeList = new ArrayList<Recipe>();

    for (Recipe recipe : listFromRecipeDB) {
      ArrayList<TimedIngredient> recipeIngredientList = recipe.getIngredientList();
      boolean flag = false;
      for (TimedIngredient ingredient : recipeIngredientList) {
        flag = false;
        for (int i = 0; i < ingredientList.size(); i++) {
          if (ingredient.getName().equals(ingredientList.get(i).getName())) {
            flag = true;
            break;
          }
        }
        if (!flag) {
          break;
        }

      }
      if (flag) {
        returnRecipeList.add(recipe);
      }
    }
    return returnRecipeList;
  }


}
