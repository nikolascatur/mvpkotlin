package com.example.mvp.mvp_kotlin.model

/**
 * Created by nikolascatur on 22/12/17.
 */
data class Contributor(val login: String,
                       val id: Int,
                       val avatar_url: String,
                       val gravatar_id: String,
                       val url: String,
                       val html_url: String,
                       val followers_url: String,
                       val following_url: String,
                       val gists_url: String,
                       val starred_url: String,
                       val subscriptions_url: String,
                       val organizations_url: String,
                       val repos_url: String,
                       val events_url: String,
                       val received_events_url: String,
                       val type: String,
                       val site_admin: Boolean,
                       val contributions: Int)

