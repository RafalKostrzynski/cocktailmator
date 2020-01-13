package pl.kostrzynkamien.cocktailomator.Service;

import pl.kostrzynkamien.cocktailomator.Model.Recipe;

import java.util.List;

public interface CocktailController {
    List<Recipe> getRecipies(String link);
    String getIngredientInfo(String ingredient);
}
