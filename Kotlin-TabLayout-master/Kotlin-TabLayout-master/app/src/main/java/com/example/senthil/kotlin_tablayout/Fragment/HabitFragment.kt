package com.example.senthil.kotlin_tablayout.Fragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.senthil.kotlin_tablayout.R
import com.example.senthil.kotlin_tablayout.WriteActivity.HabitWrite
import com.example.senthil.kotlin_tablayout.WriteActivity.PlanerWrite
import kotlinx.android.synthetic.main.fragment_habit.*
import kotlinx.android.synthetic.main.fragment_planer.*

class HabitFragment : Fragment() {

    val memos = ArrayList<String>()//메모를 저장할 배열

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_habit, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnAdd_habit.setOnClickListener {
            activity?.let {
                val intent = Intent(context, HabitWrite::class.java)
                startActivity(intent) //메모추가 누르면 메모 작성화면으로 이동
            }

        }
    }

}
