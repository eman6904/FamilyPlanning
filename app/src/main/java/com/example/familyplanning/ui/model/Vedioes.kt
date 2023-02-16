package com.example.familyplanning.ui.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.familyplanning.R

class Vedioes(val context: Context, val list: ArrayList<DataModel2>) : BaseAdapter() {
    private var layoutInflater: LayoutInflater? = null
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View {
        var convertView = convertView
        // on blow line we are checking if layout inflater
        // is null, if it is null we are initializing it.
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        // on the below line we are checking if convert view is null.
        // If it is null we are initializing it.
        if (convertView == null) {
            // on below line we are passing the layout file
            // which we have to inflate for each item of grid view.
            convertView = layoutInflater!!.inflate(R.layout.model2, null)
        }
        // on below line we are setting image for our course image view.
        val name = convertView!!.findViewById<TextView>(R.id.textView)
        val pic = convertView!!.findViewById<ImageView>(R.id.image)
        // on below line we are setting image for our course image view.
        pic.setImageResource(list.get(position).pic)
        // on below line we are setting text in our course text view.
        name.setText("${position+1}-"+list.get(position).text)
        // at last we are returning our convert view.
        return convertView
    }

}
