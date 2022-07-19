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

class ResultFragment : Fragment() {

    // 뷰바인딩
    private var vBinding : FragmentResultBinding? = null
    private val binding get() = vBinding!!

    // 인덱스
    var option = -1

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // 인덱스
        option = arguments?.getInt("index")?:-1

        // 뷰바인딩
        vBinding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        // 선택지에 따른 결과 표시
        setResult(option)

        // 홈버튼 클릭하면 결과 페이지에서 메인 페이지로 이동
        binding.homeBtn.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }

    }

    private fun setResult(option: Int) {

        // 동일한 프래그먼트에서
        when(option) {
            // 선택지(인덱스)에 따라 텍스트만 바꿈
            1 -> {
                binding.resultMain.text = "You are a QUITTER!"
                binding.resultSub.text = "You can let the person easily."
            }
            2 -> {
                binding.resultMain.text = "You should focus on YOURSELF!"
                binding.resultSub.text = "You become really clingy to your ex."
            }
            3 -> {
                binding.resultMain.text = "You should take it EASY!"
                binding.resultSub.text = "You can do crazy things no matter what it takes."
            }
            4 -> {
                binding.resultMain.text = "You are pretty MATURE."
                binding.resultSub.text = "You can easily accept the break-up."
            }
        }

    }

}