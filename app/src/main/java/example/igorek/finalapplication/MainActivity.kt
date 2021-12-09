package example.igorek.finalapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "item"
private val FRAGMENT_FULL_LIST = FragmentFullRecipesList().javaClass.name
private val FRAGMENT_FAVORITES_LIST = FragmentFavoritesRecipesList().javaClass.name
private val FRAGMENT_ABOUT_VIEW = FragmentAbout().javaClass.name

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenu: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)
        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null

            when (item.itemId) {
                R.id.fragment_full_recipes_list -> {
                    fragment = if (savedInstanceState != null) supportFragmentManager.getFragment(
                        savedInstanceState, FRAGMENT_FULL_LIST
                    ) else FragmentFullRecipesList()
                }
                R.id.fragment_favorites_recipes_list -> {
                    fragment = if (savedInstanceState != null)
                        supportFragmentManager.getFragment(
                            savedInstanceState,
                            FRAGMENT_FAVORITES_LIST
                        )
                    else FragmentFavoritesRecipesList()
                }
                R.id.fragment_about_button -> {
                    fragment = if (savedInstanceState != null) supportFragmentManager.getFragment(
                        savedInstanceState, FRAGMENT_ABOUT_VIEW
                    )
                    else FragmentAbout()

                }

            }


            replaceFragment(fragment!!)
            true
        }




        bottomNavigationMenu.selectedItemId =
            savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.fragment_full_recipes_list


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_SELECTED_ITEM, bottomNavigationMenu.selectedItemId)

        val currentFragment = supportFragmentManager.fragments.last()
        supportFragmentManager.putFragment(
            outState,
            currentFragment.javaClass.name,
            currentFragment
        )
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}


