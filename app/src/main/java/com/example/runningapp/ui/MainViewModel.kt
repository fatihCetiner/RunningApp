package com.example.runningapp.ui

import com.example.runningapp.data.repositories.MainRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
) {
}