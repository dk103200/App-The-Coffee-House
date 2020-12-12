package com.example.thecoffeehouse.model_adapter;

import android.widget.ImageView;

import java.io.Serializable;

public class DoUong implements Serializable {
    private int hinh_241;
    private String ten_241;
    private String gia_241;

    public int getHinh() {
        return hinh_241;
    }

    public ImageView setHinh(int hinh_241) {
        this.hinh_241 = hinh_241;
        return null;
    }

    public String getTen() {
        return ten_241;
    }

    public void setTen(String ten_241) {
        this.ten_241 = ten_241;
    }

    public String getGia() {
        return gia_241;
    }

    public void setGia(String gia_241) {
        this.gia_241 = gia_241;
    }

    public DoUong(int hinh_241, String ten_241, String gia_241) {
        this.hinh_241 = hinh_241;
        this.ten_241 = ten_241;
        this.gia_241 = gia_241;
    }

    public DoUong() {
    }
}
