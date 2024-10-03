package com.example.weather2lec

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weather2lec.Adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}