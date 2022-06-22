package com.shinyelee.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.shinyelee.lovetest.R

class QuestionFragment : Fragment() {

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_question, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        // 화살표 클릭하면
        var next = view.findViewById<ImageView>(R.id.nextBtn)

        // 질문 페이지에서 선택지 페이지로 이동
        next.setOnClickListener {
            navController.navigate(R.id.action_questionFragment_to_selectionFragment)
        }

    }

}