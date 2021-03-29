package com.puasnow.mvvmbindingkoin.core.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.puasnow.mvvmbindingkoin.base.BaseViewModel
import com.puasnow.mvvmbindingkoin.network.LoadingState
import com.puasnow.mvvmbindingkoin.repository.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow

class UserViewModel(private val userRepository: UserRepository) : BaseViewModel() {

    private val _visibility = MutableLiveData<Boolean>()
    val visibility: LiveData<Boolean>
        get() = _visibility

    private val _text = MutableLiveData<Boolean>()
    val text: LiveData<Boolean>
        get() = _text

    private val mSignUpSecondActions: MutableStateFlow<EventWrapper<SignUpSecondActions>> =
        MutableStateFlow(EventWrapper(SignUpSecondActions.Init))

    val signUpSecondActions: MutableStateFlow<EventWrapper<SignUpSecondActions>>
        get() = mSignUpSecondActions

    init {

    }

}