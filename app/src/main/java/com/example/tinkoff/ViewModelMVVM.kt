package com.example.tinkoff

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class ViewModelMVVM : ViewModel() {
    val message: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }

    val messageFrag1: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }

    val messageFrag2: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
}