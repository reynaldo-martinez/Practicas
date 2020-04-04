/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author rey
 */
public class Mascota {
    
    private String nombre;
    private String color;
    private String tamaño;
    private String genero;
    public String tipoAnimal;

    public Mascota(String nombre, String color, String tamaño, String genero, String tipoAnimal) {
        this.nombre = nombre;
        this.color = color;
        this.tamaño = tamaño;
        this.genero = genero;
        this.tipoAnimal = tipoAnimal;
    }

    public String aparearse(){
        return "Buscando pareja";
    }
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the tamaño
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
      public String getGenero() {
        return genero;
    }

    /**
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
