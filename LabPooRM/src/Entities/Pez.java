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
public class Pez extends Mascota {
    
    private String alimento;
    private String tipoPez;

    public Pez(String alimento, String tipoPez, String nombre, String color, String tamaño, String genero, String tipoAnimal) {
        super(nombre, color, tamaño, genero, tipoAnimal);
        this.alimento = alimento;
        this.tipoPez = tipoPez;
        this.tipoAnimal = tipoAnimal;
    }
    
    public String sonido(){////////////////////////////////
        return "GLUGLUGLU";
    }
    
    public String Comer(){
        return this.getNombre() + " tiene mucha hambre, quiere comer migas de pan";
    }
    
    @Override
    public String aparearse(){
        return "Buscando pareja para " + this.getNombre();
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

    /**
     * @return the tipoPez
     */
    public String getTipoPez() {
        return tipoPez;
    }

    /**
     * @param tipoPez the tipoPez to set
     */
    public void setTipoPez(String tipoPez) {
        this.tipoPez = tipoPez;
    }
    
    
   
    
}
