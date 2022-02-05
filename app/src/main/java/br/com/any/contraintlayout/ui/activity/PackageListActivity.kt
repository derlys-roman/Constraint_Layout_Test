package br.com.any.contraintlayout.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.inputmethod.InputBinding
import br.com.any.contraintlayout.R
import br.com.any.contraintlayout.databinding.ActivityPackageListBinding

class PackageListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPackageListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPackageListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}