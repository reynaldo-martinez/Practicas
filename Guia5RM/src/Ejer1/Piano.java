/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer1;

/**
 *
 * @author jose reynaldo
 */
public class Piano extends InstrumentoMusical {
    public String tipo;

    public Piano(String tipo, String nombre, String color, String tamaño) {
        super(nombre, color, tamaño);
        this.tipo = tipo;
    }
    
}
