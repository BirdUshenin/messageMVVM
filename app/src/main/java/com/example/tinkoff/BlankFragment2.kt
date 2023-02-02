package com.example.tinkoff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.tinkoff.databinding.Fragment2Binding

class BlankFragment2 : Fragment() {
    private val ViewModelMVVM: ViewModelMVVM by activityViewModels()
    lateinit var binding: Fragment2Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        ViewModelMVVM.messageFrag2.observe(activity as LifecycleOwner, {
            binding.textup.text = it
        })
        binding.button3.setOnClickListener{
            ViewModelMVVM.messageFrag1.value = "Hello from Fragment 2"
        }
        binding.button4.setOnClickListener{
            ViewModelMVVM.message.value = "Hello activity from Fragment 2"
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = BlankFragment2()
        }
    }

