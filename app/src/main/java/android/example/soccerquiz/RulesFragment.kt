package android.example.soccerquiz

import android.example.soccerquiz.databinding.FragmentRulesBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation


class RulesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentRulesBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_rules, container, false)

        binding.backButton.setOnClickListener {view: View -> Navigation.findNavController(view).navigate(R.id.action_rulesFragment_to_welcomeScreenFragment)
        }
        return binding.root

    }
}