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
public class PerahuLayar extends Ship{
    private int JumlahLayar;

    //Constructor
    public PerahuLayar(int lebar, int tinggi, int panjang, int JumlahLayar) {
        super(lebar, tinggi, panjang);
        this.JumlahLayar = JumlahLayar;
    }

    public int getJumlahLayar() {
        return JumlahLayar;
    }

    public void setJumlahLayar(int JumlahLayar) {
        this.JumlahLayar = JumlahLayar;
    }
    
    public String getLayar() {
        return  JumlahLayar + " Layar";
    }
    
}
