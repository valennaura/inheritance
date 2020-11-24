package PersegiPanjang;

import java.util.Scanner;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lebar, tinggi, panjang;
        System.out.println("Masukkan nilai panjang");
        panjang = sc.nextInt();
        System.out.println("Masukkan nilai lebar");
        lebar = sc.nextInt();
        System.out.println("Masukkan nilai tinggi");
        tinggi = sc.nextInt();
        
        Balok b = new Balok();
        b.setPanjang(panjang);
        b.setLebar(lebar);
        b.setTinggi(tinggi);
        
        System.out.println("======================================");
        System.out.println("Panjang : " + b.getPanjang()); //Mengambil nilai dari method getPanjang
        System.out.println("Lebar : " + b.getLebar()); //Mengambil nilai dari method getLebar
        System.out.println("Tinggi : " + b.getTinggi()); //Mengambil nilai dari method getTinggi
        System.out.println("=======================================");
        System.out.println("Volume Balok : " + b.getVolume()); //Mengambil nilai dari method getVolume
        System.out.println("Luas Permukaan Balok : " + b.getLuasPermukaan()); //Mengambil nilai dari method getLuasPemukaan
        
    }
}
