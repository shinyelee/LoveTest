package com.shinyelee.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.shinyelee.lovetest.R
import com.shinyelee.lovetest.databinding.FragmentResultBinding
import com.shinyelee.lovetest.databinding.FragmentSelectionBinding

class ResultFragment : Fragment() {

    // 뷰바인딩
    private var vBinding : FragmentResultBinding? = null
    private val binding get() = vBinding!!

    var option = -1

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        option = arguments?.getInt("index")?:-1

        // 뷰바인딩
        vBinding = FragmentResultBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        setResult(option)

    }

    fun setResult(option: Int) {

        when(option) {
            1 -> {
                binding.resultMain.text = "You are a QUITTER!"
                binding.resultSub.text = "You can let the person easily."
            }
            2 -> {
                binding.resultMain.text = "You should focus on yourself!"
                binding.resultSub.text = "You become really clingy to your ex."
            }
            3 -> {
                binding.resultMain.text = "You should take it easy!"
                binding.resultSub.text = "You can do crazy things no matter what it takes."
            }
            4 -> {
                binding.resultMain.text = "You are pretty mature."
                binding.resultSub.text = "You can easily accept the break-up."
            }
        }

    }

}