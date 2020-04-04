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
public class Reptil extends Mascota {
    private String especieReptil;
    private String venenoso;

    public Reptil(String especieReptil, String venenoso, String nombre, String color, String tamaño, String genero, String tipoAnimal) {
        super(nombre, color, tamaño, genero, tipoAnimal);
        this.especieReptil = especieReptil;
        this.venenoso = venenoso;
        this.tipoAnimal=tipoAnimal;
    }
    
    public String sonido(){
        return "sssssssss";
    }
    
    public String Comer(){
        return this.getNombre() + " tiene mucha hambre, cualquier cosa";
    }
    
    @Override
    public String aparearse(){
        return "Buscando pareja para " + this.getNombre();
    }


    /**
     * @return the especieReptil
     */
    public String getEspecieReptil() {
        return especieReptil;
    }

    /**
     * @param especieReptil the especieReptil to set
     */
    public void setEspecieReptil(String especieReptil) {
        this.especieReptil = especieReptil;
    }

    /**
     * @return the venenoso
     */
    public String getVenenoso() {
        return venenoso;
    }

    /**
     * @param venenoso the venenoso to set
     */
    public void setVenenoso(String venenoso) {
        this.venenoso = venenoso;
    }
    
    
    
    
}
