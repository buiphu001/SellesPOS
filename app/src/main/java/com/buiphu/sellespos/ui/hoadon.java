package com.buiphu.sellespos.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;

import com.buiphu.sellespos.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class hoadon extends Fragment {
    // Khai báo
    Button btnHoaDonCho, btnThanhToan;
    Spinner spnLoaiSP;
    ImageButton imgbtnBarcode, imgbtnSearch;
    ListView lvSanPham;

    public hoadon() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Viết code khi hiển thị view
        Anhxa();

        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hoadon, container, false);
    }//------------

    private void Anhxa() {
        btnHoaDonCho = (Button) getActivity().findViewById(R.id.btnHoaDonCho_HD);
        btnThanhToan = (Button) getActivity().findViewById(R.id.btnThanhToan_HD);
        spnLoaiSP = (Spinner) getActivity().findViewById(R.id.spnLoaiSP_HD);
        imgbtnBarcode = (ImageButton) getActivity().findViewById(R.id.imgbtnBarcode_HD);
        imgbtnSearch = (ImageButton) getActivity().findViewById(R.id.imgbtnSearch_HD);
        lvSanPham = (ListView) getActivity().findViewById(R.id.lvSanPham_HD);

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Viết code khi khởi tạo (ghi các biến, mảng chính)

    }//-----------

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Viết code khi khởi tạo màn hình (thực hiện các công việc của view)
    }//-------------------------------------------------------------------------------

}
