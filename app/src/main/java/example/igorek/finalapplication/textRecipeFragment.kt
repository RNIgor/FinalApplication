package example.igorek.finalapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class textRecipeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewRecipeText = inflater.inflate(R.layout.fragment_text_recipe, container, false)
        val recipeTextList: List<Recipe.RecipeText> = listOf(
            Recipe.RecipeText("Kebab", "Take 500 grams of meat. Wash it and fry it on coals."),
            Recipe.RecipeText("Hot Fish", "Take 300 grams of salmon and bake in the oven."),
            Recipe.RecipeText("Solanka", "Take onions, cabbage, potatoes and cook soup.")
        )
        return viewRecipeText
    }


}