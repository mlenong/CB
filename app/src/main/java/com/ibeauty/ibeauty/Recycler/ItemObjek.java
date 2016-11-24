package com.ibeauty.ibeauty.Recycler;

/**
 * Created by Anang on 07/11/2016.
 */

public class ItemObjek {

    private String name, harga;
    private int image;
    private boolean isSelected;

    public ItemObjek(String name,String harga, int image) {
        this.name = name;
        this.harga = harga;
        this.image = image;
    }

    public ItemObjek(String name, String harga, int image, boolean isSelected) {
        this.name = name;
        this.harga = harga;
        this.image = image;
        this.isSelected = isSelected;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        this.isSelected = selected;
    }
}
