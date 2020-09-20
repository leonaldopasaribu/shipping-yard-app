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
public class KapalPesiar extends Ship{
    private int JumlahLantai;
    
    //Constructor
    public KapalPesiar(int lebar, int tinggi, int panjang, int JumlahLayar) {
        super(lebar, tinggi, panjang);
        this.JumlahLantai = JumlahLantai;
    }

    public int getJumlahLantai() {
        return JumlahLantai;
    }

    public void setJumlahLantai(int JumlahLantai) {
        this.JumlahLantai = JumlahLantai;
    }
    
    public String getLantai() {
        return  JumlahLantai + " Lantai";
    }
    
}
