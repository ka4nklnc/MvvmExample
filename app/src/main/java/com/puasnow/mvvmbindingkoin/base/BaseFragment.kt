package com.puasnow.mvvmbindingkoin.base

import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import com.puasnow.mvvmbindingkoin.network.LoadingState

open class BaseFragment() : Fragment() {

    fun watchLoadingState(_loadingState: LiveData<LoadingState>) {
        if (_loadingState != null) {
            _loadingState.observe(viewLifecycleOwner, ::observeLoadingState)
        }
    }

    fun observeLoadingState(state: LoadingState) {
        when (state.status) {
            LoadingState.Status.SUCCESS -> show("Yüklendi")
            LoadingState.Status.RUNNING -> show("Yükleniyor")
            LoadingState.Status.FAILED -> show(state.msg ?: "Hata oluştu.")
        }
    }

    fun show(message: String) {
        Toast.makeText(
            requireContext(),
            message,
            Toast.LENGTH_SHORT
        ).show()
    }

}