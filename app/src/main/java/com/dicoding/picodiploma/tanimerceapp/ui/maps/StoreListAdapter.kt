package com.dicoding.picodiploma.tanimerceapp.ui.maps

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.picodiploma.tanimerceapp.data.StoreEntity
import com.dicoding.picodiploma.tanimerceapp.databinding.ItemStoreListBinding


class StoreListAdapter : RecyclerView.Adapter<StoreListAdapter.StoreListViewHolder>() {
    private val storeList = ArrayList<StoreEntity>()

    fun setStoreLists(stores: List<StoreEntity>) {
        this.storeList.clear()
        this.storeList.addAll(stores)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreListViewHolder {
        val binding = ItemStoreListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StoreListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StoreListViewHolder, position: Int) {
        val stores = storeList[position]
        holder.bind(stores)
    }

    override fun getItemCount(): Int = storeList.size

    class StoreListViewHolder(private val binding: ItemStoreListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(store: StoreEntity) {
            with(binding) {
                tvNamaToko.text = store.judul
                tvAlamat.text = store.alamat
                btnWa.setOnClickListener {
                    val uri: Uri = Uri.parse("smsto:${store.wa}")
                    val i = Intent(Intent.ACTION_SENDTO, uri)
                    i.setPackage("com.whatsapp")
                    btnWa.context.startActivity(Intent.createChooser(i, ""))
                }
            }
        }

    }
}