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
public class Gerente extends Empleado {
    public int añosGerente = 12;
   public Empleado e1;
   public Empleado e2;
   public Empleado e3;

    public Gerente(Empleado e1,Empleado e2, Empleado e3, String nombre, String apellido, String dui) {
        super(nombre, apellido, dui);
        this.e1 = e1;
        this.e2=e2;
        this.e3=e3;
    }
    
}
