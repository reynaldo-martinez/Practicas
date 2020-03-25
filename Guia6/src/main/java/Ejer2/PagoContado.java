/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2;

/**
 *
 * @author jose reynaldo
 */
public class PagoContado extends Pago {

    public PagoContado(String nombre, String banco) {
        super(nombre, banco);
    }
    
    @Override
    public double pago(double monto){
       double sub=0, total=0;
       sub = monto *0.13;
       total = monto + sub;
       
       return total;
      
        
    }
    public String mensaje(){
        return "Usted debe acercarse a al banco a pagar: ";
    }

}
