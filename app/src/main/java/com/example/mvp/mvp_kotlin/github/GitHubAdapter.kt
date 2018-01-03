package com.example.mvp.mvp_kotlin.github

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.example.mvp.mvp_kotlin.R
import com.example.mvp.mvp_kotlin.model.Contributor
import com.example.mvp.mvp_kotlin.util.ImageLoader

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
        @BindView(R.id.iv_image)
        lateinit var ivImage:ImageView

        init {
            ButterKnife.bind(this,itemView)
        }

        fun bindData(item: Contributor) {
            ImageLoader.showImage(context,item.avatar_url,ivImage)

        }

        @OnClick(R.id.iv_image)
        fun clickItem(){

        }

    }

}