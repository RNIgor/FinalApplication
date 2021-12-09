package example.igorek.finalapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentAbout : Fragment() {
lateinit var toWebSiteButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val aboutView= inflater.inflate(R.layout.fragment_about, container, false)
toWebSiteButton=aboutView.findViewById(R.id.go_to_web_button)
toWebSiteButton.setOnClickListener{
val urlLink= Uri.parse("https://kotlinlang.org/")
    val intent= Intent(Intent.ACTION_VIEW,urlLink)
    context?.startActivity(intent)
}

        return aboutView
    }

}