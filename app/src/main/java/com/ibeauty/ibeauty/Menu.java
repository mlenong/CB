package com.ibeauty.ibeauty;

/**
 * Created by Anang on 25/10/2016.
 */

public class Menu {
    private String daftar_judul, daftar_deskripsi;
    private int daftar_icon;


    public Menu() {
    }

    public Menu(String daftar_judul, String daftar_deskripsi, int daftar_icon) {
        this.daftar_judul = daftar_judul;
        this.daftar_deskripsi = daftar_deskripsi;
        this.daftar_icon = daftar_icon;


    }

    public String getDaftar_judul() {
        return daftar_judul;
    }

    public void setDaftar_judul(String name) {
        this.daftar_judul = name;
    }


    public String getDaftar_deskripsi() {
        return daftar_deskripsi;
    }

    public void setDaftar_deskripsi(String daftar_deskripsi) {
        this.daftar_deskripsi = daftar_deskripsi;
    }

    public int getDaftar_icon() {
        return daftar_icon;
    }

    public void setDaftar_icon(int daftar_icon) {
        this.daftar_icon = daftar_icon;
    }
}

