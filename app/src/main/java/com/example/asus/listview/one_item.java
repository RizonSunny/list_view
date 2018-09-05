package com.example.asus.listview;

public class one_item {

    private String name;
    private int imgid;
    private int number;

    public one_item( String name, int imgid, int number) {
        this.name = name;
        this.imgid = imgid;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getImgid() {
        return imgid;
    }

    public int getNumber() {
        return number;
    }
}
