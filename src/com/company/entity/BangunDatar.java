package com.company.entity;

import com.company.interfaces.Gambar;
import com.company.interfaces.Perhitungan;

public class BangunDatar implements Perhitungan,Gambar {

    private String nama;
    private String satuan;

    public BangunDatar(String nama, String satuan) {
        this.nama = nama;
        this.satuan = satuan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    @Override
    public void mulaiGambar(int gambar) {

    }

    @Override
    public double hitungLuas() {
        return 0;
    }

    @Override
    public double hitungKeliling() {
        return 0;
    }
}
