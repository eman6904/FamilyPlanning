package com.example.familyplanning.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.familyplanning.R
import com.example.familyplanning.databinding.FragmentQuestionsBinding
import com.example.familyplanning.ui.model.ArrayGroup
import com.example.familyplanning.ui.model.Questionss

class Questions : Fragment(R.layout.fragment_questions) {
    private lateinit var binding: FragmentQuestionsBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentQuestionsBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        var p = ArrayGroup()
        p.setText()
        val adapter = Questionss(p.text)

        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = adapter
    }
}