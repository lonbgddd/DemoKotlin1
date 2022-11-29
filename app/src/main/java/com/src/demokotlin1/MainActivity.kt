package com.src.demokotlin1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list: List<SinhVien>
//        var a: String = "phat"
//        when(a){
//            "tai" -> Log.d("AAA","Chao ban tai")
//            "phat" -> Log.d("AAA","Chao ban phat")
//        }
        var sv: SinhVien = SinhVien(1, "Nguyen long")
        Log.d("name", sv.id.toString()+"--"+sv.name)
    }
//    fun ShowName(ten: String ){
//        Log.d("AAA","Xin Chào " + ten)
//    }
}
