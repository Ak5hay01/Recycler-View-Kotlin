package com.akshayteli.recyclerviewdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akshayteli.recyclerviewdemo.R
import com.akshayteli.recyclerviewdemo.models.AndroidVersions
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/**
 * Created by Akshay Teli on 22,March,2021
 */
class AndroidVersionRecyclerAdapter(private val listener: OnItemClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val TAG: String = "AppDebug"

    private var items: List<AndroidVersions> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AndroidVersionViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is AndroidVersionViewHolder -> {
                holder.bind(items.get(position))
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(androidVersionList: List<AndroidVersions>){
        items = androidVersionList
    }

    inner class AndroidVersionViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView), View.OnClickListener{

        val android_image = itemView.findViewById(R.id.android_version_image) as ImageView
        val android_title = itemView.findViewById(R.id.android_title) as TextView


        fun bind(androidVersions: AndroidVersions){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(androidVersions.image)
                .into(android_image)
                android_title.setText(androidVersions.title)
        }

        init{
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val position:Int = adapterPosition
            if(position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }

    }

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }



}