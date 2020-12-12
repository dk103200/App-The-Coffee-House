package com.example.thecoffeehouse.bottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.thecoffeehouse.MainActivity;
import com.example.thecoffeehouse.Notify;
import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.UuDai;
import com.example.thecoffeehouse.UuDaiAdapter;

import java.util.ArrayList;

public class Tintuc extends Fragment implements View.OnClickListener {
    private View view_241;
    private MainActivity mainActivity_241;
    ImageView img1_241, img2_241;
    RelativeLayout rl1_241, rl2_241, rl3_241;
    ArrayList<UuDai> listUuDai_241;


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view_241 = inflater.inflate(R.layout.fragment_navigation_tintuc, container, false);


        img1_241 = view_241.findViewById(R.id.imageNotify);
        img1_241.setOnClickListener(this);
        img2_241 = view_241.findViewById(R.id.imageAdd);
        img2_241.setOnClickListener(this);


        rl1_241 = view_241.findViewById(R.id.relativeTichdiem);
        rl2_241 = view_241.findViewById(R.id.relativeDathang);
        rl3_241 = view_241.findViewById(R.id.relativeCoupon);
        rl1_241.setOnClickListener(this);
        rl2_241.setOnClickListener(this);
        rl3_241.setOnClickListener(this);


        listUuDai_241 = new ArrayList<>();

        listUuDai_241.add(new UuDai("Single Day-Nhà mời 3 ly ngon nhất ngất ngây chỉ 111k. Nhập mã SAPCOBO tại app. Nhà mời ngay ưu đãi...",R.drawable.uudai1));
        listUuDai_241.add(new UuDai("Nhà mời 25%, PICKUP nha PICKUP-Chủ động đến lấy, không chờ đợi. Trải nghiệm ngay tính năng mới...",R.drawable.uudai2));
        listUuDai_241.add(new UuDai("Ghé Nhà Càng Nhiều, Hoàn Tiền Càng Cao Giờ đây mỗi lần trải nghiệm tại Nhà của bạn đều có cơ hội được hoàn tiền ngay...",R.drawable.uudai3));
        listUuDai_241.add(new UuDai( "Mua 3 Tặng 1-Mời Nhóm Mình Chung Vui Chỉ cần nhập mã CUNGVUI qua app. Nhà mời ngay ưu đãi Mua 3 Tặng 1...",R.drawable.uudai11));
        initUuDai(R.id.rcv_uudai,listUuDai_241);
        initUuDai(R.id.rcv_uudai2,listUuDai_241);
        return view_241;
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageNotify) {
            Intent dsp = new Intent(Tintuc.this.getActivity(), Notify.class);
            startActivity(dsp);
        }

        if (v.getId() == R.id.relativeTichdiem) {
            Toast.makeText(this.getActivity(), "Tích điểm", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeDathang) {
            Toast.makeText(this.getActivity(), "Đặt hàng ", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeCoupon) {
            Toast.makeText(this.getActivity(), "Coupon", Toast.LENGTH_SHORT).show();
        }
    }

    public void initUuDai(int id,ArrayList lv) {
        RecyclerView rcv_uudai = view_241.findViewById(id);
        rcv_uudai.setHasFixedSize(true);
        GridLayoutManager gird = new GridLayoutManager(mainActivity_241, 1, GridLayoutManager.HORIZONTAL, false);
        rcv_uudai.setLayoutManager(gird);
        UuDaiAdapter uuDaiAdapter = new UuDaiAdapter(lv, mainActivity_241, R.layout.item_uudai);
        rcv_uudai.setAdapter(uuDaiAdapter);
    }

}