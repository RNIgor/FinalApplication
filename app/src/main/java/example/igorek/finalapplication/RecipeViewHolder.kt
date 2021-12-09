package example.igorek.finalapplication

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    private val recipeImageView:ImageView=itemView.findViewById(R.id.recipe_image_view)
    private val recipeNameTextView:TextView=itemView.findViewById(R.id.recipe_name_text_view)

    fun bind(recipe: Recipe.RecipeView){
        recipeImageView.setImageResource(recipe.image)
        recipeNameTextView.text=recipe.name
    }

}