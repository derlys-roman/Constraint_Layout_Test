package br.com.any.contraintlayout.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.any.contraintlayout.R
import br.com.any.contraintlayout.databinding.ItemPackageBinding
import br.com.any.contraintlayout.model.ItemSources

class PackageAdapter(private val itemSources: ArrayList<ItemSources>) :
    RecyclerView.Adapter<PackageAdapter.PackageHolder>() {

    private lateinit var binding: PackageHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PackageHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PackageHolder(layoutInflater.inflate(R.layout.item_package, parent, false))
    }

    override fun onBindViewHolder(holder: PackageHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = itemSources.size

    class PackageHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = ItemPackageBinding.bind(itemView)
        fun binding() {

        }
    }
}