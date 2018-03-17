package com.company;

import com.company.entity.BangunDatar;
import com.company.entity.Lingkaran;
import com.company.entity.PersegiPanjang;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<BangunDatar> bangunDatars = new ArrayList<>();

        bangunDatars.add(new PersegiPanjang("Persegi Kecil","cm",4,5));
        bangunDatars.add(new Lingkaran("Lingkaran kecil","cm",2.2));
        bangunDatars.add(new PersegiPanjang("Persegi Besr","m",10,7));
        bangunDatars.add(new Lingkaran("Lingkaran Kecil","m",4.4));

        for (int i = 0; i <bangunDatars.size() ; i++) {


            System.out.println(
                        "Nama Bangun data:"+bangunDatars.get(i).getNama()+"\n"+
                        "satuan:"+bangunDatars.get(i).getSatuan()+"\n"+
                        "luas:"+bangunDatars.get(i).hitungLuas()+"\n"+
                        "keliling:"+bangunDatars.get(i).hitungKeliling()+"\n"


            );
        }





    }
}
