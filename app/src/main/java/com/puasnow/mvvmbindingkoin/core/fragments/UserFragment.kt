package com.puasnow.mvvmbindingkoin.core.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.puasnow.mvvmbindingkoin.base.BaseFragment
import com.puasnow.mvvmbindingkoin.core.viewModels.UserViewModel
import com.puasnow.mvvmbindingkoin.databinding.FragmentUserBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserFragment : BaseFragment() {
    private val mViewModel: UserViewModel by viewModel()
    private lateinit var mBinding: FragmentUserBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentUserBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(mBinding)
        {
mBinding.
        }

        with(mViewModel)
        {

        }

    }

}