package com.example.datatemanputri

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.datateman.MyFriendsAdapter
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman: ArrayList<MyFriends>

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman= ArrayList()
        listTeman.add(MyFriends("Putri RH, ","Perempuan", "putri@RH.ac.id", "089602001639", "Malang")
        )
        listTeman.add(MyFriends("Muhammad Ar Rafif", "Laki - laki", "afif@kk.ac.id", "085729363098", "Palembang")
        )
        listTeman.add(MyFriends("Diva Nur Aisyah ", "Perempuan", "Dipadiva@gmail.com", "089533126420", "Kalimantan")
        )
        listTeman.add(MyFriends("Nurul Novia ", "Perempuan", "Nurul@gmail.com", "0897658767345", "Cilacap")
        )
        listTeman.add(MyFriends("Daniar Leon", "Laki - laki", "Daniar@gmail.com", "086890765432", "Sulawesi")
        )
    }

    private fun tampilTeman(){
        rv_listMyFriends.layoutManager = LinearLayoutManager(activity)
        rv_listMyFriends.adapter = MyFriendsAdapter(activity!!, listTeman)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}