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
public class DemoClass {
    public static void main(String [] args)
    {
        PerahuMotor PM = new PerahuMotor(5, 2, 15, 2);
        PerahuLayar PL = new PerahuLayar(10, 15, 25, 3);
        KapalPesiar KP = new KapalPesiar(50, 100, 120, 10);
        
        System.out.println("==== DATA PERAHU MOTOR ====");
        System.out.println(PM.getVolume());
        System.out.println(PM.getMesin());
        
        System.out.println("==== DATA PERAHU LAYAR ====");
        System.out.println(PL.getVolume());
        System.out.println(PL.getLayar());
        
        System.out.println("==== DATA KAPAL PESIAR ====");
        System.out.println(KP.getVolume());
        System.out.println(KP.getLantai());
    }
}
