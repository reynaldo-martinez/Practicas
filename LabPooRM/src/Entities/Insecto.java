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
public class Insecto extends Mascota {
    private String especieInsecto;
    private String venenoso;

    public Insecto(String especieInsecto, String venenoso, String nombre, String color, String tamaño, String genero, String tipoAnimal) {
        super(nombre, color, tamaño, genero, tipoAnimal);
        this.especieInsecto = especieInsecto;
        this.venenoso = venenoso;
        this.tipoAnimal=tipoAnimal;
    }
    
    public String sonido(){
        return "NO DEFINIDO";
    }
    
    public String Comer(){
        return this.getNombre() + " tiene mucha hambre, quiere comer desechos";
    }
    
    @Override
    public String aparearse(){
        return "Buscando pareja para " + this.getNombre();
    }


    /**
     * @return the especieInsecto
     */
    public String getEspecieInsecto() {
        return especieInsecto;
    }

    /**
     * @param especieInsecto the especieInsecto to set
     */
    public void setEspecieInsecto(String especieInsecto) {
        this.especieInsecto = especieInsecto;
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
