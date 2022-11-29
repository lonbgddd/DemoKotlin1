package com.src.demokotlin1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SinhVienAdapter(var context: Context, var mangSinhVien: List<SinhVien>) : RecyclerView.Adapter<SinhVienAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var itemId: TextView
        var itemName: TextView
        init {
            itemId = view.findViewById(R.id.txt_id)
            itemName = view.findViewById(R.id.txt_name)
        }
        fun initData(sinhVien: SinhVien, i: Int) {
            itemId.setText(sinhVien.id)
            itemName.setText(sinhVien.name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var row: View = LayoutInflater.from(parent.context).inflate(R.layout.row_new_st, parent, false)
        return ViewHolder(row)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val sinhvien: SinhVien = mangSinhVien.get(position)
        if (sinhvien == null) {
            return
        } else
            holder.initData(sinhvien, position)
    }

    override fun getItemCount(): Int {
        return mangSinhVien.size
    }
}
