package example.igorek.finalapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FragmentFavoritesRecipesList : Fragment() {
lateinit var recipesRecyclerView:RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewRecipeView =
            inflater.inflate(R.layout.fragment_favorites_recipes_list, container, false)

        recipesRecyclerView = viewRecipeView.findViewById(R.id.favorites_recipes_recyclker_view)
        val recipeList: List<Recipe.RecipeView> = listOf(
            Recipe.RecipeView("Chicken Grill", R.drawable.pic_chicken_gril),

        )

        recipesRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recipesRecyclerView.adapter = RecipeAdapter(recipeList)
        return viewRecipeView
    }

}