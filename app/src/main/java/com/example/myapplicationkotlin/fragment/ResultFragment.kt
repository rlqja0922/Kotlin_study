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
import com.example.myapplicationkotlin.databinding.FragmentResultBinding

/**
 * A simple [Fragment] subclass.
 */
class ResultFragment : Fragment() {


    var option = -1

    lateinit var navController: NavController


    lateinit var binding : FragmentResultBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentResultBinding.inflate(layoutInflater)
        option = arguments?.getInt("index")?:-1
        val view = binding.root

//        navController = Navigation.findNavController(view)
        setResult(option)


        binding.btnHome.setOnClickListener {
            findNavController().navigate(R.id.action_resultFragment2_to_mainFragment)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    fun setResult(option : Int){

        when(option){
            1 -> {
                binding.tvMain.text = "You are a QUITTER!"
                binding.tvSub.text ="You can let the person easily."
            }

            2 -> {
                binding.tvMain.text="You should focus on yourself"
                binding.tvSub.text="You become really clingy to your ex."

            }

            3-> {
                binding.tvMain.text="You should take it easy"
                binding.tvSub.text="You can do crazy things no matter what it takes."
            }

            4-> {
                binding.tvMain.text="You are pretty mature."
                binding.tvSub.text="You can easily accept the break-up."
            }
        }
    }








}
