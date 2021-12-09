package example.igorek.finalapplication

sealed class Recipe(open val name: String) {
    class RecipeView(
        override val name: String,
        val image: Int
    ) : Recipe(name)

    class RecipeText(
        override val name: String,
        val fullText:String
    ):Recipe(name)
}