package com.shinyelee.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.shinyelee.lovetest.R
import com.shinyelee.lovetest.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment() {

    // 뷰바인딩
    private var vBinding : FragmentQuestionBinding? = null
    private val binding get() = vBinding!!

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 뷰바인딩
        vBinding = FragmentQuestionBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        // 화살표 클릭하면 질문 페이지에서 선택지 페이지로 이동
        binding.nextBtn.setOnClickListener {
            navController.navigate(R.id.action_questionFragment_to_selectionFragment)
        }

    }

}