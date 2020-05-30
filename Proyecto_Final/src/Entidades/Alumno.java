/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author rey
 */
public class Alumno extends Persona {
    
    private String carnet;

    public Alumno(String carnet, String nombre, String apellido) {
        super(nombre, apellido);
        this.carnet = carnet;
    }

    /**
     * @return the carnet
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    
}
