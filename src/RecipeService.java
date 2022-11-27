import java.util.HashSet;
import java.util.Set;

public class RecipeService {
    private final Set<Recipe> recipes = new HashSet<>();

    public void add(Recipe recipe) throws RuntimeException {
        if (recipes.contains(recipe)) {
            throw new RuntimeException("Этот рецепт уже есть в списке!");
        } else recipes.add(recipe);
    }


}
