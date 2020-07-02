package com.buiphu.sellespos.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.buiphu.sellespos.MainActivity;
import com.buiphu.sellespos.R;
import com.buiphu.sellespos.databinding.FragmentHoadonBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class hoadon extends Fragment {
    // Khai báo
    FragmentHoadonBinding binding;

    public hoadon() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_hoadon, container, false);
        binding = FragmentHoadonBinding.inflate(inflater,container,false);


        return binding.getRoot();
    }//------------

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Viết code khi khởi tạo (ghi các biến, mảng cố định)
        //MainActivity.rMenu=R.menu.hoadon;
    }//-----------

//    @Override
//    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
//        super.onCreateOptionsMenu(menu, inflater);
//
//    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Viết code khi khởi tạo màn hình (thực hiện các công việc của view)

    }//-------------------------------------------------------------------------------

}
