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
public class EmpleadoHoras extends Empleado {
    
    private int horas;

    public EmpleadoHoras(int horas, String nombre, int edad, String dui) {
        super(nombre, edad, dui);
        this.horas = horas;
    }
    
     @Override
    public String saludar(){
     return "Hola, soy un empleado por horas y he trabado : "+ this.getHoras()+ " horas (Metodo de instancia redefinido)";
    }
    
    
    public static String saludarStatic(){
        return "Hola, soy un empleado por horas (Metodo de clase)";
    
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
}
