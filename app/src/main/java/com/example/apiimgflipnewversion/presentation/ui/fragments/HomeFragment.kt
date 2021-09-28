package com.example.apiimgflipnewversion.presentation.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apiimgflipnewversion.databinding.FragmentHomeBinding
import com.example.apiimgflipnewversion.domain.model.Meme
import com.example.apiimgflipnewversion.presentation.viewModel.MemeViewModel

import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {

    private val memeViewModel: MemeViewModel by viewModel()

    // private val retrofitService = Common.retrofitService
    private val memeAdapter = MemeAdapter()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        memeViewModel.getAllMemesDto().observe(viewLifecycleOwner, { memeLivData ->
            memeLivData?.let { memeList ->
                memeAdapter.setMemeList(memeList)
            }
        })
        binding.recyclerView.apply {
            context?.let {
                layoutManager =
                    LinearLayoutManager(it)
                setHasFixedSize(true)
                adapter = memeAdapter
            }
        }

        return binding.root

    }


}