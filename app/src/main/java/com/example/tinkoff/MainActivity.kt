package com.example.tinkoff

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.example.tinkoff.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val ViewModelMVVM: ViewModelMVVM by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openFrag(BlankFragment.newInstance(), R.id.place_holder)
        openFrag(BlankFragment2.newInstance(), R.id.place_holder2)

        ViewModelMVVM.message.observe(this, {


            binding.textView.text = it
        })
    }

    private fun openFrag(f: Fragment, idHolder: Int ){
        supportFragmentManager
        .beginTransaction()
            .replace(idHolder, f)
            .commit()
    }
}

