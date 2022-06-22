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

class SelectionFragment : Fragment() {

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        // 화살표 클릭하면
        var back = view.findViewById<ImageView>(R.id.selecBackBtn)
        // 선택지 페이지에서 질문 페이지로 이동
        back.setOnClickListener {
            navController.navigate(R.id.action_selectionFragment_to_questionFragment)
        }
    }

}