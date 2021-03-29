package com.puasnow.mvvmbindingkoin.core.interactions

//Arayüzden(Fragment,Activity) ViewModel'e veri göndermek için kullanılır.
sealed class UserInterActions {
    object Init : UserInterActions()
}