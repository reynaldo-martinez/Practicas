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
public class Ave extends Mascota {

  
    private String tipoPajaro;
    private String comida;

     public Ave(String tipoPajaro, String comida, String nombre, String color, String tamaño, String genero, String tipoAnimal) {
        super(nombre, color, tamaño, genero, tipoAnimal);
        this.tipoPajaro = tipoPajaro;
        this.comida = comida;
        this.tipoAnimal = tipoAnimal;
    }
     public String sonido(){
        return "TIIU TIIIU TIIIU";
    }
    
    public String Comer(){
        return this.getNombre() + " tiene mucha hambre, quiere comer";
    }
     @Override
    public String aparearse(){
        return "Buscando pareja para " + this.getNombre();
    }

    /**
     * @return the tipoPajaro
     */
    public String getTipoPajaro() {
        return tipoPajaro;
    }

    /**
     * @param tipoPajaro the tipoPajaro to set
     */
    public void setTipoPajaro(String tipoPajaro) {
        this.tipoPajaro = tipoPajaro;
    }

    /**
     * @return the comida
     */
    public String getComida() {
        return comida;
    }

    /**
     * @param comida the comida to set
     */
    public void setComida(String comida) {
        this.comida = comida;
    }
    
}
