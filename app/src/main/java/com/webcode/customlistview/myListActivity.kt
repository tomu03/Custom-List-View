package com.webcode.customlistview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter(
    private val context: Activity,
    private val title: Array<String>,
    private val desc: Array<String>,
    private val imageId: Array<Int>
) : ArrayAdapter<String>(context,R.layout.list_item, title) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val conInFlater = context.layoutInflater
        val rowView = conInFlater.inflate(R.layout.list_item, parent, false)

        val titelTxt = rowView.findViewById<TextView>(R.id.playerName)
        val desctxt = rowView.findViewById<TextView>(R.id.playerdetalis)
        val image = rowView.findViewById<ImageView>(R.id.profileImg)

        titelTxt.text = title[position]
        desctxt.text = desc[position]
        image.setImageResource(imageId[position])

        return rowView

    }
}