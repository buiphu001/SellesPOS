package com.buiphu.sellespos.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.buiphu.sellespos.R;
import com.buiphu.sellespos.databinding.FragmentMathangBinding;

public class mathang extends Fragment {
    // Khai báo
    FragmentMathangBinding binding;

    public mathang() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_mathang, container, false);
        binding = FragmentMathangBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}
