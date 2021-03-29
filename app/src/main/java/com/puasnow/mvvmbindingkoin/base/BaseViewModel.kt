package com.puasnow.mvvmbindingkoin.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.puasnow.mvvmbindingkoin.network.LoadingState

open class BaseViewModel : ViewModel() {
    private val _loadingState = MutableLiveData<LoadingState>()
    val loadingState: LiveData<LoadingState>
        get() = _loadingState

    fun setLoadingState(state: LoadingState) {
        _loadingState.value = state
    }
}