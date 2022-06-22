package com.shinyelee.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.shinyelee.lovetest.R
import com.shinyelee.lovetest.databinding.FragmentSelectionBinding

class SelectionFragment : Fragment(), View.OnClickListener {

    // 뷰바인딩
    private var vBinding : FragmentSelectionBinding? = null
    private val binding get() = vBinding!!

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 뷰바인딩
        vBinding = FragmentSelectionBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        binding.backBtn.setOnClickListener(this)
        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when(v?.id) {
            R.id.option1 -> {navWithIndex(1)}
            R.id.option2 -> {navWithIndex(2)}
            R.id.option3 -> {navWithIndex(3)}
            R.id.option4 -> {navWithIndex(4)}
            R.id.backBtn -> {navController.popBackStack()}
        }

    }

    private fun navWithIndex(index : Int) {

        val bundle = bundleOf("index" to index)

        navController.navigate(R.id.action_selectionFragment_to_resultFragment, bundle)

    }

}