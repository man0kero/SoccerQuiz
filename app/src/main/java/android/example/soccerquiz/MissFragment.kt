package android.example.soccerquiz

import android.example.soccerquiz.databinding.FragmentGoalBinding
import android.example.soccerquiz.databinding.FragmentMissBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MissFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MissFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMissBinding>(
            inflater, R.layout.fragment_miss, container, false)

        binding.ball.animate().
        translationXBy(480f).
        rotation(3600f).
        duration = 1000

        binding.oneMiss.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_missFragment_to_quizFragment)
        }
        return binding.root
    }
}