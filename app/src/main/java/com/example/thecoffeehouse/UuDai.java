package com.example.thecoffeehouse;

public class UuDai {
    public String name;
    public Integer img;

    public UuDai() {
    }

    public UuDai(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
