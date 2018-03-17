package com.company.entity;

public class Lingkaran extends BangunDatar {

    private double jariJari;

    public Lingkaran(String nama, String satuan,double jariJari) {
        super(nama, satuan);
        this.jariJari=jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void mulaiGambar(int gambar) {
        System.out.println("Menggambar dengan kode:"+gambar);
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari *jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2*Math.PI*jariJari;
    }




}
