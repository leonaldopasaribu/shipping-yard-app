/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShippingYard;

/**
 *
 * @author leona
 */
 abstract public class Ship {
    private int lebar;
    private int panjang;
    private int tinggi;
    
    //Constructor
    public Ship(int lebar, int panjang, int tinggi) {
        this.lebar = lebar;
        this.panjang = panjang;
        this.tinggi = tinggi;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public String getVolume() {
        return  lebar * tinggi * panjang + " m3";
    }
}