package example.igorek.finalapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FragmentFullRecipesList : Fragment() {
    lateinit var recipesRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewRecipeView =
            inflater.inflate(R.layout.fragment_full_recipes_list, container, false)

        recipesRecyclerView = viewRecipeView.findViewById(R.id.full_recipes_recyclker_view)
        val recipeList: List<Recipe.RecipeView> = listOf(
            Recipe.RecipeView("Kebab", R.drawable.pic_kebab),
            Recipe.RecipeView("Hot Fish", R.drawable.pic_hot_fish),
            Recipe.RecipeView("Solanka", R.drawable.pic_solanka)
        )

        recipesRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recipesRecyclerView.adapter = RecipeAdapter(recipeList)



        return viewRecipeView
    }


}