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
public class Presidente extends Empleado {
   public Gerente g1;
    public Gerente g2;

    public Presidente(Gerente g1, Gerente g2, String nombre, String apellido, String dui) {
        super(nombre, apellido, dui);
        this.g1 = g1;
        this.g2 = g2;
    }
    
}
