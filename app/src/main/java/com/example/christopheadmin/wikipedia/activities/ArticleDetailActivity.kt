package com.example.christopheadmin.wikipedia.activities

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.example.christopheadmin.wikipedia.R
import kotlinx.android.synthetic.main.activity_article_detail.view.*

class ArticleDetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_detail)
    }
}