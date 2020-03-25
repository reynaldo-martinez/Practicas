/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3;

/**
 *
 * @author jose reynaldo
 */
public class Videos extends ArchivoMultimedia {
    
    private String nombre;
    private String duracion;

    public Videos(String nombre, String duracion, String formato, String fechaCreacion) {
        super(formato, fechaCreacion);
        this.nombre = nombre;
        this.duracion = duracion;
    }
    
     @Override
     public String reproducir(){
        return "El archivo " + this.getNombre() + " se está reproduciendo en su visualizador de videos";
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
     * @return the duracion
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
    
    
}
