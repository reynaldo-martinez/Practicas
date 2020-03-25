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
public class EmpleadoComision extends Empleado {
    
    private double cantVentas;

    public EmpleadoComision(double cantVentas, String nombre, int edad, String dui) {
        super(nombre, edad, dui);
        this.cantVentas = cantVentas;
    }
    
    
     @Override
     public String saludar(){
      return "Hola, soy un empleado por comision y mi numero de ventas hechas es : "+ this.getCantVentas()+ " (Metodo de instancia redefinido)";
    }
    
    
    public static String saludarStatic(){
        return "Hola, soy un empleado por comision (Metodo de clase)";
    
    }

    public double getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(double cantVentas) {
        this.cantVentas = cantVentas;
    }
    
    
}
