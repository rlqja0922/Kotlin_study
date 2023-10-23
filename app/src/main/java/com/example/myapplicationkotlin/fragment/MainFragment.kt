package com.example.myapplicationkotlin.fragment


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myapplicationkotlin.MainActivity
import com.example.myapplicationkotlin.R
import com.example.myapplicationkotlin.databinding.FragmentMainBinding


/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() , View.OnClickListener,MainActivity.App_finsh
//    , MainActivity.onBackPressedListener
{


    lateinit var navController : NavController
    private lateinit var callback: OnBackPressedCallback

    private lateinit var binding : FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentMainBinding.inflate(layoutInflater)
        val view = binding.root
//        navController = Navigation.findNavController(view)
        binding.next1.setOnClickListener {

            findNavController().navigate(R.id.action_mainFragment_to_questionFragment2)
        }

        return view
    }


    override fun onClick(v: View?) {
        when(v?.id){
            binding.next1.id -> {
                findNavController().navigate(R.id.action_mainFragment_to_questionFragment2)
            }

        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        var backpressedTime:Long = 0
        callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (backpressedTime + 3000 > System.currentTimeMillis()){
                    Toast.makeText(context,"종료로직.",Toast.LENGTH_SHORT).show()
                    onFinsh()
//                    activity?.supportFragmentManager?.beginTransaction()?.remove(this@MainFragment)?.commit() 액티비티 finsh 로직
                }else{
                    Toast.makeText(context,"한번 더 뒤로가기 버튼을 누르면 종료 됩니다.",Toast.LENGTH_SHORT).show()
                }
                backpressedTime = System.currentTimeMillis()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)
    }

    override fun onDetach() {
        super.onDetach()
        callback.remove()
    }
//    //override 해서 사용해주면 된다!
//    override fun onBackPressed() {
//        requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()
//        //requireActivity().supportFragmentManager.popBackStack()
//    }
    override fun onFinsh() {
        TODO("Not yet implemented")
    }

}
