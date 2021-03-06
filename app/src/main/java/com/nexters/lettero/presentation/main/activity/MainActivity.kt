package com.nexters.lettero.presentation.main.activity

import com.nexters.lettero.R
import com.nexters.lettero.databinding.ActivityMainBinding
import com.nexters.lettero.presentation.base.BaseActivity
import com.nexters.lettero.presentation.base.ViewModel
import com.nexters.lettero.presentation.main.viewmodel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override val layoutRes: Int = R.layout.activity_main
    override var viewModel: ViewModel = MainViewModel()
}
