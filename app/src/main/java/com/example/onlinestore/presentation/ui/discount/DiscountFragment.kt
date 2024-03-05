package com.example.onlinestore.presentation.ui.discount

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlinestore.R

class DiscountFragment : Fragment() {
    private lateinit var viewModel: DiscountViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(DiscountViewModel::class.java)
        return inflater.inflate(R.layout.fragment_discount, container, false)
    }
}