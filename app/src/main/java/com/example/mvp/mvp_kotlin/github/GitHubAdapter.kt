package com.example.mvp.mvp_kotlin.github

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.mvp.mvp_kotlin.R
import com.example.mvp.mvp_kotlin.model.Contributor
import com.example.mvp.mvp_kotlin.util.ImageLoader
import kotlinx.android.synthetic.main.item_github.view.*

/**
 * Created by nikolascatur on 29/12/17.
 */
class GitHubAdapter(val context: Context,val listImage: List<Contributor>?) : RecyclerView.Adapter<GitHubAdapter.GitHubViewHolder>() {

    override fun onBindViewHolder(holder: GitHubViewHolder?, position: Int) {
        holder!!.bindData(listImage!![position])
    }

    override fun getItemCount(): Int = listImage!!.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitHubViewHolder {
        val view:View = LayoutInflater.from(context).inflate(R.layout.item_github,null,false)
        return GitHubViewHolder(context,view)
    }

    class GitHubViewHolder(val context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindData(item: Contributor) {
            ImageLoader.showImage(context,item.avatar_url,itemView.ivImage)

        }


    }

}