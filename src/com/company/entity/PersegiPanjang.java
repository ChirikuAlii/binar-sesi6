package com.company.entity;

public class PersegiPanjang extends BangunDatar {

    double panjang;
    double lebar;

    public PersegiPanjang(String nama, String satuan , double panjang , double lebar) {
        super(nama, satuan);
        this.panjang=panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public void mulaiGambar(int gambar) {

    }

    @Override
    public double hitungLuas() {
        return panjang*lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2*(panjang+lebar);
    }

}
