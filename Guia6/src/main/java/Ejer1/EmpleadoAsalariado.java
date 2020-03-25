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
public class EmpleadoAsalariado extends Empleado {
    
    private double salario;

    public EmpleadoAsalariado(double salario, String nombre, int edad, String dui) {
        super(nombre, edad, dui);
        this.salario = salario;
    }
    
    
    @Override
    public String saludar(){
     return "Hola, soy un empleado Asalariado y mi salario es de : "+ this.getSalario() + " (Metodo de instancia redefinido)";
    }
    
    
    public static String saludarStatic(){
        return "Hola, soy un empleado asalariado (Metodo de clase)";
    
    }
    
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
