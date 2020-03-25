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
public class Empleado {
    private String nombre;
    private int edad;
    private String dui;

    public Empleado(String nombre, int edad, String dui) {
        this.nombre = nombre;
        this.edad = edad;
        this.dui = dui;
    }
    
    public String saludar(){
    return "Hola soy un empleado";
    }
    
    public static String saludarStatic(){
        return "Hola, soy un empleado (Metodo de clase)";
    
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDui() {
        return dui;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }
    
}
