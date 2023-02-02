package com.example.tinkoff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.tinkoff.databinding.Fragment1Binding
import com.example.tinkoff.databinding.Fragment2Binding

class BlankFragment : Fragment() {
    private val ViewModelMVVM: ViewModelMVVM by activityViewModels()
    lateinit var binding: Fragment1Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        ViewModelMVVM.messageFrag1.observe(activity as LifecycleOwner, {
            binding.textsss.text = it
        })



        binding.button.setOnClickListener{
            ViewModelMVVM.messageFrag2.value = "Hello from Fragment One"
        }
        binding.button2.setOnClickListener{
            ViewModelMVVM.message.value = "Hello activity from Fragment One"
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = BlankFragment()
    }
}