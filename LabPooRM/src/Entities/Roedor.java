/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
/**
 * @author rey
 */
public class Roedor extends Mascota {
    private String especieRoedor;
    private String alimento;

    public Roedor(String especieRoedor, String alimento, String nombre, String color, String tamaño, String genero, String tipoAnimal) {
        super(nombre, color, tamaño, genero, tipoAnimal);
        this.especieRoedor = especieRoedor;
        this.alimento = alimento;
        this.tipoAnimal = tipoAnimal;
    }
    
    public String sonido(){
        return "TRRRRR TRRRRR";
    }
    
    public String Comer(){
        return this.getNombre() + " tiene mucha hambre, quiere comer migas hiervas";
    }
     @Override
    public String aparearse(){
        return "Buscando pareja para " + this.getNombre();
    }

    /**
     * @return the especieRoedor
     */
    public String getEspecieRoedor() {
        return especieRoedor;
    }

    /**
     * @param especieRoedor the especieRoedor to set
     */
    public void setEspecieRoedor(String especieRoedor) {
        this.especieRoedor = especieRoedor;
    }

    /**
     * @return the alimento
     */
    public String getAlimento() {
        return alimento;
    }

    /**
     * @param alimento the alimento to set
     */
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    

    
}
