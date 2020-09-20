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
public class PerahuMotor extends Ship{
    private int JumlahMesin;
    
    //Constructor
    public PerahuMotor(int lebar, int tinggi, int panjang, int JumlahMesin) {
        super(lebar, tinggi, panjang);
        this.JumlahMesin = JumlahMesin;
    }

    public int getJumlahMesin() {
        return JumlahMesin;
    }

    public void setJumlahMesin(int JumlahMesin) {
        this.JumlahMesin = JumlahMesin;
    }
   
    public String getMesin() {
        return  JumlahMesin + " Mesin";
    }
    
    
}
