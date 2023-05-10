package com.hafizsyahputra.utshafiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hafizsyahputra.utshafiz.databinding.FragmentProfilBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfilBinding? = null
    private lateinit var binding: FragmentProfilBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        if (_binding == null){
            _binding = FragmentProfilBinding.inflate(layoutInflater, container, false)
            binding = _binding as FragmentProfilBinding
        }
        return binding.root
    }

}