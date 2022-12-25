package android.example.soccerquiz

import android.example.soccerquiz.databinding.FragmentWelcomeScreenBinding
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI


class WelcomeScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding: FragmentWelcomeScreenBinding =
           DataBindingUtil.inflate(inflater, R.layout.fragment_welcome_screen, container, false)

        binding.button.setOnClickListener {view: View -> Navigation.findNavController(view).navigate(R.id.action_welcomeScreenFragment_to_quizFragment)
        }

        binding.rulesButton.setOnClickListener {view: View -> Navigation.findNavController(view).navigate(R.id.action_welcomeScreenFragment_to_rulesFragment)
        }
        return binding.root
    }

}