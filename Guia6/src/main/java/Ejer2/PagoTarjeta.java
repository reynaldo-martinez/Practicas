/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2;

import javax.swing.JOptionPane;

/**
 *
 * @author jose reynaldo
 */
public class PagoTarjeta extends Pago{
    private String nTarjeta;
    private double montoTarjeta=2000;

    public PagoTarjeta(String nTarjeta, String nombre, String banco) {
        super(nombre, banco);
        this.nTarjeta = nTarjeta;
    }

    
    
     @Override
    public double pago(double monto){
       double sub=0, total=0;
       sub = monto *0.13;
       total = monto + sub;
        this.montoTarjeta = montoTarjeta - monto;
         if (this.montoTarjeta <= 0) {
             JOptionPane.showMessageDialog(null, "Usted no posee capital en su tarjeta");
         }
       return total;
       
      
       
       
      
        
    }
    public String mensaje(){
        return "Usted debe acercarse a al banco a pagar: ";
    }
    /**
     * @return the nTarjeta
     */
    public String getnTarjeta() {
        return nTarjeta;
    }

    /**
     * @param nTarjeta the nTarjeta to set
     */
    public void setnTarjeta(String nTarjeta) {
        this.nTarjeta = nTarjeta;
    }
    
    
    
}
