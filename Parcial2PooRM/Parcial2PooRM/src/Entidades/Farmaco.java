package Entidades;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rey
 */
public class Farmaco extends Producto  {
    private double cantCompra;
    

    public Farmaco(String tipo, String nombreProd, double precio, int existencia) {
        super(tipo, nombreProd, precio, existencia);
               
    }
    
    //CONSTRUCTOR PARA LOS ITEMS DE LA LISTA DE PRODCTOS VENDIDOS
   
    
    
    
    

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public double getPrecio() {
        return super.getPrecio(); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void setNombreProd(String nombreProd) {
        super.setNombreProd(nombreProd); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombreProd() {
        return super.getNombreProd(); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipo() {
        return super.getTipo(); //To change body of generated methods, choose Tools | Templates.
    }

   

   
    
    
}
