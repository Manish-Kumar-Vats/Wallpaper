package com.example.wallpaper.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wallpaper.R
import com.example.wallpaper.databinding.FragmentHomeBinding
import com.example.wallpaper.entities.BOWData
import com.google.firebase.firestore.FirebaseFirestore


class HomeFragment : Fragment() {


    private lateinit var binding: FragmentHomeBinding

    private lateinit var db :FirebaseFirestore

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding= FragmentHomeBinding.inflate(layoutInflater)

        db= FirebaseFirestore.getInstance()
        db.collection("bestOfTheWeek").addSnapshotListener { value, error ->
            val listOfBestOfMonth= arrayListOf<BOWData>()
            val data =value!!.toObjects(BOWData::class.java)
            listOfBestOfMonth.addAll(data )
            for (i in listOfBestOfMonth){
                Log.e("id","$i")
            }
        }


        return binding.root
    }


}