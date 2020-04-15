/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3;

/**
 *
 * @author rey
 */
public abstract class PrendaVestir {
    public String talla;
    public String color;

    public PrendaVestir(String talla, String color) {
        this.talla = talla;
        this.color = color;
    }
    
    
    public abstract String vestir();
   
    
}
