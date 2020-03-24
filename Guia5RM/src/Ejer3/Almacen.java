/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3;

/**
 *
 * @author jose reynaldo
 */
public class Almacen extends Empresa{
    public int cantArticulos;

    public Almacen(int cantArticulos, String nombre, String tipo, String años) {
        super(nombre, tipo, años);
        this.cantArticulos = cantArticulos;
    }
    
    public String darBienvenida(){
        return "Bienvenido comprador, pase adelante";
    }
}
