package com.example.wallpaper.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wallpaper.R
import com.example.wallpaper.databinding.FragmentDownloadBinding


class DownloadFragment : Fragment() {


    private lateinit var binding: FragmentDownloadBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding= FragmentDownloadBinding.inflate(layoutInflater)
        return binding.root
    }
}