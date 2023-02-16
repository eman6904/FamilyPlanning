package com.example.familyplanning.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.familyplanning.R
import com.example.familyplanning.databinding.FragmentFaceBinding
import com.example.familyplanning.databinding.FragmentVedioBinding
import com.example.familyplanning.ui.model.ArrayGroup
import com.example.familyplanning.ui.model.Vedioes

class Vedio : Fragment(R.layout.fragment_vedio) {
    private lateinit var binding: FragmentVedioBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentVedioBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        val obj = ArrayGroup()
        obj.setvedio()
        binding.gridView.adapter = Vedioes(requireContext(), obj.vedio)
    }
}