package br.com.any.contraintlayout.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.any.contraintlayout.data.ItemDAO
import br.com.any.contraintlayout.databinding.ActivityPackageListBinding
import br.com.any.contraintlayout.ui.adapter.PackageAdapter

class PackageListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPackageListBinding
    private val TITLE = "Packages"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPackageListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = TITLE
        setListRv()
    }

    private fun setListRv() {
        val items = ItemDAO()
        binding.rvlistpackage.layoutManager = LinearLayoutManager(this)
        binding.rvlistpackage.adapter = PackageAdapter(items.getAll(), this)
    }
}