package br.com.any.contraintlayout.ui.adapter

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.any.contraintlayout.R
import br.com.any.contraintlayout.data.ItemDAO
import br.com.any.contraintlayout.databinding.ItemPackageBinding
import br.com.any.contraintlayout.model.ItemSources
import com.squareup.picasso.Picasso

class PackageAdapter(private val itemSources: ArrayList<ItemSources>) :
    RecyclerView.Adapter<PackageAdapter.PackageHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PackageHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PackageHolder(layoutInflater.inflate(R.layout.item_package, parent, false))
    }

    override fun onBindViewHolder(holder: PackageHolder, position: Int) {

        holder.binding(itemSources[position])
    }

    override fun getItemCount(): Int = itemSources.size

    class PackageHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val bindingRecycler = ItemPackageBinding.bind(itemView)

        private val imagem = bindingRecycler.itemPackageImage
        private val localPacote = bindingRecycler.itemPackageLocal
        private val dias = bindingRecycler.itemPackageDays
        private val preco = bindingRecycler.itemPackagePrice

        fun binding(itemSources: ItemSources) {
            localPacote.text = itemSources.local
            dias.text = itemSources.dias
            preco.text = itemSources.preco

//            imagem.setImageResource(itemSources.imagem)

        }
    }
}