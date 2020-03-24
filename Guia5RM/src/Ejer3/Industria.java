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
public class Industria extends Empresa {
    public int cantMaquinas;

    public Industria(int cantMaquinas, String nombre, String tipo, String años) {
        super(nombre, tipo, años);
        this.cantMaquinas = cantMaquinas;
    }
    
    public String iniciando(){
        return "Encendiendo maquinaria";
    }
  
}
