package PersegiPanjang;

public class Balok extends PersegiPanjang {
    private int tinggi;
    
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public int getTinggi() {
        return tinggi;
    }
    
    public int getVolume() {
        return getPanjang() * getLebar()* getTinggi();
    }
    
    public int getLuasPermukaan() {
        return 2 * (getPanjang() * getLebar() + getPanjang() * getTinggi() + getLebar() * getTinggi());
    }
}
