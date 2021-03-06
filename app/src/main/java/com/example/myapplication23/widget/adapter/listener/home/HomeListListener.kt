package com.example.myapplication23.widget.adapter.listener.home

import com.example.myapplication23.model.homelist.HomeItemModel
import com.example.myapplication23.widget.adapter.listener.AdapterListener

interface HomeListListener : AdapterListener {

    fun onClickItem(listModel: HomeItemModel)
}