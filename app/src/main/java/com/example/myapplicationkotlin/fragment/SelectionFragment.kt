package com.example.myapplicationkotlin.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myapplicationkotlin.R

import com.example.myapplicationkotlin.databinding.FragmentSelectionBinding

/**
 * A simple [Fragment] subclass.
 */
class SelectionFragment : Fragment() , View.OnClickListener {


    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentSelectionBinding.inflate(layoutInflater)
        val view = binding.root
//        navController = Navigation.findNavController(view)

        binding.btnBack.setOnClickListener {
            println("dd")
        }
        binding.btnBack.setOnClickListener(this)
        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)

        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    override fun onClick(v: View?) {

        when(v?.id){
            R.id.option_1 -> {navigateWithIndex(1)}
            R.id.option_2 -> {navigateWithIndex(2)}
            R.id.option_3 -> {navigateWithIndex(3)}
            R.id.option_4 -> {navigateWithIndex(4)}
            R.id.btn_back -> {
                findNavController().popBackStack()
            }

        }
    }

    fun navigateWithIndex(index : Int){

        val bundle = bundleOf("index" to index)
        findNavController().navigate(R.id.action_selectionFragment_to_resultFragment2,bundle)
    }


}
