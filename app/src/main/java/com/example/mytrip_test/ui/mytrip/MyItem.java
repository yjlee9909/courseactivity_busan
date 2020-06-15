package com.example.mytrip_test.ui.mytrip;

import android.graphics.drawable.Drawable;

public class MyItem {

    private Drawable img;
    private String name;
    private String contents;

    public Drawable getImg() {
        return img;
    }

    public void setIcon(Drawable img) {
        this.img = img;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

}
