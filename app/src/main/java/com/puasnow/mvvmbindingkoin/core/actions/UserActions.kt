package com.puasnow.mvvmbindingkoin.core.actions

import com.puasnow.mvvmbindingkoin.models.GithubUser

//ViewModel'den Arayüze(Fragment,Activity) bilgi göndermek için kullanılır.
sealed class UserActions {
    data class GetAllUser(val users: List<GithubUser>) : UserActions()
}