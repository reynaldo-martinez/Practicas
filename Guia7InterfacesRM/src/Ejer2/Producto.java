/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author rey
 */
public class Producto implements Impuesto, Caducidad {

    public double costo;
    public String fechaCaducidad;
    public double impuestoIva;
    public Double total;
    @Override
    public double calcImpuesto(double costo) {
       return costo * 0.13;
    }

    @Override
    public double calcTotal(double costo) {
       return this.costo + this.impuestoIva;
    }

    @Override
    public String fecha() {
       
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMM/YYYY");
        return formatoFecha.format(fecha);
    
    }
    
    
}
