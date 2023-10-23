package com.example.myapplicationkotlin.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

import com.example.myapplicationkotlin.R
import com.example.myapplicationkotlin.databinding.FragmentMainBinding
import com.example.myapplicationkotlin.databinding.FragmentQuestionBinding

/**
 * A simple [Fragment] subclass.
 */
class QuestionFragment : Fragment(), View.OnClickListener{


    lateinit var navController : NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentQuestionBinding.inflate(layoutInflater)
        val view = binding.root
        binding.btnNext.setOnClickListener(this)
//        navController = Navigation.findNavController(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_next -> {
                findNavController().navigate(R.id.action_questionFragment_to_selectionFragment)
            }

        }
    }




}
